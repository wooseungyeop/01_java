package com.ohgiraffers.section01.section02.encapsulation.problem1;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        Book book = new Book();

        book.setBookId(1001);

        System.out.println("책 번호 입니다."+ book.getBookId());
        System.out.println(book.getName());
        System.out.println(book.getAuthor());

        //Monster drunkTiger = new Monster();
        //drunkTiger.name = "드렁큰타이거";
        //drunkTiger.hp = -100;

        //System.out.println(drunkTiger.name);
        //System.out.println(drunkTiger.hp);
        // --- 직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.

        //Monster monster = new Monster();
        //monster.name = "주황버섯";
        //monster.setHp(-100);
        //System.out.println(monster.hp);
        //monster.hp = -100;
        //System.out.println(monster.getHp());


    }
}
