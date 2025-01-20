package com.beyond.thread.practice;

public class LoopRunnable implements  Runnable{


    // 추상 메서드 재정의


    @Override
    public void run() {

        for(int i=1;i<=100;i++){

            System.out.printf("%s[%d]: %d\n",Thread.currentThread().getName(),i, Thread.currentThread().getPriority());


        }
    }

}
