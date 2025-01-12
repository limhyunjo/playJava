package com.beyond.operator.practice;

import java.util.Scanner;

public class G_Tripple {

    public void method1() {

        // 사용자에게 입력받은 정수가 양수인지 음수인지 판별한 후 출력

        Scanner sc = new Scanner(System.in);
        int number = 0;
        String result = "";
        System.out.print("Enter an integer : ");
        number = sc.nextInt();

        // result= (number >0)? "양수입니다.":"음수입니다.";


        result= (number >0)? "양수입니다." :
        (number==0)? "0 입니다.":"음수입니다.";

        System.out.printf("%d는(은) %s \n",number, result);
        // 삼항 연산자를 중첩해서 사용
        
        // 삼항 연산자는 너무 여러번 중첩하면 보기 불편해서 필요한 경우 if문을 씀


    }
}
