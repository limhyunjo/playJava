package com.beyond.api.practice;

public class B_Wrapper {

    /*
    * Wrapper 클래스
    *  - 기본 자료형을 객체로 포장해 주는 클래스이다.
    *  - 프로그램에 따라서 기본 타입을 객체로 취급해서 처리해야 하는 경우에 사용한다.
    *  - 기본 자료형을 Wrapper 클래스로 포장해 주는 것을 Boxing이라고 한다.
    *  - Wrapper 클래스를 기본 자료형으로 변경해 주는 것을 UnBoxing이라고 한다.
    * */

    public void method1(){

        // 1. Boxing ( 기본 타입 -> Wrapper 객체 )
        // 1) Wrapper 클래스로 객체를 생성하는 방법 ( 소문자는 기본 타입, 대문자는 Wrapper 타입)
        //  @Deprecate -> 9버전부터 지원 안할 예정
        // final 클래스로 생성 시 값을 가지고 있는 객체를 만들어줌(변경, 상속 불가)

        //Integer integer = new Integer(10); // 객체로 만들어서 저장 but final이라서 값을 변경 불가능
        //Double double = new Double(3.14);

        // 2) 정적 메소드를 통해서 생성하는 방법
        /*Integer integer = Integer.valueOf(10);
        Double double1 = Double.valueOf(3.14);
        Double double2 = Double.valueOf(3.14);

        System.out.println(integer);
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double1 == double2); // 객체라서 참조값을 비교하면 주소가 달라서 false가 나옴
        // 객체타입의 값을 비교할 때는 .equals를 사용해야 함
        System.out.println(double1.equals(double2));*/
        
        
        // 3) Auto Boxing (1.5 부터 지원)
       /* Integer integer = 5; // 한쪽은 클래스 타입 다른쪽은 기본 타입인데 대입이 되는 이유
        // int -> Integer 가 되는 이유 
        // 기본 타입을 참조 타입의 객체로 변환하여 자동으로 객체 타입으로 박싱해줌
        Double double1 = 1.2345678;
        Double double2 = 1.2345678;

        System.out.println(integer);
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double1 == double2);*/



        // 2. UnBoxing ( Wrapper 객체 -> 기본 타입 )

        // 1) Wrapper 객체의 메소들를 이용하는 방법

     /*   int number = integer.intValue();
        double dNumber1= double1.doubleValue();
        double dNumber2 = double2.doubleValue();

        System.out.println(integer);
        System.out.println(dNumber1);
        System.out.println(dNumber2);
        System.out.println(dNumber1 == dNumber2);

*/
        // 2) Auto Unboxing

        Integer integer = 5;
        Double double1 = 1.2345678;
        Double double2 = 1.2345678;

        int number = integer;
        double dNumber1 = double1;
        double dNumber2 = double2;

        System.out.println(number);
        System.out.println(dNumber1);
        System.out.println(dNumber2);
        System.out.println(dNumber1 == dNumber2);
        System.out.println();

        // 객체인데 연산?
        System.out.println(integer*2);
        System.out.println(double1 + double2);
        // 연산 전에 auto unboxing이 일어나서 객체 안의 기본값을 꺼내서 연산을 수행한다.





    }
}
