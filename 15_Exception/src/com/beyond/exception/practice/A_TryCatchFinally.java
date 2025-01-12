package com.beyond.exception.practice;

public class A_TryCatchFinally {

    public void method1(){

        try { // 예외가 발생할 수 있는 코드 작성
         int result = 10/5;          //예외 new ArithmeticException 객체 생성
            
            System.out.println(result);
        }catch( NullPointerException | ClassCastException e){

            // 같은 방식으로 예외 처리할 경우 위도 가능
            System.out.println(" NullPointerException 또는 ClassCastException이 발생했습니다.");

        } catch (ArithmeticException e){ // 위의 예외를 참조변수 Exception으로 받음
            // 위에서 발생한 new ArithmeticException(); 이 대입 가능
            // 부모 타입의 참조변수에 자식 타입이 대입될 수 있음 
            
            
            //Exception은 모든 예외의 최상위에 있음
            // try에서 발생한 에외를 처리하는 코드를 작성
            System.out.printf("%s이 발생했습니다.\n", e.getMessage());
        }catch( Exception e) { // catch에 있는 참조변수로 예외 객체를 받아서 처리하는 것임
            e.printStackTrace(); //Exception 모든 예외를 받아서 처리할 수 있는 catch 블럭
            //예상치 못한 예외가 발생한 경우 여기서 무슨 예외인지 잡아줌
            
            
            // 최상위 예외처리 코드인 Exception의 경우 위에 적으면 나머지 예외처리가 오류남( 최상위 예외 클래스라서)
            // Exception은 가장 밑에 catch문에 적어준다
        }finally{
            // 예외 발생 여부와 상관없이 무조건 수행
            // finally는 생략도 가능
            System.out.println("finally 블록 실행");
        }

        // catch를 여러개 쓰면 멀티 catch
        // catch를 한번에 처리하면 다중 catch

        // Runtime Exception은 Exception을 상속하고 있다.

    }
}
