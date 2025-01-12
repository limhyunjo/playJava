package com.beyond.enumeration.practice;

public enum Week {

    // 한정된 값만 가지는 데이터 타입을 열거 타입이라고함
    // 열거 타입에는 열거 상수를 작성
    // 열거 타입은 enum으로 만들어야 함
    // 열거 상수(대문자로 작성해야 함)
    // MONDAY_CODE     여러 단어 조합하는 경우 _ 로 조합
    MONDAY("월요일", "월",1),
    TUESDAY("화요일","화",2),
    WEDNESDAY("수요일","수",3),
    THURSDAY("목요일","목",4),
    FRIDAY("금요일","금",5),
    SATURDAY("토요일","토",6),
    SUNDAY("일요일","일",7);

    // 속성을 담을 변수 (필드)
    private final String name;
    private final String shortName;
    private final int value;


    // 필드에 초기화
    // 생성자 alt+ insert
    private Week(String name, String shortName, int value) {
        this.name = name;
        this.shortName = shortName;
        this.value = value;
    }

    // 필드는 private로 간접적으로 접근해줌

    // getter 
    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public int getValue() {
        return value;
    }
}
