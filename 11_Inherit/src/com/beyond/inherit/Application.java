package com.beyond.inherit;


import com.beyond.inherit.practice.Book;
import com.beyond.inherit.practice.Desktop;
import com.beyond.inherit.practice.SmartPhone;
import com.beyond.inherit.practice.Television;

public class Application {

    public static void main(String [] args){

        // 상속 - public 이라고 된 애들을 부모 클래스로부터 받음

        // Desktop 객체 생성
        // Desktop desktop = new Desktop();
        // 기본 생성자를 호출하지만 부모 클래스의 인스턴스를 먼저 호출
        // 부모 클래스의 인스턴스가 생성되면 자식 클래스의 인스턴스 생성

         Desktop desktop =
                new Desktop("a1111","아이맥24인치","애플",1800000, true);
        // 인스턴스 생성하면서 값 넘겨주기


        // SmartPhone 객체 생성
        SmartPhone smartPhone =
                new SmartPhone("a2222","아이폰 15 프로","애플", 1200000,"KT");


        //Television 객체 생성
        Television television =
                new Television("a3333","애플 TV", "애플", 1000000, 30);



        /*
        * stack             heap
        *
        * desktop     ->    Product(필요한 필드 set)
        *
        *                   Desktop
        *
        * */


        System.out.println(desktop.information());
        // 상속받은 후에 오버라이딩하지 않고 상속받은 부모 클래스의 information이 출력됨
        // 부모 클래스의 객체를 먼저 생성하고 자식이 상속받을 수 있게 함
        // 자식 클래스의 인스턴스를 생성한다 
        
        // Product를 초기화해주는 작업을 안해서 기본값이 들어감

        System.out.println(smartPhone.information());
        System.out.println(smartPhone.information());
        System.out.println();

        // 출력 시 부모 클래스의 기본 생성자 호출이 두 번 출력되는 이유
        // 부모의 기본 생성자를 두 번 사용해서
        // 싫으면 Product 부모 클래스의 매개변수 생성자를 자식 클래스에서 super로 호출하면 됨


        // ---------------------------------------------------------------------


        // Object 클래스의 메소드 오버라이딩

        // toString(), .equals, hashCode(), getClass 는 Object 클래스에서 제공 (재정의해서 사용해보기)



        // Book 클래스의 인스턴스 3개 생성
        Book book1 = new Book("자바의 정석", "남궁성", 30000);
        Book book2 = new Book("자바의 정석", "남궁성", 30000);
        Book book3 = new Book("혼자 공부하는 자바", "신용권", 28000);

        System.out.println(book1.information());
        System.out.println(book2.information());
        System.out.println(book3.information());
        System.out.println();

        // 1. toString() 테스트
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println();
        // toString 객체는 문자열의 정보를 나타냄
        // 패키지가 포함된 이름, 주소값(16진수로 표현됨)
        // 인스턴스를 표현할 수 있는 문자열을 return 반환해줌

        /*com.beyond.inherit.practice.Book@79fc0f2f
        com.beyond.inherit.practice.Book@50040f0c
        com.beyond.inherit.practice.Book@2dda6444*/


        // toString을 써서 참조변수만 전달해도 출력됨
        // 객체의 참조값을 매개변수로 전달받으면 내부에서 toString을 호출해서 반환해줌
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println();


        // 2. equals() 테스트

        System.out.println( book1 == book2);
        System.out.println(book1.equals(book2)); // 두 객체의 참조값(주소값)을 비교
        // 주소는 다르지만 제목, 저자, 가격이 같음 -> 같은 데이터를 가져서 같은 객체로 봄
        System.out.println(book1.equals(book3));
        System.out.println();
        System.out.println("홍길동".equals(new String("홍기동")));


        // 3. hashCode() 테스트
        // 그냥 hashCode를 찍으면 다른 객체라 해시코드가 다르지만 hashCode를 재정의하면 같은 해시코드로 나옴
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println("hello".hashCode());
        System.out.println(new String("hello").hashCode());
        System.out.println();
        // 서로 다른 숫자값이 나옴
        //  heap 영역에 만들어지는 인스턴스를 식별할 수 있는 정수값을 hashCode라 함
        // 객체들마다 다른 값을 가짐
        // 객체를 식별할 수 있는 정수값 -> 객체가 달라도 데이터가 같으면 해시코드가 같도록 재정의해놓음
        // hashCode, equals로 같은 객체인지 비교


    }
}
