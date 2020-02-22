package org.example.reentratlocktest;

import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/18
 * Time: 14:01
 * Description: No Description
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        new Thread(() -> {
            countDownLatch.countDown();
        }).start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
