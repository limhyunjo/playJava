package com.beyond.variable.practice;

public class A_Variable {



  public void variableTest() {

      /*
       * 변수의 선언
       *    [표현법]
       *       자료형 변수명;
       *
       * 변수의 초기화
       *     [표현법]
       *       변수명 = 값;
       *  // = 대입 연산자
       *
       * */


      // 논리형
      boolean isTrue;
      // 논리형 변수는 1byte로 true와 false 값만 담을 수 있다
      // default 값은 false


      // 정수형
      byte bNum; // 1byte
      short sNum; // 2byte 정수를 담을 수 있음
      // tab 누르면 자동 완성
      int iNum; // 4byte
      long lNum; // 8byte의 자료형의 크기를 저장 가능


      // 실수형
      float  fNum; //0.0f 4byte
      double dNum; //0.0d 8byte 크기의 실수 저장 가능


      // 문자형
      char ch; // 2byte의 유니코드 값을 담을 수 있는 변수 선언


      // 문자열
      //String name; // 문자열을 찾을 수 있는 참조형 변수 생성
      // 주소가 저장됨


      // byte타입으로 계산을 해도 컴퓨터가 integer 타입으로 바꿔서
      // 계산을 해서 보통 int 타입을 많이 쓴다
      // 실수형도 double을 많이 사용

      // 정수형은 기본 int
      // 실수형은 기본 double 타입




      // ----------------------------------------------


      // 변수의 초기화
      // 매개 값을 출력해줌 sout
      System.out.println(300);
      // 변수를 선언 후 초기화를 하지 않으면 출력 안됨
      // 선언한다고 변수가 만들어지는게 아니라
      // 지역 변수에 한해서 값을 선언할 때 메모리에 실제로 변수가 생성됨

      // 지역 변수를 선언한 후에 초기화가 되지 않은 경우
      // 에러가 발생한다

      isTrue = true;
      isTrue = false;
      // ctrl+d 한 줄 복사
      // isTrue =1; // 에러 발생 (논리값만 넣어야 함)
      //System.out.println(isTrue);
      // 문자열 연결 연산자로 문자열 만들기
      System.out.println("isTrue :" + isTrue);


      // ---------------------------------

      // 정수형 초기화
      System.out.println(); // 줄바꿈

      bNum = 127; // 128로 바꾸면 에러 발생
      // byte 값의 범위를 벗어남
      // 더 큰 값을 저장하고 싶으면 short 타입으로 바꾸기

      System.out.println("bNum :" + bNum);
      // 이미 클래스가 메인 클래스에서 생성되어서 이곳에서 실행 가능

      sNum = 32767; // 32768은 범위를 벗어나서 에러남
      System.out.println("sNum :" + sNum);


      iNum = 34765750;
      //lNum = 4315465;
      lNum = 43154650969898L;
      System.out.println("lNum :" + lNum);
      // 기존의 값은 지워지고 새 값이 대입됨

      // 정수형의 기본값 integer의 범위를 넘어간 값들은 에러가 남
      // literal은 기본적으로 int임 long 타입인 것을 알려주기 위해
      // l 붙여줌
      // integer 범위를 넘어가지 않아도 long 타입은 L을 붙임
      // long 타입의 리터럴은 숫자 뒤에 L 또는 ㅣ을 입력해야 한다
      System.out.println("lNum :" + lNum);

      fNum = 3.14f;
      // f를 생략하면 오류남
      // float 타입의 리터럴은 숫자 뒤에 f 또는 F를 입력해야 한다
      System.out.println("fNum :" + fNum);

      dNum = 3.14;
      System.out.println("dNum :" + dNum);
      // 기본적으로 리터럴 자체가 double 타입이라 생략해도 됨
      // float 타입은 반드시 f 써야 하지만 double 타입은 d또는 안 써도 됨
      //  더블 타입의 리터럴 4.2353 등은 float 타입으로 쓸 수 없도록 해놓음
      // 데이터 손실이 일어남



      // 선언하면서 초기화하기
      // 문자형
      // char c = 'A';
      // System.out.println("c :" + c);

      char c = 97; // 0~ 65,535(유니코드) 
      // 음수 값은 대입되지 않음
      System.out.println( "c :" + c);
      System.out.println();

      // 문자는 빈 문자 '' 를 줄 수 없지만 
      // 문자열은 빈 문자열을 줄 수 있다

      //char ch = 'u\0000'; -- 이렇게 유니코드 값을 넣으면
                              // 빈 문자 가능
      // char ch = 0; 도  빈 문자로 표시


      // 문자열
      // string name;
      //String str = "";
      // 문자열을 참조할 수 있는 참조 변수 선언
      // 빈 문자열로 초기화함
      //System.out.println("str :" + str);

      // String str= "홍길동";
      // System.out.println("str :" + str);

      // public class String -> String도 class임
       String name = new String("홍길동");
       

       // String name = null;
       // nullpointerexeception 발생(null 값으로 뭘 하려고 하면
       // 생기는 예외
      // 해당하는 참조변수에 null이 들어가 있음

      //System.out.println("name :" + name);
      System.out.println("name:" + name.charAt(1));
      // 문자 하나만 출력
      // 클래스들은 전부 new라는 연산자로 만들어야 하지만
      // String은 new라는 연산자 없이도 클래스 생성 가능

      //  String은 new 연산자로 만드는 것과 같음

      // String으로 변수를 만들어 초기화하면
      // 메모리 공간에 저장될 때 stack 과 heap 영역 중
      // 지역 변수로 만드는 애들은 stack 영역에 생성됨
      // new로 만드는 클래스들은 heap 영역에 생성됨

      // 문자열은 주소값으로 저장되는데 heap에 주소로 저장됨
      // stack영역에 주소값이 저장되고 이 주소값은 heap 영역의 주소를
      // 가리킨다
      /*
      *  stack       ->  heap
      *
      *  1000            홍길동
      *   name           1000
      *
      * - heap 영역의 주소 1000을 참조하고 있음
      *
      * */
      // heap 영역에 만들어지는 애들은 그냥 사라지지 않음

      // String name = null;
      // 참조 변수가 아무것도 참조하고 있지 않다는 것을 알려줌

      // null 도 하나의 값임


      // 참조 변수들은 클래스 타입으로 만들어짐
      // heap 영역에 저장됨



      //------------------------------------------


      // final 변수 선언
      // final 변수
      //   [표현법]
      //       final 자료형 변수명;
      //  초기화 이후 값 변경 불가능
      //  - 특정 변수의 값이 변경되는 것을 원하지 않을 때 사용한다
      // - 초기화 이후에는 값을 변경할 수 없다

      int age =20;
      System.out.println("age:"+age);


      age = 30;
      System.out.println("age:"+age);

      final int AGE = 30;
      //final (최종의)
      System.out.println( "AGE : " + AGE);

      // final int AGE;

      // AGE= 40;

      // 한번 초기화(값을 대입)하면 변경 불가
      //변수의 명명 규칙
      // 변수 명명 규칙 위반 시 에러 상황 발생하는 경우

      // 1) 대소문자 구분

      int number;
      // 변수는 동일한 이름의 변수가 있을 수 없음
      // 데이터 타입이 달라도 변수명이 같으면 에러가 남
      // 하나의 지역에서 동일한 이름의 변수가 올 수 없다

      //ctrl + shift + u
      // 변수 이름이 소문자 <-> 대문자 변환해주는 단축키

      // 대소문자가 다르면 다른 변수로 취급



      // 2) 숫자로 시작할 수 없다

      // int 1page; -- 에러남
      // 변수명의 중간이나 끝에 숫자가 들어가는 것은 가능
      // 맨 앞에만 안 됨


     // 3) 특수 문자 '_', '$'

        /*
             int _age;
          int a_ge;
          int age_;
          위 처럼 특수 문자 _, $ 이 둘은
          문자의 어느 위치에 들어가도 가능함

          @, % 등은 어노테이션이나 연산자로 착각 가능해서 안 됨
       */

   // 4) 예약어
    //  null, class, void, double, public 등의 예약어는 변수명으로 지정 불가능
      // 키워드는 이미 자바에서 역할이 있는 애들이라 변수명으로 사용 불가하다



  }



