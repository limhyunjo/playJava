package com.beyond.field;

import com.beyond.field.practice.User;

public class Application {

    public static void main(String[] args) {



        // 외부에서 필드에 접근하기 위해 객체 생성
        User user = new User(); // 인스턴스 생성됨 ( 인스턴스의 주소를 담을 수 있는 참조변수 )
        // new로 생성된 객체의 주소를 참조변수에 담음


        // 접근 제한자 테스트
        // 1) public : 어디서든 필드에 직접 접근이 가능하다
        //user.id = "hong123";
        System.out.println(user.id);

        // 2) protected : 같은 패키지, 자식 클래스에서만 직접 접근이 가능하다
        //System.out.println(user.address);



        // 3) default : 같은 패키지 안에서만 직접 접근이 가능하다
        // System.out.println(user.name);

        // 4) private : 클래스 내에서만 직접 접근이 가능하다
        //System.out.println(user.password);



        //  2. 변수 구분 테스트

        // 메소드 안에서 사용하는 지역변수
        // 클래스 아래서 사용하는 필드

        // 1) 필드 ( 인스턴스 변수,멤버 변수 )
        // - 클래스 영역에 선언하는 변수
        // - 클래스 내에서 어디든지 사용이 가능하다
        // - 필드는 접근 제한자 사용 가능( public, default, private, protected )
        // - new 연산자를 통해서 객체(인스턴스) 생성 시 메모리(Heap)에 생성되고
        //   객체(인스턴스)가 소멸 시 함께 소멸된다.

        // 2) 지역 변수
        // - 클래스 영역 안의 메소드, 생성자, 제어문 등에 선언하는 변수, 해당 구역에서만 사용이 가능하다
        // - 지역 변수는 접근 제한자를 사용할 수 없다.
        // - 메소드, 생성자, 제어문 등의 실행 시 메모리(Stack)에 생성되고,
        // - 메소드, 생성자, 제어문 등 종료 시 소멸된다.


        // ----------------------------------------------------------


        // 메소드 실행
        user.test(10);
        // 값을 전달하지 않으면 오류가 남
        
    }
}
