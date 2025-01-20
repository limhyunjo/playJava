package com.beyond.lambda.practice;

import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class F_Operator {

    /*
    * Operator
    *  - Operator 표준 함수적 인터페이스는 매개값과 리턴값이 있는 apply() 추상 메소드를 가지고 있다
    *  - apply() 추상 메소드는 주로 매개값을 이용해서 연산하고 동일한 타입으로 리턴하는 역할을 한다
    *
    * */

    public void method1(){

        // 두 개의 값을 받아서 동일한 타입으로 반환
        // IntBinaryOperator : 두 개의 int 타입의 값을 연산해서 int 타입의 값을 리턴한다.

        /*IntBinaryOperator intBinaryOperator;

        intBinaryOperator = (int a, int b) ->  {

            return a * b;
        };*/

        IntBinaryOperator intBinaryOperator = (a, b) -> a*b;

        System.out.println(intBinaryOperator.applyAsInt(10, 20));


        // IntUnaryOperator :
        // 한 개의 int 값을 연산해서 int 타입의 값을 리턴한다
        // unary- 단항 / 하나의 정수값을 받아서 하나의 정수값을 리턴함
        // DoubleUnaryOperator
        // UnaryOperator
        IntUnaryOperator intUnaryOperator = a-> a*a*a;

        System.out.println(intUnaryOperator.applyAsInt(2));



        // ---------------------------------------

        // BinaryOperator<T> : 두 개의 T 타입 객체를 연산해서 T 타입 객체를 리턴한다
     /*   BinaryOperator<Student> binaryOperator;

        binaryOperator = (Student s1, Student s2)->{

            // 비교 연산
            return s1.getSum() > s2.getSum() ? s1 : s2;
            //return null; // 참조변수라서 null로 임시 리턴값을 줄 수 있음
        };
*/

        BinaryOperator<Student> binaryOperator = (s1, s2) -> s1.getSum() > s2.getSum() ? s1 : s2;

        Student student1 = new Student("홍길동", 25, "남자", 70,80);
        Student student2 = new Student("성춘향", 25, "여자", 80,90);

        System.out.println(binaryOperator.apply(student1, student2));


        // ------------------------------------------------------


        // 참고- 인터페이스의 static 메소드 활용(maxBy())
      /*  BinaryOperator<Student> bo = BinaryOperator.maxBy((Student o1, Student o2) -> {

            return Integer.compare(o1.getSum(), o2.getSum());
        });
*/
        // compartor를 만들어서 binaryoperator로 전달한 것임
        BinaryOperator<Student> bo = BinaryOperator.maxBy((o1,  o2) -> Integer.compare(o1.getSum(), o2.getSum()));

        System.out.println(bo.apply(student1, student2));
    }




    //-------------------------------------------------








}
