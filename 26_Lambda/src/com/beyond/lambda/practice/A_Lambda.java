package com.beyond.lambda.practice;

public class A_Lambda {



    public void method1(){
        // Runnable 인터페이스를 구현하는 람다식 생성
        
        // 익명 구현 객체를 만들어서 넘김 (클래스가 아니라 Runnable객체 생성)
        
        // Runnable runnable = new Runnable(); 인터페이스라 객체로 생성 불가함 -> 내부에서 객체를 생성해줌
        
        Runnable runnable = new Runnable() { // 인터페이스의 참조변수에 람다식이 대입됨
            // 간단한 내용은 클래스가 아니라 구현 객체로 만들어서 넘김
            @Override
            public void run() {
                System.out.println("익명 구현 객체를 이용한 Runnable 인터페이스의 구현 객체 생성");
            }
        };

        //  (추상 메서드가 하나만 있어야 함) -> 함수적 인터페이스
        // 함수적 인터페이스 (functional interface) 만 람다식으로 만들 수 있음

        // 인터페이스의 참조변수에 람다식을 대입하려면 인터페이스의 추상 메서드를 그대로 재정의해야 함
        // return 하는 게 없으면 return; 는 써도 되지만 값은 있으면 오류남

        // 람다식을 사용한 runnable 1
        runnable= ()->{
            System.out.println("람다식을 사용한 Runnable1 생성");
        };
        // 식이 하나라 중괄호 생략한 runnable2
        runnable= ()-> System.out.println("람다식을 사용한 Runnable2 생성");


        Thread thread = new Thread(runnable); // Thread로 넘김
        
        thread.start(); // start 시 별도의 실행 흐름이 생성됨
        
    }

}
