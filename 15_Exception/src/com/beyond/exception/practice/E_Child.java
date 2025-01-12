package com.beyond.exception.practice;

import java.io.IOException;

public class E_Child extends D_Parent {

   /* @Override
    public void method(){ // 오버라이딩 시 자식 클래스에서는 예외를 throws하지 않아도 된다

    }*/


    /*@Override
    public void method() throws IOException {
        // 오버라이딩 시 자식 클래스에서는 부모 클래스와 같은 예외를 throws 하는 것은 가능하다

    }*/


    @Override
    public void method() throws IOException {  // FileNotFound 예외는 IO예외의 하위이다
        // 오버라이딩 시 자식 클래스에서는 부모 클래스의 메소드보다 하위 타입의 예외를 throws하는 것은 가능하다

    }


   /* @Override
    public void method() throws Exception {  // Exception 예외는 IO예외의 상위이다
        // 오버라이딩 시 자식 클래스에서는 부모 클래스의 메소드보다 상위 타입의 예외를 throws하는 것은 불가능하다

    }*/




}
