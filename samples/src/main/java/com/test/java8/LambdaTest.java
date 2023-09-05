package com.test.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Testing efficiency of lambda and stream APIs. Comparing the performance with the traditional approaches.
 * @Author bhushank
 */
public class LambdaTest {

    public static void main(String[] args) {
        LambdaTest test = new LambdaTest();
        List<String> stringList = test.generateLargeStringList();

        test.traditionalWay(stringList);

        test.lambdaWay(stringList);
    }


    public void traditionalWay(List<String> stringList) {
        long startTime = System.currentTimeMillis();

        for(String str : stringList) {
            // some random string operations which may take time for executions
            str.substring(0, str.length()-2);
            str.contains("World");
            str.concat("Yo");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time to iterate traditional way: " + (endTime - startTime) + " ms.");
    }

    public void lambdaWay(List<String> stringList) {
        long startTime = System.currentTimeMillis();

        stringList.parallelStream().forEach((str) -> {
            // some random string operations which may take time for executions
            str.substring(0, str.length()-2);
            str.contains("World");
            str.concat("Yo");
        });

        long endTime = System.currentTimeMillis();

        System.out.println("Time to iterate Lambda way: " + (endTime - startTime) + " ms.");
    }

    public List<String> generateLargeStringList() {
        List<String> stringList = new ArrayList<>(10000000);
        for (int i = 0; i<10000000; i++) {
            stringList.add("Hello World " + i);
        }
        return stringList;
    }
}
