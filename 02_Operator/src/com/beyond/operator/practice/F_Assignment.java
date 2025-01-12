package com.beyond.operator.practice;

public class F_Assignment {

    public void method1() {

        int number = 12;
        number += 3; // number = number+3
        // (복합대입연산자가 연산이 더 빠름)

        String str = "hello";

        System.out.println("number += 3 은(는) : " + number );

        number -= 5;

        System.out.println("number -= 5 는 : " + number);

        number *=6; // number =  number * 6;

        System.out.println("number *=6 는 : " + number);

        number /=3;
        System.out.println("number /=3 는 : " + number);

        number %=3;
        System.out.println("number %=3 는 : " + number);

        str += " world";

        System.out.println(str); // hello world
        // str += str + "world";




    }
}
