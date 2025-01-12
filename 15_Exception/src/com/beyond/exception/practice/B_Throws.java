package com.beyond.exception.practice;

import java.io.IOException;

public class B_Throws {
    
    public void method1() throws IOException, ClassNotFoundException {
        System.out.println("method1호출");
        method2();
        System.out.println("method1종료");
    }
    
    
    
    public void method2()throws IOException, ClassNotFoundException{ // method1로 오류를 떠넘김
        System.out.println("method2 호출");
        method3(); // alt + enter로 없는 메서드 생성 가능
        System.out.println("method2 종료");
    }

    private void method3() throws ClassNotFoundException, IOException {
        System.out.println("method3호출");
        int random = (int) (Math.random() *3+1 );

        if(random == 1){
            throw new ClassNotFoundException(); // alt+ enter로 예외 catch 가능
            // CheckedException 예외 발생 코드들은 try안에서 작성하고
            // catch로 잡아줘야 함 안그럼 오류남
        }else if(random == 2){
            // RuntimeException을 상속한 nullpoint 예외는
            // 최종적으로는 Exception을 상속하지만 예외 처리를 안 해줘도 됨
            throw new IOException(); // 예외를 호출한 곳으로 떠넘김 -> method2가 오류남, method2에서 try catch로 처리하거나
            // method2에서도 method1로 떠넘길 수 있음
        }
        System.out.println("method3종료");
    }
    
    // method1 -> method2 -> method3 종료 후 호출한 곳으로 돌아감
}
