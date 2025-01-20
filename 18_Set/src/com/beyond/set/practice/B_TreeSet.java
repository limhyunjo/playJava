package com.beyond.set.practice;

import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class B_TreeSet {

    public void method1(){

        // TreeSet
        // root Node
        // 이진 트리에서 자신보다 작은 값은 왼쪽
        // 자신보다 큰 값은 오른쪽에 저장
        
        // 데이터가 저장될 때부터 정렬됨
        // comparable 인터페이스를 사용해서 저장해야 함

        TreeSet<String> ts = new TreeSet<>();
        // 중복 제거, 정렬, null 저장 X
        ts.add("하하하");
        ts.add("나나나");
        ts.add("가가가");
        ts.add("다다다");
        ts.add("다다다");
        ts.add("하하하");
        //ts.add(null); null값을 저장할 수 없음 (nullpointException 발생)

        System.out.println(ts);
        System.out.println(ts.first()); // 이 메서드를 사용하려면 TreeSet을 사용하면 됨 (가장 큰 값)
        System.out.println(ts.last());  // 가장 작은 값을 가져옴
        System.out.println();

    }


    public void method2(){

        TreeSet<Music> musics = new TreeSet<>();
        // 중복 제거됨
        // 이미 compareTo comparable 인터페이스가 구현이되어있어서 랭킹순으로 정렬된다
        // equals와 hashcode가 재정의 되어있어서 중복 제거됨

        musics.add(new Music("Whiplash", "aespa", 1));
        musics.add(new Music("Whiplash", "aespa", 1));
        musics.add(new Music("Hug", "RIIZE", 3));
        musics.add(new Music("HOME SWEET HOME", "G-DRAGON", 6));
        musics.add(new Music("HOME SWEET HOME", "G-DRAGON", 6));
        musics.add(new Music("APT", "로제", 5));
        musics.add(new Music("Who", "지민", 4));
        musics.add(new Music("HAPPY", "데이식스", 2));
        musics.add(new Music("HAPPY", "데이식스", 2));



        for (Music music : musics){
            System.out.println(music);
        }
        System.out.println();
    }
}
