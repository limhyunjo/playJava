package com.beyond.exception;

import com.beyond.exception.practice.A_TryCatchFinally;
import com.beyond.exception.practice.B_Throws;
import com.beyond.exception.practice.C_RuntimeException;

import java.io.IOException;

public class Application {

    public static void main (String[] args) throws IOException, ClassNotFoundException { 
        // main까지 예외를 던짐
        // JVM이 예외를 처리 - 콘솔에서 예외를 출력만 하고 끝냄


      //  A_TryCatchFinally exception = new A_TryCatchFinally();
       //B_Throws b = new B_Throws();
        System.out.println("프로그램 시작");

       // exception.method1();
       // b.method1();
       /* try {
            b.method1();
        } catch (IOException e) {
            System.out.println("IOException 예외 발생");
        } catch (ClassNotFoundException e) {

            System.out.println("ClassNotFoundException 예외 발생");
        }
*/

        new C_RuntimeException().method1();
        System.out.println("프로그램 종료");
        
        /*
        * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.beyond.exception.practice.A_TryCatchFinally.method1(A_TryCatchFinally.java:7)
	at com.beyond.exception.Application.main(Application.java:14)
        * 
        *  - method1이 있는 7번 줄에서 오류 발생
        * */
        
        
        //-> try catch 구문 사용 시 프로그램 정상 종료






    }
}
