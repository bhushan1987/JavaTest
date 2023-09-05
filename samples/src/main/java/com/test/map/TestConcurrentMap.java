package com.test.map;

import java.util.Iterator;
import java.util.Random;

/**
 * @Author bhushank
 */
public class TestConcurrentMap {
    public static void main(String[] args) {
        SimpleConcurrentHashMap<String, Long> hashMap = new SimpleConcurrentHashMap();
        for(int i = 0; i < 100; i++) {
            MyThreadProducer producer = new MyThreadProducer(hashMap);
            producer.start();
        }

        MyThreadConsumer consumer = new MyThreadConsumer(hashMap);
        consumer.start();
    }

    private static class MyThreadProducer extends Thread {
        private SimpleConcurrentHashMap<String, Long> myConcurrentMap;

        public MyThreadProducer(SimpleConcurrentHashMap<String, Long> myConcurrentMap) {
            super();
            this.myConcurrentMap = myConcurrentMap;
        }

        public void run() {
            while(true) {
                String key = "KEY-" + new Random().nextDouble();
                long value = new Random().nextLong();
                myConcurrentMap.put(key, value);
                System.out.println("Added Key = " + key + ",\tValue = " + value);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class MyThreadConsumer extends Thread {
        private SimpleConcurrentHashMap<String, Long> myConcurrentMap;

        public MyThreadConsumer(SimpleConcurrentHashMap<String, Long> myConcurrentMap) {
            super();
            this.myConcurrentMap = myConcurrentMap;
        }

        public void run() {
            while (true) {
                Iterator<SimpleConcurrentHashMap.BucketEntry> iterator = myConcurrentMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    SimpleConcurrentHashMap.BucketEntry next = iterator.next();
                    System.out.println(next.getKey() + "<------>" + next.getValue());
                    iterator.remove();
                }
                System.out.println("Map Size >> " + myConcurrentMap.entrySet().size());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}