package com.ohgiraffers.section04.overflow;

public class Appcation01 {
    public static void main(String[] agrs){

        // 자료형 별 값의 최대 범위를 벗어나느 경우 발생한 carry를 버림처리 하고 sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " + num1 );
        num1++;

        System.out.println("byte num : " + num1);

        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println("first Num = secondNum = " + (multi));

        long longMulti = firstNum * secondNum;
        System.out.println("first Num * secondNum = " + longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);
    }
}
