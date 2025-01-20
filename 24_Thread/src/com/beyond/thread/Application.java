package com.beyond.thread;

import com.beyond.thread.practice.LoopRunnable;
import com.beyond.thread.practice.LoopThread;

public class Application {

    public static void main(String[] args) {
        // main thread

        // 스레드로 개별 실행 흐름을 만들어서 효율적으로 처리( ex) 사이트에 회원이 몰리는 경우 순서대로 처리되면 너무 느림, 개별 처리
        System.out.println("메인 스레드 실행");

        System.out.printf("%s : %d\n", Thread.currentThread().getName(), Thread.currentThread().getPriority());


        System.out.println(Thread.currentThread().getName()); // main
        // thread 타입의 객체 current thread (현재 코드를 실행하는 스레드 객체의 이름)


        LoopThread loopThread = new LoopThread();

        loopThread.setName("thread-1");

        loopThread.setPriority(10); // 실행 흐름 우선 순위
        //loopThread.setPriority(Thread.MAX_PRIORITY);

        loopThread.start(); // start가 실행되면 새로운 실행 흐름이 생긴다
        // loopthraed의 run 메소드 실행
        // main 메소드는 돌아감
        // 작업 thread에서 돌던 run 메소드가 끝나면 작업 thread는 사라짐
        //loopThread.run();
        // main thread의 코드가 짧아서 더 빨리 끝남


        // 2. Runnable 인터페이스 구현하는 방법
        Thread thread = new Thread(new LoopRunnable());
        thread.setName("thread-2");
        //thread.run();
        //thread.setPriority(1);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

        
        // 동시에 실행됨

        // 3. 익명 구현 객체로 Runnable 인터페이스의 구현 객체를 생성하는 방법(옛날 방식) 
         Thread anonymousThread  = new Thread(new  Runnable(){

             @Override
             public void run() {
                 for(int i=1;i<=100;i++){

                     System.out.printf("%s[%d]\n",Thread.currentThread().getName(),i);


                 }
             }


         });

         anonymousThread.setName("thread-3");
         anonymousThread.start();
         
         
         // Thread의 참조 변수가 Runnable 타입 
        
         // 4. 람다식으로 Runnable 인터페이스의 구현 객체를 생성하는 방법 ( 주로 람다식으로 사용)
         Thread lamdaThread = new Thread(() -> { // 매개 변수를 주거나  return하면 에러남
             // Runnable 인터페이스를 구현하는 객체로 바뀜
             
             // 객체로 만들어서 넘어감
             for(int i=1;i<=100;i++){

                 System.out.printf("%s[%d]\n",Thread.currentThread().getName(),i);

             }
         });
         
          lamdaThread.setName("daemon-thread");

          // daemon thread를 만들고 싶으면 set daemon thread true

        /*데몬 스레드
         - 보조적인 역할을 하는 스레드이다
          - 모든 스레드가 종료되면 데몬 스레드는 강제로 종료된다
        *
        * */
        lamdaThread.setDaemon(true);
        lamdaThread.start();

             // 메인에서 thread를 만들고 start하면 메인과는 별도의 실행 흐름이 생긴다 
             // run 메소드가 실행됨


        try { // 메인 스레드를 항상 마지막에 종료되게 해줌


            /*
            * join() 메서드
            *
            *  - join() 을 호출한 스레드는 해당 스레드가 종료될 때까지
            *    기다렸다가 스레드가 종료되면 join()을 호출한 스레드를 다시 실행한다.
            *
            * */

            loopThread.join(); // join을 호출한 스레드가 loopthread가 종료될 때까지 기다린다
            thread.join();
            anonymousThread.join(); // 메인이 여기까지 기다린 후 종료됨
            //lamdaThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("메인 스레드 종료");

    }

}
