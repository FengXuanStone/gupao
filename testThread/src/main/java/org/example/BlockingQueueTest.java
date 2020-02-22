package org.example;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/18
 * Time: 19:35
 * Description: No Description
 */
public class BlockingQueueTest {
    ArrayBlockingQueue<String> an = new ArrayBlockingQueue<>(10);
    {
        init();
    }

    private void init() {
        new Thread(() -> {
            while (true) {
                try {
                    String data = an.take();
                    System.out.println("receive data:" + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void addData(String data) throws InterruptedException {
        an.add(data);
        System.out.println("add data:" + data);
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueueTest blockingQueueTest = new BlockingQueueTest();
        for(int i = 0; i < 1000; i++) {
            blockingQueueTest.addData("data" + i);
        }
    }
}
