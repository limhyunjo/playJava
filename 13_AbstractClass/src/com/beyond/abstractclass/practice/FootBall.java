package com.beyond.abstractclass.practice;

public class FootBall extends Sports{


    private int numberOfPlayers;

    public FootBall(int numberOfPlayers) {

        super(numberOfPlayers);
    }

    @Override
    public void rule(){
        System.out.printf("FootBall 선수의 수는 %d명,손이 아닌 발로 차야한다.\n", numberOfPlayers);
    }


}
