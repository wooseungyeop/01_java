package com.ohgiraffers.increment;

public class Application01 {
    public static void main(String[] args){
        /*
        증감연산자
        피연산자의 앞 or 뒤에 사용이 가능하다.
        '++' : 1의 증가를 의미한다.
        '--' : 1의 감소를 의미한다.
        ++x || x++
         */

        int num = 0;
        num++;
        System.out.println(num);


        num = 0;
        int result = num++ * 10;
        System.out.println(result);
        System.out.println(num);

        result = ++num * 10;
        System.out.println(result);
        System.out.println(num);
    }
}
