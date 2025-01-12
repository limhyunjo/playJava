package com.beyond.inter.practice;

import java.util.Objects;

public class Book {


    // 모든 클래스는 Object 클래스를 상속한다 (Object의 후손이다)
    // extends 키워드를 주지 않아도 이미 Object 클래스를 상속 중이다.
    // 모든 클래스의 최상위 클래스는 Object 클래스이다.
    // Object 클래스에는 다양한 메서드들이 존재
    // hashCode, toString, equals, clone ... 등


    private String title;
    private String author;
    private int price;

    public Book() {
        
        //super() 가 생략되어 있음
        super(); // ctrl 로 누르면 Object 클래스로 넘어감
        // 생성자를 만들면 생략되어있는 super로 Object 클래스가 호출 생성됨
    }

    // 필드 초기화 메서드
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String information(){

        return String.format("title : %s, author: %s, price: %d \n",
                title, author, price);
    }
    
    
    
    // 1. Object 클래스의 toString() 메소드
    //  - toString() 메소드는 객체의 문자열 정보를 리턴한다.
    //  - 기본적으로 Object 클래스에서는 "클래스명@16진수 해시코드"를 리턴한다
    //  - 자식 클래스에서 객체에 대한 유용한 문자열 정보를 리턴하도록 재정의할 수 있다. 


    @Override  //alt +insert -> toString에서 자동으로 만들어줌
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    // information 메서드를 만드는 대신에 toString을 재정의해서 쓸 것임


    // 2. Object 클래스의 equals() 메서드
    // - equals 메서드는 매개값으로 전달받은 객체와 자신이 동일한 객체인지 확인하는 메서드이다.
    // - 동일한 객체라면 true를 return하고 그렇지 않으면 false를 반환
    // - Object 클래스에서는 주소값을 비교하는데 자식 클래스에서 객체들이 가지고 있는
    // - 필드의 값들을 비교하도록 재정의할 수 있다.


    // 보통 equals랑 hashCode를 같이 만든다
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }


    // 3. Object 클래스의 hashCode 메소드
    // - 객체의 해시코드란 객체를 식별할 수 있는 하나의 정수값을 의미한다
    // - 기본적으로 Object 클래스의 hashCode() 메서드는 객체의 메모리 번지를 이용해서
    //   생성하기 때문에 객체마다 다른 값을 가지고 있다.
    // - 자식 클래스에서 객체들이 가지고 있는 필드의 값들이 같으면 동일한 해시 코드를 리턴하도록 재정의할 수 있다.
    
    // 같은 데이터를 가지면 같은 해시코드를 반환하도록 만들어짐
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
