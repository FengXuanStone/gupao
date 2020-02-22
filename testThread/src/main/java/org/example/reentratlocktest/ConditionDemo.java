package org.example.reentratlocktest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/18
 * Time: 13:00
 * Description: No Description
 */
public class ConditionDemo {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public static void main(String[] args) {

    }
}

class ConditionWait implements Runnable {
    private Lock lock;
    private Condition condition;

    public void run() {

    }
}