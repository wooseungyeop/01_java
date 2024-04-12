package com.ohgiraffers.section02.variable;


import java.util.Scanner;

public class test1 {
    public static void main(String[] args){

        // 사칙연산에 추가로 나머지를 구하는 연산(mod)을 사용할 수 있다.
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        // 실수끼리의 연산도 사칙연산에 나머지를 구하는 연산(mod)을 사용할 수 있다.
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);

        // 정수와 실수의 연산 결과는 항상 실수
        // 정수와 실수의 연산도 사직 연산에 나머지를 구하는 연산(mod)을 사용할 수 있다.
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 % 0.5);

        // 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다.
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' % 'b');

        // 문자에 정수를 연산하는것도 가능하다.
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        //실수도 숫자이기 때문에 정수의 연산처럼 모든 연산이 가능하다
        // 결과는 실수(실수가 들어간 결과는 무조건 실수로 나타난다.)
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
    }
}
