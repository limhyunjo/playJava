package com.beyond.method;

import com.beyond.method.practice.A_method;
import com.beyond.method.practice.User;

public class Application {

    public static void main(String[] args) {


        A_method methodTest = new A_method(); // 객체의 주소값을 담을 수 있는 참조변수

        // 1. 매개 변수와 반환값이 없는 메소드 호출
        methodTest.method1();
        System.out.println();

        
        // 2. 매개변수가 없고 반환값이 있는 메소드 호출
        String msg = methodTest.method2(); // 반환된 문자열을 참조변수에 대입해서 출력
        System.out.println(msg);



        // 3. 매개변수가 있고 반환값이 없는 메소드 호출
        methodTest.method3(10, 20); // 반드시 매개변수의 값을 전달해줘야 함
        System.out.println();


        // 4. 매개변수가 있고 반환값이 있는 메소드 호출
        //  int sum = methodTest.method4(10, 20);
        System.out.printf("10X20 = %d\n", methodTest.method4(10, 20));
        // ctrl + alt + n



        // 5. 매개변수로 객체를 전달받는 메소드 호출
        User user = new User("hong123","1234","홍길동");
        System.out.println(user.information());
        methodTest.method5(user);
        System.out.println(user.information()); //

        /* stack(main)           ->            heap
                                            같은 heap 영역의 객체를 참조

        *
        * stack(method5)         ->
        *
        *
        * */


        // 6. 매개변수로 가변인자를 전달받는 메소드 호출
      /*  System.out.println(methodTest.method6(new int[]{1,2})); //값의 목록으로 줄 떄는 선언과 동시에 초기화
        System.out.println(methodTest.method6(new int[]{1,2,3,4,5}));
        System.out.println(methodTest.method6(new int[]{}));*/

        // 배열을 값의 목록으로 줄 때는 new 연산자 사용해야 함
        // 값을 나중에 대입해서

        System.out.println(methodTest.method6(1,2)); // 호출하는 순간에 전달할 동일한 타입의 매개 값을 정함 
        System.out.println(methodTest.method6(1,2,3,4,5)); // 배열 형태로 넘어감 for문 사용 가능
        System.out.println(methodTest.method6());
        
        
        // printf도 가변인자
        //


    }
}
