package com.beyond.variable;
import com.beyond.variable.practice.A_Variable;
import com.beyond.variable.practice.B_ConsoleOutput;
import com.beyond.variable.practice.C_KeyBoardInput;

// 패키지 + 클래스 명
// 클래스 이름은 자바 파일의 이름과 동일해야 한다
public class Application {
    // 클래스 이름은 파일명과 동일해야 함
    // 그렇지 않은 경우 에러

    // 인텔리제이는 alt + enter 로 에러 해결 방안 제시해줌

    // 메인 메소드는 프로그램의 시작점으로
    // java.exe가 Application.class를 실행시킬 때 제일 먼저 실행되는 메소드이다.
    // 고정된 이름임
    public static void main(String[] args) {
    // 메인 메소드만 가지고 있어서 실행하는 역할만 한다


        /*실행 클래스*/
        // 자바에서의 주석은 /**/, //
        /*
        * 주석 (Comment)
        * - 소스 코드와는 무관하고 코드로 인식되지 않는다.
        * - 주로 코드에 대한 설명을 작성할 때 사용
        *
        * // : 한 줄 주석
        * // 추가로 주석 작성
        *
        * 블럭 잡고 ctrl + / -> 이미 있는 코드를 주석 잡기 가능
        * 주석 풀기도 가능
        *
        * */

        // sout 으로 자동완성
        // tab 누르면 자동으로 helloworld
        // ctrl + shift f10 자동실행
        //

        System.out.println("Hello World");

        //1) 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
        // [표현법]

        // 클래스 변수명 = new 클래스명();


        // 1-1) import 문을 사용하지 않고 클래스 생성
        // 가독성 떨어짐
        // com.beyond.variable.practice.A_Variable variable = new
        // com.beyond.variable.practice.A_Variable();
        // 만든 클래스를 생성


        // 1-2) import 문을 사용하여 클래스 생성
        // import문을 써서 생략할 패키지 명을 위에 적어줌
        A_Variable variable = new A_Variable(); //변수에 클래스 생성해서 담아둠
        // 패키지를 import하고 클래스를 생성
        // 클래스를 variable 안에 담아서 아래서 .메소드 이름으로 호출

        // 2.생성한 클래스로 메소드를 실행(호출)
        //  [표현법]
        //    변수명.메소드명();

       // variable.variableTest();
        // 클래스 내부에 포함되어 있어 함수가 아닌 메소드라 부름

        // 호출하면 중괄호가 끝날때까지 실행되고 호출한 곳으로 돌아감
        // shift+f10 실행



        // main에 클래스 생성 후 메소드 호출
        //variable.autoCasting(); // 메소드 호출
        //  메소드 호출로 해당 메소드에 가서 순서대로 중괄호 안의 코드를 실행 후
        // 다시 호출된 곳 main으로 돌아감


        //variable.casting();
        // variable.practice();


        B_ConsoleOutput output = new B_ConsoleOutput();
        // 객체(클래스) 생성 / 객체의 주소값이 담김

        //output.valuePrint();

         C_KeyBoardInput input = new C_KeyBoardInput();

        // input.keyboardInput();
        
        // new C_KeyBoardInput().inputByScanner();
        // 한번만 호출할 때는 생성하자마자 메서드 호출하는 방식을 쓰기도 함

        input.method4();
    }
}
