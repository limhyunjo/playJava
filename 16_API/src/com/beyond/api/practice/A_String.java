package com.beyond.api.practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class A_String {

    // String 클래스에서 제공하는 메소드 사용
    public void method1(){

        // .length()
        // 1. concat(String)
        // - 매개값으로 String 타입을 받아서 원본 문자와 매개값으로 전달받은 문자열을 하나로 합친 문자열을 리턴한다.

        String  str = "Hello World";
        String concat =  str.concat("!!!!"); // 원본 문자열 str은 그대로 두고 전달받은 문자열을 더한다
        // 대부분은 concat 보다 문자열 연결 연산을 더 많이 사용한다.
        // String concat = str + "!!!!"; // concat 메소드를 사용한 것과 동일한 결과를 만들어냄

        System.out.println(concat);
        System.out.println(str);

        // 2. subString()
        // - 매개값을 하나 받는 것과 두 개 받는 것이 있음
        // subString(int) 메소드는 매개값으로 전달받은 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴한다

        // subString(beginIndex, endIndex) 메소드는 매개값의 beginIndex 위치에서부터 endIndex  -1까지의 새로운 문자열을 생성해서 리턴한다
        String substring1 = str.substring(6);
        String substring2 = str.substring(2, 6);

        System.out.println(substring1);
        System.out.println(substring2);
        System.out.println(str);

        // 3. indexOf()
        //- 전달받은 문자열의 시작 인덱스를 리턴한다
        // 주어진 문자열이 포함되어 있지 않으면 -1을 리턴
        //int index = str.indexOf("Wrold");
        //int index = str.indexOf("Wrold", 7);

        // indexOf(char) - 메소드는 전달받은 문자의 시작 인덱스를 리턴한다
        int index = str.indexOf('o',6);
        System.out.println(index);
        System.out.println();

        
        // 4. replace(oldChar, newChar)
        // replace 메소드는 문자열에서 oldChar를 newChar로 변경된 새로운 문자열을 생성해서 리턴한다
        String replace = str.replace( "World","Java"); // 지역 변수로 읽어옴

        System.out.println(replace);
        System.out.println(str); // 원본 문자열은 바뀌지 않는다
        System.out.println();


        // 5. trim()
        // trim 메소드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성해서 리턴한다
        str = " Java ";
        System.out.println(str.trim());
        System.out.println(str);
        System.out.println();


        // 6. split(String)
        // split 메소드는 입력받은 구분자로 문자열을 분리하고 배열에 담아서 리턴한다

        str = "Java, MariaDB, Spring, HTML, CSS, Vue, js, Docker, Kubernetes, Jenkins";
        String[] strings = str.split(",");

        System.out.println(strings.length);
        System.out.println(Arrays.toString(strings));
        System.out.println(str);
        System.out.println();


        // 7. valueOf(...)
        // valueOf 정적 메소드는 매개값으로 전달받은 값들을 문자열로 변경해서 리턴한다.
        // String value = String.valueOf(12345);
        // String value = String.valueOf('A');
        // String value = String.valueOf(false);
         String value = String.valueOf(3.13245F);

        System.out.println(value);
        System.out.println();



    }



    // 메모리에 저장되는 문자열은 final로 저장됨
    // 문자열은 변경이 아니라 기존 문자열이 저장된 상태로 새 문자열이 만들어짐
    // 문자열을 사용할 수록 메모리에 String 객체가 계속 늘어남
    // 연결 연산을 많이 사용할수록 많은 메모리를 사용하게 됨
    // Stringbuffer나 stringBuilder를 사용함


    // StringBuffer, StringBuilder
    // String 클래스와 다르게 내부의 문자열을 수정할 수 있다.
    // 두 클래스는 데이터를 임시적으로 저장하는 메모리 buffer 에 문자열을 저장하고
    // 추가, 수정, 삭제 작업을 할 수 있도록 설계되어있음

    // StringBuffer 멀티스레드 환경에서 사용( 여러개의 실행 흐름이 한개의 객체에 동시에 접근 )
    // 동기화가 적용되어 있음

    // StringBuilder 단일스레드 환경에서 사용
    // 메인스레드 환경에서는 StringBuilder 사용

    // 둘의 차이는 스레드(실행 흐름)에 안전한가 아닌가로 나뉜다

    public void method2(){

        // 1. StringBuilder 객체 생성
        // 기본 생성자를 통해서 객체를 생성하면 16개의 문자를 저장할 수 있는 버퍼가 생성된다.
        // 16개의 문자 크기를 넘어가면 자동으로 버퍼 사이즈 늘려줌
        // byte 배열을 buffer로 사용
        // capacity -> buffer의 사이즈
        //StringBuilder sb = new StringBuilder(30); // 생성자에 정수값을 전달해주면 해당 크기만큼의 내부 버퍼가 생성됨

        // 생성자에 문자열을 전달해주면 문자열 크기 + 16 만큼의 내부 버퍼가 생성된다
        StringBuilder sb = new StringBuilder("안녕하세요."); // 문자열에 16을 더한 만큼의 내부 버퍼 크기로 생성됨
        System.out.println(sb.length()); //0
        System.out.println(sb.capacity()); //기본 16

        // 2. StringBuilder클래스에서 제공하는 메소드 사용
        // 1) append 메소드
        // sb.append(...) 메소드는 기존 문자열 뒤에 전달한 값을 추가한다.
        sb.append("저는 홍길동입니다.");
        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // 문자열의 길이가 내부 기본 버퍼 사이즈 16을 넘기지 않아서 사이즈가 그대로 22
        System.out.println();



        // 2) insert 메소드
        // sb.insert(offset, String) 메소드는 StringBuilder에 저장된 문자열의 offset위치부터 전달받은 문자열을 추가한다.(끼워넣음)
        sb.insert(6,"ㅎㅎㅎㅎㅎㅎㅎ");// 6번 위치에 문자열을 끼워넣음
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // 문자열의 길이가 내부 기본 버퍼 사이즈 16을 넘어가서 사이즈가 두배로 늘어남(자동으로 늘려줌)
        System.out.println();
        
        
        // 3) delete 메소드
        // 원하는 범위의 문자열을 삭제
        // sb.delete(start, end) 메소드는 start에서 end-1까지의 인덱스에 해당하는 문자열을 삭제한다
        sb.delete(6, 13);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println();

        // 4) reverse
        // 문자열의 순서를 역으로 바군다.
        sb.reverse();// 작없 수

        // 3. 메소드 체이닝 (메소드를 여러개 묶어서 사용)
        sb = new StringBuilder("Java Programming");
        
        // 메소드 수행 결과 해당 객체의 참조를 반환하기 때문에 아래와 같이 메소드를 이어서 쓸 수 있다.
        // 이렇게 메소드를 이어서 사용할 수 있는 것을 메소드 체이닝이라고 한다.
        sb.append("API").delete(5, 16).reverse();
        System.out.println(sb);







    }

}
