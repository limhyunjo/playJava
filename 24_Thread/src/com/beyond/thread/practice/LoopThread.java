package com.beyond.thread.practice;

/*
* 스레드를 생성 방법
*  1. Thread 클래스를 상속뱓는 방법
*
*
*  2. Runable 인터페이스를 구현하는 방법
*
* */
public class LoopThread extends Thread {

    // 재정의 단축키
    // ctrl + o
    // alt + insert 


    @Override // run 메소드 재정의
    public void run() {
        
        // 작업하고자 하는 코드를 작성한다
        for(int i=1;i<=100;i++){

            System.out.printf("%s[%d]: %d\n",Thread.currentThread().getName(),i, Thread.currentThread().getPriority());



        }
    }
}
