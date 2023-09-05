package com.test.map;

import java.util.*;

/**
 * @Author bhushank
 */
public class SimpleConcurrentHashMap<K,V> {
    private int initialCapacity = 10;
    private BucketEntry[] buckets;

    public SimpleConcurrentHashMap() {
        buckets = new BucketEntry[initialCapacity];
        initBuckets();
    }

    private void initBuckets() {
        for(int i=0; i<initialCapacity;i++) {
            buckets[i] = null;
        }
    }

    public BucketEntrySet entrySet() {
        BucketEntrySet entries = new BucketEntrySet(this);
        for(BucketEntry<K, V> bucketEntry: buckets) {
            if(bucketEntry != null) {
                entries.add(bucketEntry);
            }
        }
        return entries;
    }

    public V put(K key, V value) {
        if(key == null)
            throw new IllegalArgumentException("Null key not supported !");
        if(value == null)
            throw new IllegalArgumentException("Null value not supported !");

        int hash = hashIt(key);
        BucketEntry bucket = buckets[hash];
        if(bucket == null) {
            bucket = new BucketEntry(hash, key, value, null);
            buckets[hash] = bucket;
        }

        synchronized (bucket) { // this is concurrent hash map
            BucketEntry thisOne = bucket;
            if (ifOverwrite(thisOne, key, value)) {
                thisOne.setValue(value);
            } else {
                // traverse till the last node
                while(thisOne.getNext() != null) {
                    thisOne = thisOne.getNext();
                }
                // create new node and set thisOne's next = newOne
                BucketEntry<K, V> nextEntry = new BucketEntry(hash, key, value, null);
                thisOne.setNext(nextEntry);
            }
        }
        return value;
    }

    public V get(K key) {
        int hash = hashIt(key);
        BucketEntry<K, V> thisOne = buckets[hash];
        if(thisOne == null) {
            return null;
        } else {
            for(; thisOne != null; thisOne = thisOne.getNext()) {
                if(thisOne.getKey().equals(key)) {
                    return thisOne.getValue();
                }
            }
        }
        return null;
    }

    public V remove(K key) {
        V v = get(key);
        int bucketIndex = hashIt(key);
        BucketEntry bucketEntry = buckets[bucketIndex];
        if (bucketEntry != null && bucketEntry.key.equals(key)) {
            buckets[bucketIndex] = null;
        }
        return v;
    }


    private boolean ifOverwrite(BucketEntry<K,V> thisOne, K key, V value) {
        return thisOne.getKey().equals(key) && thisOne.getValue().equals(value);
    }

    private int hashIt(K key) {
        int hash = key.hashCode() % initialCapacity;
        if(hash < 0) {
            hash = hash * -1;
        }
        return hash; // so that we get the position between 0-size
    }

    public class BucketEntry<K,V> {
        final  int hash;
        final private K key;
        private V value;
        private BucketEntry<K,V> next;

        private BucketEntry(int hash, K key, V value, BucketEntry<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public BucketEntry<K, V> getNext() {
            return next;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setNext(BucketEntry<K, V> nextEntry) {
            this.next = nextEntry;
        }
    }

    public class BucketEntrySet extends HashSet<BucketEntry> {
        private SimpleConcurrentHashMap simpleConcurrentHashMap;
        public BucketEntrySet(SimpleConcurrentHashMap<K, V> kvSimpleConcurrentHashMap) {
            this.simpleConcurrentHashMap = kvSimpleConcurrentHashMap;
        }

        @Override
        public Iterator iterator() {
            SimpleConcurrentMapEntrySetIterator iterator = new SimpleConcurrentMapEntrySetIterator(simpleConcurrentHashMap, super.iterator());
            return iterator;
        }
    }

    public class SimpleConcurrentMapEntrySetIterator implements Iterator<BucketEntry> {
        private SimpleConcurrentHashMap concurrentHashMap;
        private Iterator<BucketEntry> iterator;
        private BucketEntry currentEntry;

        public SimpleConcurrentMapEntrySetIterator(SimpleConcurrentHashMap concurrentHashMap, Iterator<BucketEntry> iterator) {
            this.concurrentHashMap = concurrentHashMap;
            this.iterator = iterator;
        }

        public boolean hasNext() {
            return iterator.hasNext();
        }

        public BucketEntry next() {
            currentEntry = iterator.next();
            return currentEntry;
        }

        public void remove() {
            concurrentHashMap.remove(currentEntry.getKey());
            iterator.remove();
        }
    }
 }
