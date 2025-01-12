package com.beyond.control.practice;

import java.util.Scanner;

public class D_While {

    /* while 문
        [표현법]
    *   while (조건식){
    *  .. 실행 코드..

       [증감식, 분기문]
    * }
    * */


    // 1 부터 랜덤값(1~10)까지의 합계
    public void method1(){

        int sum = 0;
        int random = (int)(Math.random()*10+1);
        int i = 1;

        while( i<=random){
        // 초기식, 증감식은 따로 작성
            sum += i;

            i++;


        }
        System.out.printf("1부터 %d까지의 합 : %d \n", random,sum );

    }



    //  사용자에게 문자열을 입력받고 그 문자열을 출력한다.
    // 단, exit 문자열을 입력하면 프로그램을 종료
    public void method2(){


        String str = "";
        Scanner sc = new Scanner(System.in);

    /*    while(true){ // 조건식이 true인 경우 무한 반복

            System.out.print("문자열을 입력해주세요.>");

            str = sc.nextLine();

            if(str.equals("exit")){
                System.out.println("프로그램을 종료합니다.");

                break; // 반복을 빠져나감
            }
            System.out.println(str);



        }

        */

        /* while(!str.equals("exit")){ // nullpointexception : 값이 null 값이면 오류남
             // String str = null;인 경우 초기값이 null이라 오류

            System.out.print("문자열을 입력해주세요.>");

            str = sc.nextLine();
            System.out.println(str);



        }
        */
        
        
        
        do{ // while문 뒤의 조건에 따라 중괄호 안의 코드를 실행할 지 말지를 결정한다
            // 조건이 false여도 중괄호 안의 내용을 무조건 한번은 실행한다

            System.out.print("문자열을 입력해주세요.>");

            str = sc.nextLine();
            System.out.println(str);

        }while(!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
        
        // for문과 while문으로 변환해서 만들어보기
        // 정확한 반복 횟수를 알면 for문
        // 반복 횟수는 모르지만 조건식은 알면 while
        // 무조건 한번은 실행되게 하려면 do while
        
        
        // break문은 가장 가까운 반복문만 빠져나간다
        //  continue 문이 포함되어 있는 가장 가까운 반복문의 증감식 또는 조건식으로 이동한다
        // continue는 특정 반복을 생략하기 위해서 사용
    }

}
