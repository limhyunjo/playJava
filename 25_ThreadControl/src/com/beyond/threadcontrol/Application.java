package com.beyond.threadcontrol;

import com.beyond.threadcontrol.practice.Consumer;
import com.beyond.threadcontrol.practice.Producer;
import com.beyond.threadcontrol.practice.Storage;

public class Application {

    public static void main(String[] args) {


        Storage storage = new Storage();

        Producer producer = new Producer(storage); // producer 스레드에 storate를 매개값으로 받아감

        Thread consumer = new Thread(new Consumer(storage)); // storage를 생성자로 넘겨줌

        // 두개의 스레드 producer, consumer가 storage라는 객체를 공유해서 사용

        producer.start();

        consumer.start(); //


    }
}
