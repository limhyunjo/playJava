package com.beyond.threadcontrol.practice;

public class Consumer implements Runnable {
    
    
    private final Storage storage;


    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        // run 메소드 재정의
        for (int i = 0; i < 10; i++) {

            try {

                storage.getProduct(); // storage에 저장된 상품을 꺼내오도록 함

                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
}
