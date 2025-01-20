package com.beyond.list.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class A_ArrayList {

    public void method1(){

        //다 List 인터페이스를 구현중이라 오류나지 않음

         List list = new ArrayList();
        // List list = new Vector();
        // List list = new LinkedList();

        // 어떤 타입 데이터를 담을 지 지정하지 않으면 기본타입 제외 모든 참조타입을 저장할 수 있게됨 (object 타입)

        // list에서 객체를 저장할 때는 add() 메소드 사용
        list.add("안녕하세요.");
        list.add(LocalDateTime.now());
        list.add(3.14); // autoBoxing으로 참조객체로 만들어서 저장해줌
        list.add(false);
        list.add('a');


        System.out.println(list); // 객체들의 toString값을 찍어줌 (인덱스로 읽어온다)
        System.out.println(list.size()); // list에 담긴 객체의 수를 return
        System.out.println();


        //String str = list.get(0); // String 타입의 데이터를 저장했지만 모든 타입의 데이터를 받기 위해 Object로 데이터를 받고 반환한다
        // 자식 타입의 객체에 부모 타입을 담을 수는 없다
        // 저장할 떄는 Object로 업캐스팅했지만 꺼낼 때는 다운캐스팅 해야함

        // 아래처럼 형변환 해줘야함
        String str = (String)list.get(0);
        LocalDateTime now = (LocalDateTime) list.get(1);
        Double number = (Double) list.get(2);
        System.out.println(str);
        System.out.println(now);
        System.out.println(number);
        System.out.println();


        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));// 객체의 참조값을 주면 내부적으로 toString을 함
            // Object 타입인데 toString이 오류가 안남 -> 위는 대입이라서 타입을 맞춰주느라 형변환 한거임
        }
        System.out.println();


        // List는 중복 데이터 저장 가능

        list.add("안녕하세요.");
        list.add(null);
        list.add(null);

        System.out.println(list); // list는 객체의 중복 데이터 저장 허용
        System.out.println();
        
        // index 번호를 지정해서 넣을 수 있음
        // 원하는 인덱스 위치에 객체를 추가할 수 있음
        list.add(2, 10000);

        // 원하는 인덱스 위치에 객체를 변경할 수 있음
        list.set(2, false);
        System.out.println(list);
        System.out.println();

        // 지정된 객체를 삭제할 때는 remove()메소드를 사용한다
        list.remove(2);
        list.remove("안녕하세요."); // 데이터 중복을 허용하고 object를 지울때는 가장 먼저 발견된 객체를 삭제한다
        // 다 삭제하고 싶으면 한 번 더 적어야함
        //list.remove("안녕하세요.");
        list.remove(null);
        list.removeLast(); // 마지막 인덱스를 삭제
        list.remove(Integer.valueOf(2)); // 제거할 떄 인덱스와 값이 헷갈리는 경우 객체 값을 그대로 명시해야 함

        list.clear(); // list에 저장된 객체를 모두 삭제하는 메소드이다


        System.out.println(list.isEmpty()); // list가 비어있는지 확인하는 메소드 (true/ false)
        System.out.println(list);
        System.out.println();

        // list 메소드
        // .isEmpty()
        // .clear()
        // .remove()
        // .add()
        // .set()
        // .size()
        // .get()


    }


    public void method2(){

        // type parameter 매개값으로 String 타입을 줌
        // List<E> - generics type
        List<String> fruits = new ArrayList/*<String> 은 생략 가능 <- 타입 추론(선언 부분에서 보고 앎)*/();

        // list에는 객체만 저장 가능
        // list는 type parameter를 전달받아 사용한다
        // type parameter를 정해주지 않으면 object 즉 모든 타입의 데이터를 저장한다
        // List<E> -> generics 를 사용하는 것은 저장할 타입을 지정하기 위한 것임

        // 타입을 정해주지 않으면 컬렉션에 저장된 객체를 꺼내서 사용할 떄 매번 형 변환(다운 캐스팅)을 하지 않아도 됨

        // type Paramter는 클래스 타입만 올 수 있음 / 기본 타입만 오도록 만드려면 ?
        // Wrapper 클래스 사용
        // List<int> numbers; //-> 오류남
          List<Integer> numbers = new ArrayList<>();
        // list에 객체를 Object가 아닌 생성 시점부터 어떤 타입을 저장하고 싶은지 적어놓는 것임

        
        // 아무것도 넣지 않으면 빈배열 [] 출력됨
        
        fruits.add("banana"); // String 타입만 add 가능
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("grape");

        // generics로 이미 String을 줘서 get으로 꺼낼 때도 형변환을 할 필요가 없다
        numbers.add(Integer.valueOf(8)); // 형변환
        numbers.add(Integer.valueOf("1")); // valueOf로 객체의 데이터만 읽어서 integer로 형변환
        numbers.add(7);
        numbers.add(10);
        numbers.add(3);
        numbers.add(2);



        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println();


        // 리스트 정렬
        //오름차순 정렬 .sort() // 유니코드, 사전에 있는 순서대로 오름차순으로 정렬

        // 배열에서는 Arrays.sort()를 사용했음
        Collections.sort(fruits);
        Collections.sort(numbers);
        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println();

        // 내림차순
        // 오름차순으로 정렬 후 역순으로 출력
        // Collections.reverse(fruits);
        // Collections.reverse(numbers);
        Collections.sort(fruits, Collections.reverseOrder());
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println();


        // String, Integer는 기본적으로 자바에서 제공해주는 메서드
        // CompareTo() 가 정렬 기준을 알려줌


    }


    public void method3(){

        List<Music> musics = new ArrayList<>();
        musics.add(new Music("Whiplash", "aespa", 1));
        musics.add(new Music("Hug", "RIIZE", 3));
        musics.add(new Music("HOME SWEET HOME", "G-DRAGON", 6));
        musics.add(new Music("APT", "로제", 5));
        musics.add(new Music("Who", "지민", 4));
        musics.add(new Music("HAPPY", "데이식스", 2));


        for (Music music : musics) {
            System.out.println(music);
        }
        System.out.println();

        // 오름차순으로 list 정렬 방법
        // 정렬 기준만 주면 sort가 알아서 정렬해줌
        Collections.sort(musics);

        // 1. music 클래스에 정렬하는 인터페이스 구현
        for (Music music : musics) {
            System.out.println(music);
        }
        System.out.println();


        // 2. 아티스트 순으로 리스트를 오름차순 정렬
        Collections.sort(musics, new ArtistAscending()); // comperator 객체를 만들어서 전달해줌

        for (Music music : musics) {
            System.out.println(music);
        }
        System.out.println();



        // 3. 타이틀 순으로 오름차순
        // 인터페이스는 객체로 만들 수 없다( 추상메서드를 가지고 있어서)
        //  클래스를 만들고 클래스로 구현하면 객체로 만들 수 있음
        // 추상 메서드를 인터페이스 안에서 직접 구현해버림 -> 에러 없음

       /* Collections.sort(musics, new Comparator<Music>() {
            // 여기서 만들면 익명의 클래스로 만들어짐(인터페이스의 추상메서드를 직접 구현)
            // 이 때 만들어진 클래스는 이름이 없어서 익명 구현 객체라고 한다!
            // 익명 클래스를 만들면 인터페이스의 추상 메서드를 다 재정의 해줘야 함
            @Override
            public int compare(Music music1, Music music2) {
                return music1.getTitle().compareTo(music2.getTitle());
            }
        });*/

        // -> 위보다 더 간단한 방법 (람다식 사용 -> 클래스가 만들어지지 않고 인터페이스 구현 객체가 만들어져서 넘어감)
        Collections.sort(musics, (Music music1, Music music2)->  music1.getTitle().compareTo( music2.getTitle()));

        for (Music music : musics) {
            System.out.println(music);
        }
        System.out.println();





    }
}
