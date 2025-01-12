package com.beyond.inter.practice;

public interface Basic {

    // 객체를 안 만들어서 필드, 생성자 필요 없음
    // 인터페이스에서 정의되는 메소드는 어떤 기능을 만들지 명시는 해줘야 함
    // 필드, 메소드, 생성자가 존재할 수 없다

    // interface에서 메소드들은 무조건 추상메소드
    /*public abstract*/ void turnOn();
   /* public abstract */void turnOff();


  /* public static final */int Num = 0; // interface는 필드에 상수만 옴
    // 인터페이스에서 필드는 무조건 상수 필드이다.
}
