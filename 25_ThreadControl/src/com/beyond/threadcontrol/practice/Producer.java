package com.beyond.threadcontrol.practice;

public class Producer extends Thread {


    private final Storage storage;


    public Producer(Storage storage) {

        this.storage = storage;
    }

    @Override
    public void run() {
        // run메소드 재정의

        for(int i = 1; i <= 10; i++) {

            try {

                storage.setProduct(i);
                Thread.sleep(500);
                // thread를 매개값에 지정된 시간만큼 일시 정지시키는 메소드

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }




}
