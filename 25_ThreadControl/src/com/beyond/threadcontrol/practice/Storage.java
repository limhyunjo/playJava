package com.beyond.threadcontrol.practice;

public class Storage {

    private int product;

    private boolean isEmpty= true; // 객체의 상태값 저장( 비어있는지 아닌지)
    // 처음에는 비어있으니 true
    // flag 변수
    // 객체의 상태를 저장하고 흐름을 제어하기 위한 변수(필드)
    // isEmpty가 비어있으면 -> 생산 , 안비었으면 -> 소비

    public synchronized void getProduct() {

        while (isEmpty) {

            // wait예외처리 해주기
            try {
                // 객체의 잠금을 풀고(하나의 스레드가 getProduct 수행 하면 나머지 setProduct도 잠긴다)
                // syncronized를 풀고 일시 정지 상태로 만든다
                // 스레드를 일시 정지 상태로 만든다.
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("소비자가 %d번 상품을 소비하였습니다.\n", product);
        isEmpty = true; // 소비했으니 비워진다
        
        notify(); // wait()에 의해 일시정지된 상태의 스레드 중 한개를 실행 대기 상태로 만든다
    }

    public synchronized void setProduct(int product) throws InterruptedException {// 호출한 producer에서 이미 예외처리 함

        while (!isEmpty) {
            // false인 경우

            wait();

        }


        this.product = product;
        this.isEmpty =false;// 위에서 false가 되면 상품을 담아줌

        System.out.printf("생산자가 %d번 상품을 생산하였습니다.\n", product);
        notify();
    }

    // 생산하기 전에 소비하지 못하도록 synchronized 사용 (한번에 한 동작만 가능하도록 함)
    
    //synchronized로 스레드 다 멈춤 while 조건문이 true인 경우 synchronized를 풀고 wait로 일시정지 
    // -> 조건 수행 후 notify로 일시 정지된 상태의 스레드 중 하나를 대기 상태로 만들음
    
    // 다 정지 -> 처음은 빈 상태라 while문이 true wait 수행
    // -> wait로 sync 상태 풀고 일시 정지 상태로 만들어줌 -> thread 수행 ->
    // notify로 다른 스레드 수행 대기 상태로 바꿔줌 -> 상태 변화로 다른 스레드 수행 product 담아줌, isEmpty가 false가 됨
    // (while로 넘어감)-> while문이 false인 경우 반복문 나감

}
