package com.beyond.lambda.practice.Functional;

@FunctionalInterface
public interface A_Functional {

    // 매개 변수, 반환값이 없는 추상 메서드
    // 인터페이스의 메서드는 무조건 추상 메서드


    // 매개 변수, 반환값이 없는 추상 메서드
    // public abstract는 생략해도 됨
    /*public abstract*/ void  execute();

    // 추상 메서드를 하나 더 만들면 함수적 인터페이스가 아니게 됨

    // 여러 추상메서드를 만들지 않도록 @FunctionalInterface 어노테이션을 만들어줌 -> 메서드 여러개면 오류남



    // ---------------------------------------






}
