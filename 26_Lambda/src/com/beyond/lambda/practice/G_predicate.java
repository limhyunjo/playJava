package com.beyond.lambda.practice;

import java.util.function.BiPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class G_predicate {


    /*
    * Predicate
    *  - Predicate 표준 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 test() 추상 메서드를 가지고 있다.
    *  - test() 추상 메소드는 매개값을 조사해서 true/ false를 리턴하는 역할을 한다
    * */

    public void method1(){

        // Predicate<T> :; T타입의 객체를 조사해서 true, 또는 false를 리턴한다
       /* Predicate<String> predicate;
        
        predicate = (String str) ->{
            return str.equals("홍길동");
        };*/

        Predicate<String> predicate = str -> str.equals("홍길동");

        System.out.println(predicate.test("이몽룡"));
        System.out.println(predicate.test("홍길동"));



        //-------------------------


        // BiPredicate<T, U> : T타입의 객체와 U 타입의 객체를 조사해서 true 또는 false를 리턴한다
      /*  BiPredicate<String, String> biPredicate;
                biPredicate = (str1, str2) -> str1.equals(str2);
*/

        BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);

        System.out.println(biPredicate.test("이몽룡", "홍길동")); // false
        System.out.println(biPredicate.test("이몽룡", "이몽룡")); // true


        // 기본 타입의 predicate와 객체끼리 비교 가능한 predicate

        // -------------------------------



    }





}
