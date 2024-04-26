package com.ohgeraffer.section01.polymorphim;

public class Tiger extends Animal{
    public Tiger() {
    }

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 달리지 않습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다.");
    }

    public void bite(){
        System.out.println("호랑이가 물어뜯습니다.");
    }
}
