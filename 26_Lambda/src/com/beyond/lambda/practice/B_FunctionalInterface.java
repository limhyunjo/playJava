package com.beyond.lambda.practice;

import com.beyond.lambda.practice.Functional.A_Functional;
import com.beyond.lambda.practice.Functional.B_Functional;
import com.beyond.lambda.practice.Functional.C_Functional;

public class B_FunctionalInterface {


    public void method1(){


        A_Functional fi = null;

        fi =() ->{
            System.out.println("매개변수와 반환값이 없는 람다식 1");
        };

        // 실행문이 한 줄이면 중괄호 {} 생략 가능
        fi = () ->System.out.println("매개변수와 반환값이 없는 람다식 2");
        fi.execute();
    }


    public void method2(){

        B_Functional fi = null;

        // 람다식은 무조건 함수적 인터페이스의 참조변수로 대입되고 구현 객체를 만든다
        // 함수적 인터페이스를 보고 람다식을 만들어야 함

        // 매개변수 이름은 무조건 같을 필요 없이 재정의해도 됨
        fi = (int b) ->{

            System.out.println(b*b);
        }; // 추상 메서드의 구현 객체가 만들어짐
        
        // 실행하려면 호출해야 함

        fi = a -> System.out.println(a*2); // 20
        // 매개변수가 하나라 괄호 생략, 자료형 int는 추측 가능해서 생략 가능, 식이 하나라 중괄호 생략


        // 인터페이스의 참조 변수 만들고 클래스 생성 안하고 구현 객체로 대입 (주소가 들어감)
        // 인터페이스의 구현 객체가 만들어졌으니 호출
        
        fi.execute(10); // 전달해준 10이 들어감 -> 100

    }


    public void method3(){
        int result = 0;

        C_Functional fi = null;
        // 인터페이스 참조 변수에 람다식 대입
        // 추상 메서드를 보고 재정의할 수 있는 람다식을 만들어야 함
        fi = (int a, int b) -> {

            return a + b;  // 반환을 안해주면 오류남
        };
        // 구현 객체를 만들어서 객체의 주소를 넘김

        fi = (a,b) -> a+b;

        // 인터페이스의 메소드를 호출해야 실행됨
        result = fi.execute(10, 20);

        System.out.println(result);
    }


    // 람다식에서 필드와 지역 변수 사용하기

    private int number = 100; // 필드 생성
    public void method4(int arg){

        // 필드는 제약이 없지만 지역 변수는 읽기만 가능하다

        int number = 200;
        A_Functional fi = null;

        System.out.println(arg);
        System.out.println(number);
        System.out.println(this.number);

        //arg =  400;
        //number = 500;
        this.number = 600;
        // this 지역변수와 필드의 이름이 같아서 구분하기 위한 것
        // 객체 자기 자신을 의미 
        // 람다식을 사용하기 전에는 메서드 안에서 값을 바꿀 수 있음

        // 람다식에서 사용되는 this는 람다식을 실행하는 객체의 참조이다.
        // 익명 구현 객체에서 this는 구현 객체의 필드(없음)이다.
        // 람다식은 외부 클래스에서 실행되기 때문에 this는 람다식이 포함된 외부 클래스의 객체의 참조를 의미한다
        

        fi = () ->{
            // 람다식에서 지역 변수를 사용하려는 순간 에러남
            // 람다식에서 사용하는 변수들은 final 성질을 가져야함
            // 지역 변수 arg, number는 값이 바뀌면 에러가 남
            
            // 람다식에서 지역변수(매개변수)를 이용할 때는 final, effectively final이어야 한다
            // - 지역변수는 람다식에서 읽는 것은 허용되지만, 람다식 내부 또는 외부에서 변경할 수 없다.
            // - 초기화된 이후에 값이 한 번도 변경되지 않는 변수르 effectively final이라고 한다

            // 값을 초기화한 후에 값을 변경하지 않으면 final 취급 해줌

            // 지역 변수들은 stack 영역에 만들어짐 (메소드 사용이 끝나면 사라짐)
            // 람다식에서 지역 변수(메소드 안에서 만들어진 변수, 매개변수)를 사용하는 경우 지역 변수의 값만 복사해서 씀

            
            // 람다식 외부와 내부에서 값을 변경하려고 하면 에러남
            
            // arg = 300;
            // number = 900;
            
            System.out.println(arg);
            System.out.println(number);
            System.out.println(this.number);



        };
        
        fi.execute(); // 값을 변경할 수는 없지만 값을 읽어올 수 있음
        
        
        // 익명 구현 객체의 내부에서 this를 쓰면 익명 구현 객체로 생성된 객체의 참조를 하게된다
        // 익명 클래스는 새로운 클래스 인스턴스를 생성하므로 this가 익명 클래스 객체의 참조를 의미한다
         fi = new A_Functional() {
             @Override
             public void execute() {

                 System.out.println(arg);
                 System.out.println(number);
                 //System.out.println(this.number); // 익명 구현 객체에서 람다식처럼 this.number를 넣으면 에러남
                 // 익명 구현 객체의 this를 참조하려 하는데 익명 구현객체는 필드가 없어서 오류남
                 // 오류가 안 나려면 내부에 final 필드를 써줘야함
             }
         };


    }



}
