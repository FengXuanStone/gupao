package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/21
 * Time: 9:56
 * Description: No Description
 */
public class ThreadPoolTest implements Runnable {

    static ExecutorService executorService1 = Executors.newSingleThreadExecutor();
    ExecutorService executorService2 = Executors.newFixedThreadPool(3);
    ExecutorService executorService3 = Executors.newCachedThreadPool();
    ExecutorService executorService4 = Executors.newScheduledThreadPool(5);

    public static void main(String[] args) {
        executorService1.execute(new ThreadPoolTest());
    }

    @Override
    public void run() {

    }
}