  /*자동 형 변환

    - 컴파일러가 자동으로
     데이터의 표현 범위가 작은 자료형을 큰 자료형으로 변환한다
  *
  * */

    public void autoCasting() {
        byte bNum = 10;
        short sNum = 12;
        int iNum = sNum; // short 타입의 데이터 타입이 int 타입으로 자동 형변환
        //short ->int
        
        // sNum = iNum; iNum의 값을 sNum으로 넘기는 것은 오류남
        // short 값이 int 타입의 변수에 대입 가능한 것은 값의 범위가 short가 더 
        // 작아서 자동 형 변환하여 대입됨

        long lNum = iNum;

        float fNum = lNum; // long 타입은 정수형이고 float은 실수형
        // long 타입의 표현 범위보다 float 타입의 표현 범위가 넓어서 가능
        // long -> float 로 자동 형변환
        double dNum = fNum;

        System.out.println( "dNum : " + dNum);
        System.out.println( "bNum : " + bNum);
        System.out.println( "sNum : " + sNum);
        System.out.println( "iNum : " + iNum);
        System.out.println( "lNum : " + lNum);
        System.out.println( "fNum : " + fNum);

        System.out.println();


        char ch = 'A';
        iNum = ch; // 문자 타입이 int에 들어가는 게 아니라
        // 코드값이 들어간다

        System.out.println( "ch : " + ch);
        System.out.println( "iNum : " + iNum);
        System.out.println();

        // 코드 값은 음수 값이 들어갈 수 없어서
        // byte 변수는 char로 들어갈 수 없음
        // ch = bNum;  은 오류남

        // char은 음수가 저장될 수 없기 떄문에 byte 을 char로 자동 형 변환 시킬 수 없다.


        double result1 = 12 + 3.3; //12.0 + 3.3  = 15.3 -> result
        // 위가 double이 아닌 int면 오류가 남


        // byte result2 = bNum + bNum;  //오류남
        // byte 타입 끼리의 연산도
        // 기본인 int로 바뀌고 연산됨
        // short result2 = sNum + sNum; // 이것도 byte와 같은 이유로 오류

        // byte, short 타입의 데이터 연산 시 무조건 int타입으로 변환 후 처리한다.

        // int result2 = bNum + bNum; // 이러면 오류나지 않음
        
        byte result2 = 10 +20;
        // 리터럴 끼리의 연산은 오류나지 않는다 
        // 연산 시점이 달라서 가능한 것임
        // 리터럴 끼리의 연산은 컴파일 시점에 연산되기 때문에 가능
        
        // 변수에 담아놨을 때만 int로 바뀌어서 연산되는 것임

        long result3 = 30 + 30; // 30+ 30 = 60, 60을 long 타입으로 형 변환 후 대입
        // (60L)
        // 연산 시점 부터 long 타입으로 바꾸고 싶으면
        long result4= 30+ 30L; // ->  30L + 30L = 60L;


        System.out.println( "result1 : " + result1);
        System.out.println( "result2 : " + result2);
        System.out.println( "result3 : " + result3);
        System.out.println( "result4 : " + result4);
        System.out.println();


    }



