package com.imyiren.part1.yield;

/**
 * className: MyThread
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 15:43
 */
public class MyThread extends Thread {

    public MyThread(){

    }

    public MyThread(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long count = 0;
        for (int i = 0; i < 5000; i++) {
            Thread.yield();
            count = count + (i + 1);
            printMsg(i + "");

        }
        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "用时：" + (endTime - beginTime) + "毫秒！");
    }

    synchronized public void printMsg(String str){
        System.out.println(Thread.currentThread().getName() +": MyThread " + str +" =>");
    }
}
