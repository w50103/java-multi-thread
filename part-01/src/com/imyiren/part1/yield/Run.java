package com.imyiren.part1.yield;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 15:47
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread("thread--0");
        thread.start();

        MyThread thread1 = new MyThread();
        thread1.start();
    }
}