    /*강제 형 변환

      - 데이터 표현 범위가 큰 자료형을 작은 자료형으로 변환한다
      - 명시적으로 형 변환 타입을 적어줘야 함
    *
    *  [표현법]
       (자료형) 데이터;
    * */
    public void casting() {

        double dNum = 4.123456789;
        System.out.println( "dNum : " + dNum);
        System.out.println();


        // float fNum = dNum; // double 타입이 더 커서 오류
        // 강제 형변환 해줌 (데이터 손실)
         float fNum = (float)dNum;
        System.out.println( "fNum : " + fNum);
        // 표현할 수 있는 값의 범위가 float이 더 작아서 데이터 손실이 생김

        int iNum = (int)fNum;
        System.out.println("iNum : " + iNum);

        System.out.println((byte)290);
        // 34  -> byte 타입은 8bit로 만듦
        // 이진수로 정수를 표현하는데 강제 형변환으로
        // 데이터 손실이 생겨 전혀 다른 값이 나옴

        // int sum = iNum + dNum;
        // 실수 값이 정수형 변수에 대입될 수 없음
        // 오류 안 나게 하는 법
        // int sum = (int)(iNum+dNum);
        int sum = iNum + (int)dNum;

        System.out.println( "sum : " + sum);


    }

    /*
     * 60, 70, 66
     *
     * 총점 평균
     * */

    public void practice() {

        int lan = 60;
        int math = 66;
        int eng= 70;

        int sum = lan + math + eng;
        int avg = sum / 3;
        System.out.println("국어 점수 :"+ lan +"점");
        System.out.println("수학 점수 :"+ math +"점");
        System.out.println("영어 점수 :"+ eng +"점");

        System.out.println("총점:"+ sum);
        System.out.println("평균:"+ avg);



    }






}
