package com.beyond.control.practice;

public class C_For {
    
    /*
    * for 문
    *   [표현법]
    *     for( 초기식 ; 조건식 ; 증감식 ){
    *     .. 실행 코드.. 
    *     };
    * */
    
    // 1부터 10까지의 정수들의 합계를 출력
    public void method1(){

        int sum = 0;
      for(int i =1; i<=10; i++){ // i는 제어 변수 (for문 안에서만 사용 가능)
             sum +=i;   // 복합대입연산자
      }
        System.out.println("합계 = "+ sum);


    }


    // 1부터 랜덤값 (1~10)까지의 합계를 출력
    public void method2(){


        // Math 클래스 Math.random (실수 값을 줌)
        // java.lang.Math 클래스에서 제공하는 random()메서드를 사용해서 랜덤값을 발생시킬 수 있다.
        // random() 메서드 호출 시  ->  0.0 ~ 0.9999999... 사이의 랜덤값을 발생(0.0 <= 랜덤값 < 1.0 )
        // java.lang 패키지는 import를 안 해도 사용 가능하다

        System.out.println((int)(Math.random()*10+1)); // 0.0~ 0.99999

        int random = (int)(Math.random()*10+1);
        int sum = 0;

        for( int i = 1; i <= random; i++){

            sum += i;

        }

        System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);

        // System.out.println(floor(Math.random() * 10 + 1));

    }
    

    // 조건식에는 실수 값을 쓰지 않는다 ex) 14f
    
    // 구구단 출력
    public void method3(){


        for( int i =1; i<=9; i++){

            for (int x=1; x<=9; x++){ // x는 곲해지는 수
               // 바깥쪽 반복문 한번에 안쪽 반복문이 여러번 반복됨
                System.out.printf("%d x %d = %d \n", i, x, (i*x) );
            }

            System.out.println();

        }
        
    }
}
