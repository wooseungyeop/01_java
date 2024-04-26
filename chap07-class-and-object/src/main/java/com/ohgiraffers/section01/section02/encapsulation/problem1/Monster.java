package com.ohgiraffers.section01.section02.encapsulation.problem1;

import java.util.Scanner;

public class Monster {

    String name;
    private int hp;

    // monster의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자 함.
    public void setHp(int hp){ // setHp시작
        if(hp > 0){
            this.hp = hp;
        }
        else{
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }
    }// setHp 종료

    public int getHp(){
        return this.hp;
    }
    // 책, 사람, 도서관class , 책 등록, 책 반납, 책 대여,책(필드)
    // 사람 : 대여(메소드), 반납(메소드),이름, 책






}

