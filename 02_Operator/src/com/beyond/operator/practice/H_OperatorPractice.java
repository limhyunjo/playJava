package com.beyond.operator.practice;

import java.util.Scanner;

public class H_OperatorPractice {
        /*
         * 실습 문제 1
         * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
         * 'A' ~ 'Z'까지 코드값으로 65 ~ 90까지의 숫자로 나열되어 있다.
         *
         * 예시)
         * 문자 하나 입력 > f
         * 사용자가 입력한 값이 대문자입니까? : false
         */
        public void practice1() {

            char ch = '0';
            boolean result = false;
            Scanner sc = new Scanner(System.in);

            System.out.print("문자 하나 입력 > ");
            ch = sc.next().charAt(0);
            result = ( ch<= 65 && ch >=90 );
            System.out.printf("사용자가 입력한 값이 대문자입니까? : %b",result);




        }

        /*
         * 실습 문제 2
         *
         * 사용자한테 두 개의 정수값을 입력받아서
         * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다."
         * 아닌 경우 "결과가 100 보다 작습니다." 출력
         */
        public void practice2() {

        }

        /*
         * 실습 문제 3
         *
         * 사용자한테 문자를 하나 입력받아서
         * 입력한 문자가 대문자이면 "알파벳 대문자이다."
         * 아닌 경우 "알파벳 대문자가 아니다." 출력
         */
        public void practice3() {

        }

        /*
         * 실습 문제 4
         *
         * 두 정수를 입력받고 + 또는 - 를 입력받아서 계산을 출력하라
         * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
         *
         * 예시)
         *   첫 번째 수 > 3
         *   두 번째 수 > 4
         *   연산자 입력(+ 또는 -) > +
         *
         *   3 + 4 = 7
         */
        public void practice4() {

        }

        /*
         * 실습 문제 5
         *
         * 키보드로 입력받은 하나의 정수가 짝수이면 "짝수이다."
         * 짝수가 아니면 "홀수이다"를 출력하세요.
         */
        public void practice5() {

        }

        /*
         * 실습 문제 6
         * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
         * 인원 수와 사탕 개수를 키보드로 입력받고 1인당 동일하게 나눠가진
         * 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
         */
        public void practice6() {

        }

        /*
         * 실습 문제 7
         * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
         * 세 과목에 대한 합계(국어 + 영어 + 수학)와 평균(합계 / 3.0)을 구하세요.
         */
        public void practice7() {

        }

        /*
         * 실습 문제 8
         * 주민 번호를 입력받아 남자인지 여자인지 구분하여 출력하세요.
         */
        public void practice8() {

        }

        /*
         * 실습 문제 9
         * 3개의 정수를 키보드로 입력받아
         * 입력받은 정수가 모두 같으면 true, 아니면 false를 출력하세요
         */
        public void practice9() {

        }


}
