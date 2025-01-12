package com.beyond.control.practice;

import java.util.Scanner;

public class B_Switch {


    /*
     * switch 문
     *   [표현법]
     *    - switch () {  // 정수, 문자, 문자열만 올 수 있음
     *       case 값:
     *         .. 실행 코드 ..
     *         break;  // break문을 만날 때까지 실행
     *
     *       case 값: // 위의 값과 일치하지 않으면 넘어옴
     *        .. 실행 코드 ..
     *         break; //
     *
     *         [default: // case들의 값과 일치하지 않으면 default 수행
     *           .. 실행 코드..
     *          ]
     *      }
     * */

    // 사용자로부터 과일 이름을 입력받고 입력한 과일의 가격을 출력
    public void method1() {

        String fruit = ""; // null 도 가능
        Scanner sc = new Scanner(System.in);

        System.out.print("과일을 입력해주세요 >");

        fruit = sc.nextLine(); // 입력한 값을 fruit 변수에 담음

        int price = 0;
        // 숫자, 문자, 문자열만 값으로 들어갈 수 있음 ( 실수는 지원하지 않음 )
        switch (fruit) { // 변수에는 과일 이름이 담긴다

            case "포도":
                price = 8000;

                break; // break가 없으면 다음 코드로 넘어가서 break를 만날 떄까지 코드를 실행한다 
            // "포도"를 입력해도 break가 없으면 12000이 나옴

            case "딸기":
                price = 12000;

                break;

            case "사과":
                price = 4000;

                break; // break를 만나면 빠져나옴

            default:
                System.out.println("판매하지 않는 과일입니다.");

                return;
            //return 아래 코드는 실행하지 않고 실행 흐름을 메소드를 호출한 쪽(메인)으로 돌려준다.
            // 어플리케이션 실행 시 메인 메소드에서 호출 후 메서드 실행 후 return을 하면 더이상 아래의 코드를 읽지 않고 메인 메서드로 돌아간다


        }


        System.out.printf("%s의 가격은 %d원 입니다. \n", fruit, price);


    }


    //  1~12월까지 입력받아서 해당하는 달의 마지막 날짜를 출력하기
    // 31 - 1,3,5,7,8, 10,12
    // 30일 - 4, 6, 9, 11
    //28일, 29일 - 2
    public void method2() {

        int month = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 12 월까지 중 하나를 입력하세요>");
        month = sc.nextInt();

        if (!(month >= 1 && month <= 12)) {
            System.out.println("1~12월까지만 입력해주세요.");

            return; // 실행 흐름을 바깥으로 보냄


        }
        /*switch (month){
            
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("%d월은 31일까지 입니다.\n", month);


                break;

            case 4 :
            case 6 :
            case 9 :
            case 11 :

                System.out.printf("%d월은 3일까지 입니다.\n", month);

                break;


            case 2 :
               
                System.out.printf("%d월은 28또는 29일까지 입니다.\n", month);
        }
        */


        switch (month) {

            case 1, 3, 5, 7, 8, 10, 12: // jdk 버전 14부터 지원 가능
                // jdk 버전 7부터 switch문 값으로 문자열 가능
                // 새로운 버전의 문법을 알아놔야 함
                System.out.printf("%d월은 31일까지 입니다.\n", month);


                break;

            case 4, 6, 9, 11:

                System.out.printf("%d월은 3일까지 입니다.\n", month);

                break;


            case 2:

                System.out.printf("%d월은 28또는 29일까지 입니다.\n", month);

        }
    }



    /*
     * 실습 문제
     *
     * 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력받아서 계산을 출력하라
     * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력
     *
     * 예시)
     *   첫 번째 수 > 3
     *   두 번째 수 > 4
     *   연산자 입력(+, -, *, /) > +
     *
     *   3 + 4 = 7
     *
     *   첫 번째 수 > 3
     *   두 번째 수 > 4
     *   연산자 입력(+, -, *, /) > a
     *
     *   연산자를 잘못 입력하셨습니다.
     */

    public void method3() {

        int a = 0;
        int b = 0;
        int result = 0; // shift f6 단축키로 변수명 한번에 바꿈
        char op = ' ';

        Scanner sc = new Scanner(System.in);


        System.out.print("첫번째 수를 입력하세요 >");
        a = sc.nextInt();
        System.out.print("두번째 수를 입력하세요 >");

        b = sc.nextInt();


        System.out.print("연산자를 입력하세요 >");
        op = sc.next().charAt(0);

       /* if( op != '+' && op != '-' && op != '*' && op != '/'){
            System.out.print("연산자를 잘못 입력하셨습니다.");

            return;
        }*/

        switch (op) {

            case '+':
                // System.out.printf("%d + %d = %d", a, b, a+b);
                result = a + b;
                break;

            case '-':
                //System.out.printf("%d - %d = %d", a, b, a-b);
                result = a - b;

                break;
            case '*':
                // System.out.printf("%d * %d = %d", a, b, a*b);
                result = a * b;
                break;
            case '/':
                //System.out.printf("%d / %d = %d", a, b, a/b);
                result = a / b;
                break;

            default:
                System.out.println("연산자를 잘못 입력하셨습니다.");
                return;
        }

        System.out.printf("%d %c %d = %d \n", a, op, b, result);


    }


    /*
    * Flag 변수(플래그 변수)란, 처리 흐름을 제어하기 위해 사용하는 변수로서 boolean 변수이다.
    * 간단한 소스 코드 혹은 다른 소스와 충돌이 발생할 가능성이 낮을 경우에만 사용하는 것을 추천
    * */
    public void method4() {
        int input;
        int result = 0;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Input Only Even Number ====");

        while (flag) {
            input = scanner.nextInt();
            if ((input % 2) == 0) {
                result += input;
            } else {
                System.out.println("======= " + input + " is Odd Number =======");
                flag = false;
            }
        }
        System.out.println("========== Result : " + result + " ==========");
    }
}

