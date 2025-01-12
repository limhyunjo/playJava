package com.beyond.staticmember.practice;

public class B_StaticMethod {

    private static int num1 = 10;
    private static int num2 = 20;

    private int num3 = 30;

    // 1. 매개변수와 반환값이 없는 정적 메소드
    public static void method1(){
        // 클래스에 속해있는 멤버로 클래스 이름으로 접근 가능
        System.out.println(num1 + num2++);
        // System.out.println(num3); // 필드를 사용하려면 객체(인스턴스)부터 만들어야함
        // 필드는 인스턴스가 만들어져야 생성되기 때문에
        // 실행 시점에는 인스턴스가 없어서 오류가 남
        // 정적 메소드에서 필드에 접근할 수 없다.
        // 정적 메소드는 객체를 생성하지 않고 사용하기 때문에 필드에 접근할 수 없다
        
    }

    // 2. 매개변수가 없고 반환값이 있는 정적 메소드
    public static int method2(){

        // 정적 메소드에서도 지역 변수 생성 가능
        int num1 = 30;
        int num2 = 40;
        
        // 지역 변수와 정적 필드의 이름이 같으면 지역변수가 우선 시 됨
        
        // return num1 + num2; 지역 변수값 70
        
        return B_StaticMethod.num1 + B_StaticMethod.num2; 
        // this가 아니라 클래스 이름으로 접근해야 지역 변수가 아닌 필드 값이 들어감

    }

    // 3. 매개변수가 있고 반환값이 없는 정적 메소드
    public static void method3(int num){
        //System.out.println(method2()+ num);
        System.out.println(B_StaticMethod.method2()+ num);

    }

    // 4. 매개변수가 있고 반환값도 있는 정적 메소드
    public static int method4(int...numbers){
        int sum = 0;

      /*  System.out.println(numbers);
        System.out.println(numbers.length);
*/
        for(int i =0; i < numbers.length; i++){
            sum +=numbers[i];

        }

        return sum;
    }


}
