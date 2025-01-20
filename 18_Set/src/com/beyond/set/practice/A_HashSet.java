package com.beyond.set.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A_HashSet {

    public void method1(){


        Set<String> set = new HashSet();// generics 타입 지정 가능

        set.add(null); // null 값 전달 가능
        set.add("반갑습니다.");
        set.add(new String("반갑습니다."));
        set.add("여러분");
        set.add("안녕하세요");
        set.add("여러분");
        set.add(null);

        System.out.println(set); // 새로 객체로 생성해서 넣었는데 중복되는 데이터가 다 사라짐
        // 저장 순서가 없고 중복되는 데이터를 저장하지 않음
        System.out.println(set.size()); // 4
        System.out.println(set.isEmpty());
        System.out.println();

        // set은 저장 순서가 없고 인덱스 관련된 메서드가 없음


        // Set에 저장된 객체에 접근하는 방법

        // 1. 향상된 for문을 사용하는 방법
        // set은 향상된 for문으로 객체 안에 저장된 데이터를 하나씩 꺼내와서 반복처리 가능

        for ( String s : set){
            System.out.println(s);
        }
        System.out.println();


        /*
        * 람다식과 메소드 참조 활욜
        * */
        // set.forEach(System.out::println); 위와 똑같은 결과가 나옴
        // set.forEach(s -> System.out.println(s)); // 람다식 (함수적 프로그래밍)





        // 2. Hash

        // HashSet에 저장된 객체들을 ArrayList에 담아서 사용하는 방법
        List<String> list = new ArrayList<>(set); // set인터페이스를 구현한 hashset을 사용중해서 set을 넘겨줄 수 있음

        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();



        // 3. Iterator 반복자를 사용하는 방법
        Iterator<String> iterator = set.iterator(); // 반복자를 얻어옴

        while(iterator.hasNext()){ //  hasNext로 가져올 객체가 있는 지 확인
            System.out.println(iterator.next());
        }
        System.out.println();


    }

    public void method2(){



        Set<Music> musics = new HashSet<>();
        // hashset은 중복된 객체를 확인하기 위해 hashcode를 확인한다
        // 주소값으로 hashcode를 만든다
        // 동일한 hashcode를 가지고 있으면 .equals를 사용해 정말 중복된 객체인지 확인한다.

        musics.add(new Music("Whiplash", "aespa", 1));
        musics.add(new Music("Whiplash", "aespa", 1));
        musics.add(new Music("Hug", "RIIZE", 3));
        musics.add(new Music("HOME SWEET HOME", "G-DRAGON", 6));
        musics.add(new Music("HOME SWEET HOME", "G-DRAGON", 6));
        musics.add(new Music("APT", "로제", 5));
        musics.add(new Music("Who", "지민", 4));
        musics.add(new Music("HAPPY", "데이식스", 2));
        musics.add(new Music("HAPPY", "데이식스", 2));

        // new 로 새로운 객체를 만들면 전부 주소가 달라서 중복된 데이터라고 인식을 못함
        // hashcode는 주소로 만들어 다르고, .equals는 주소를 비교하기 때문에 재정의를 통해 객체의 데이터 값을 비교하도록 해야함
        // 만든 객체를 중복되지 않게 Set에 저장하려면 재정의해서 사용해야 한다

        for (Music music : musics){
            System.out.println(music);
        }
        System.out.println();


    }
}
