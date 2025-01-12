package com.beyond.staticmember.practice;

public class C_StaticFinalField {  // shift + f6 으로 rename 가능

    // final 필드
    //final 필드는 값이 정해지고 나면 바꿀 수 없기 때문에 초기화 필요
    // 1) 선언 시 명시적으로 지정하는 방법
    //private final String gender="남자";

    // 2) 생성자를 통해 지정하는 방법
      private final String gender;



      // 상수 필드 (static final ) 선언
      // final 키워드로 값을 변경할 수 없다.

      public static final int MAX_LEVEL = 99;

    public C_StaticFinalField(String gender) {
          this.gender = gender; // 인스턴스 생성 시점에 성별을 전달해주면 나중에 변경 불가하다

      }

    public String getGender() {
        return gender;
    }

    // final 필드에 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없다.
    /*public void setGender(String gender){ // setter를 만들어도 변경 불가능(오류남)
        this.gender = gender;
    }*/





}
