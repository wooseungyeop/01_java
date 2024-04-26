package com.ohgeraffer.section01.polymorphim;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 준나게 달려가아아ㅏㅏ");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 운다");
    }

    public void jump(){
        System.out.println("토끼 슈퍼점프.");
    }
}
