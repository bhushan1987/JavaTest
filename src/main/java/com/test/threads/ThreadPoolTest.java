package com.test.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Runnable
{
    private String name;

    public Task(String s) {
        name = s;
    }

    public void run() {
        try {
            System.out.println("Initialized Task > " + name );

            Thread.sleep(5000);

            System.out.println("Completed Task > " + name);
        }

        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPoolTest
{
    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /* // creates five tasks
        Runnable r1 = new Task("task 1");
        Runnable r2 = new Task("task 2");
        Runnable r3 = new Task("task 3");
        Runnable r4 = new Task("task 4");
        Runnable r5 = new Task("task 5");

        // creates a thread pool with MAX_T no. of  
        // threads as the fixed pool size(Step 2) 
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute (Step 3) 
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // pool shutdown ( Step 4) 
        pool.shutdown();
*/

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello World";
        } );

        String result = future.get();
        System.out.println(result);
        executorService.shutdown();
    }
} 