package com.beyond.control.practice;

public class E_Branch {
    
    // 1부터 랜덤값(1~10)의 합계를 반복문을 통해서 계속 출력
    // 랜덤값이 숫자 5가 나오면 프로그램 종료
    public void method1(){
        // for문으로 무한 반복  for(;;) -> while문의 무한 반복과 같음

        int sum;
        int random = 0;

        for(;;){
            sum =0; // 반복 구문마다 초기화
            random = (int)(Math.random()*10+1);

            if(random == 5){
                break;
            }

            for(int i =0; i<=random ; i++){
                sum += i; // 이전의 sum 내용을 지워줘야 함

            }
            System.out.printf("1부터 %d까지의 합계 : %d \n", random , sum);

        }

        System.out.printf("랜덤값이 %d 이므로 프로그램을 종료합니다.\n", random);

        
    }
    
    // 2부터 홀수단 제외 구구단 출력
    public void method2(){


        for( int i =2; i<=9; i++){

            if(i%2 != 0){
                continue; // 실행 시 가장 가까운 반복문의 증감식으로 감
            }
            System.out.printf("==== %d ====\n", i);
            for (int x=1; x<=9; x++){

                System.out.printf("%d x %d = %d \n", i, x, (i*x) );
            }


            System.out.println();

        }
    }
    
}
