package com.beyond.abstractclass.practice;

public abstract class Sports {
    // 필드 생성

    // 참여하는 사람의 수 (공통적임)
    protected int numberOfPlayers;

    public Sports(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    // 추상 메서드 (반드시 추상 클래스 안에서만 작성해야 함)
    // 각각 스포츠마다 그에 따른 룰을 반드시 재정의해야 한다.
    public abstract void rule();
}
