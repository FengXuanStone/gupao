package org.example.multiprocess;

import lombok.Synchronized;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/17
 * Time: 13:42
 * Description: No Description
 */
public class SyncDemo {

    public synchronized void demo() {

    }

    public void demo2() {
        synchronized (this) {

        }
    }

    public static void main(String[] args) {

    }
}
