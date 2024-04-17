package main.java.com.ohgiraffers.section01.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator;

public class Application01 {
    public static void main(String[] args){
        int first = 200;
        int second = 300;

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first, second);
        System.out.println(min);
    }
}
