package com.beyond.exception.practice;

import java.util.Scanner;

public class C_RuntimeException { // 예외처리를 하지 않아도 되는 예외


    public void method1(){

        int[]numbers;
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이 >");

        size=sc.nextInt();

        if(size>=0){ // 별도의 예외처리 구문을 적지 않아도 조건문으로 해결 가능
            System.out.println("0보다 큰 값을 입력해 주세요");
         return;
        }

        numbers = new int[size]; // 전달받은 사이즈로 배열 생성
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
    }
}
