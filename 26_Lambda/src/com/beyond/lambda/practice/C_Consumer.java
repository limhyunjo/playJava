package com.beyond.lambda.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class C_Consumer {


    /*
    * Consumer
    *  - Consumer 표준 함수적 인터페이스는 리턴값이 없는 accept()라는 추상 메소드를 가지고 있다.
    *  - accept() 추상 메소드는 단지 매개값을 소비하는 역할을 한다
    *
    * */
    public void method1(){

        // Consumer<T> : T 타입의 객체를 받아서 소비한다, 리턴타입은 존재하지 않음
       // Consumer<String> consumer; // String 타입의 객체를 하나 받아서 소비 (어떻게 할지만 정해주면 됨)]]

     /*   consumer = (String str ) ->{

            System.out.println(str);

        };*/

        // 선언하고 하고 바로 사용
        Consumer<String> consumer= str -> System.out.println(str); // 축약
        
        // consumer는 accept를 사용해야 실행할 수있음
        consumer.accept("Consumer는 한 개의 매개값을 받아서 소비한다.");


        //BiConsumer<T, U> : T와 U 타입의 객체를 받아서 소비한다. Bi == binary
/*
        BiConsumer<String, String> biConsumer;
        // 2개의 string 값을 받아서 소비
        biConsumer = (String str1, String str2) ->{
            System.out.println(str1 + str2);
        };
*/

        BiConsumer<String, String> biConsumer = (str1, str2 )-> System.out.println(str1 + str2);

        biConsumer.accept("BiConsumer는", " 두 개의 매개값을 받아서 소비한다.");



        // DoubleConsumer : double 타입의 값을 받아서 소비한다.
        DoubleConsumer dConsumer;

        // dConsumer = number -> System.out.println(number);

       /* dConsumer = (double number)->{
            System.out.println(number);
        };

        dConsumer.accept(3.14);
         */
        dConsumer = System.out::println;
        dConsumer.accept(3.14);
        // 기본 타입의 컨슈머는 int, double, long만 있음


        // ObjIntConsumer : 2개의 매개값을 받아서 object(T타입), Integer 타입의 매개값을 받아서 소비한다 (객체, int 가져와서 소비)
        // T 타입의 객체와 int 타입의 값의 받아서 소비한다
      /*  ObjIntConsumer<String> objIntConsumer;

        objIntConsumer= (String str, int number)->{
            System.out.println("ObjIntConsumer");
            System.out.printf("%s %d\n", str, number);
        };*/

        ObjIntConsumer<String> objIntConsumer =(str, number)->{
            System.out.println("ObjIntConsumer");
            System.out.printf("%s %d\n", str, number);
        };


        objIntConsumer.accept("Java",21);



    }
}
