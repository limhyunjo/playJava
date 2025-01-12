package com.beyond.staticmember;

import com.beyond.staticmember.practice.A_StaticField;
import com.beyond.staticmember.practice.B_StaticMethod;
import com.beyond.staticmember.practice.C_StaticFinalField;

public class Application {

    public static void main(String[] args) {
        // 정적 필드 테스트
        // 정적 필드 생성 및 출력
        System.out.println(A_StaticField.number);
        // 필드 이름만으로 접근 가능(객체를 생성하지 않고도 사용 가능)
        System.out.println();

        // 객체의 정적 필드 공유
        A_StaticField staticField1 = new A_StaticField();
        A_StaticField staticField2 = new A_StaticField();

        System.out.println(staticField1.number); // number에 접근해서 출력
        System.out.println(staticField2.number);
        System.out.println();

        A_StaticField.number++;

        System.out.println(staticField1.number);
        System.out.println(staticField2.number);
        System.out.println();

        
        // 정적 필드의 getter와 setter 메소드
        System.out.println(A_StaticField.getMessage());
        A_StaticField.setMessage("메시지 변경");
        System.out.println(A_StaticField.getMessage());
        System.out.println();



        // 정적 메소드 호출
        // 1. 매개변수와 반환값이 없는 정적 메소드 호출
        B_StaticMethod.method1(); // 30
        B_StaticMethod.method1(); // 31


        // 2.매개 변수가 없고 반환값이 있는 정적 메소드 호출
        System.out.println(B_StaticMethod.method2());
        System.out.println();

        
        // 3. 매개 변수가 있고 반환값이 없는 정적 메소드 호출
        B_StaticMethod.method3(30); //반환값이 없음
        System.out.println();

        // 4. 매개변수가 있고 반환값도 있는 정적 메소드 호출

        // method4는 가변인자로 호출 전까지 매개값을 모름
        System.out.println(B_StaticMethod.method4());
        System.out.println(B_StaticMethod.method4(4, 5, 10));
        System.out.println(B_StaticMethod.method4(4, 5, 10, 20, 40));
        System.out.println();
        // 배열의 주소와 사이즈가 나옴




        // final 필드 테스트
        C_StaticFinalField staticFinalField1 = new C_StaticFinalField("남자");
        C_StaticFinalField staticFinalField2 = new C_StaticFinalField("여자");

        System.out.println(staticFinalField1.getGender());
        System.out.println(staticFinalField2.getGender());
        System.out.println();


        // 상수 필드 테스트

        System.out.println(C_StaticFinalField.MAX_LEVEL);
        System.out.println(Math.PI);
        System.out.printf("byte의 표현 범위 %d ~ %d 입니다.\n",Byte.MIN_VALUE,Byte.MAX_VALUE);
        System.out.printf("int의 표현 범위 %d ~ %d 입니다.\n",Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("Charactor의 표현 범위 %d ~ %d 입니다.\n",(int)Character.MIN_VALUE, (int)Character.MAX_VALUE);

    }
}
