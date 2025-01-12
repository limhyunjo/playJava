package com.beyond.method.practice;

public class A_method {


    // 1. 매개변수와 반환값이 없는 메소드
    public void method1(){
        // 매개값 없음 ()
        // void : 반환값이 없다
        
        // 어떤값도 받지 않고 반환하지 않는 메소드
        // 중괄호 내부의 코드만 수행하고 종료

        System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");

        // return 구문 쓰면 오류남
        // return문 뒤에 반환값이 오면 에러가 발생한다

        return; //(값 없이 실행 흐름만 메서드 호출한 곳으로 돌려주는 구문은 사용 가능)

        // System.out.println("리턴 이후 실행");
        // return 하면 실행한 곳으로 돌아가서 도달할 수 없는 실행문이 되어서 오류남

        // 메소드가 호출이 끝나면 실행 흐름이 되돌아가서 어차피 return 이 생략된 형태임

    }
    
    
    // 2. 매개변수가 없고 반환값은 있는 메소드
    public String method2(){
        // 반환 타입을 String이라고 했는데 반환값이 없으면 오류남

        // String 타입의 참조변수를 만들고 변수에 문자열 주소를 담아서 반환
        String str = null;

        str = "매개변수 값은 없지만 반환값은 있는 메소드입니다.";

        return str; // 변수 안의 주소를 반환
        // return "매개변수 값은 없지만 반환값은 있는 메소드입니다."; 이것도 가능 but 문자열 자체 반환 아니라 이것도 주소 반환임
        
        
       // return ""; 과  return null; 도 가능
        // 문자열의 주소를 반환
        // 문자열 객체를 그대로 보내는게 아니라 주소를 보냄
    }

    

    // 3. 매개변수가 있고 반환값은 없는 메소드
    public void method3(int number1, int number2){

        // 반환값이 없어서 return 구문 없어도 오류 안남
        // 매개변수만 타입과 개수에 맞게 넘겨주면 됨

        System.out.printf("입력받은 매개변수의 합은 : %d\n",(number1 + number2));
    }


    
    
    // 4. 매개변수가 있고 반환값도 있는 매소드
    public int method4(int number1, int number2){

        return number1 * number2;
    }




    // 5. 매개변수로 User 객체를 전달받는 메소드
    public void method5(User user){ // 주소값이 들어감
        // 주소를 전달받아서 아이디 패스워드 이름을 바꿈
        user.setId("kim123");
        user.setName("김철수");
        user.setPassword("1325465");
    }




    // 6. 매개변수로 가변인자를 전달받는 메소드
    // 가변 인자( 호출하기 전까지 매개변수의 개수를 모를 때 사용 )

    // 1) 배열을 사용하는 방법
/*
    public int method6(int[]numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
*/



    // 2) 가변 인자를 사용하는 방법

    public int method6(int ... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }



}
