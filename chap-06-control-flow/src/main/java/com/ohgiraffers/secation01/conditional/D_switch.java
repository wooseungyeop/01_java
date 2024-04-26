package com.ohgiraffers.secation01.conditional;


import java.util.Scanner;

// D_switch라는 클래스를 모두가 사용할 수 있도록 한다.
public class D_switch { // D_switch의 시작
    // 클래스 내수 속성
    // testSimpleSwitchStatement라는 반환 값이 없는 메서드를 모두가 사용할 수 있도록 만든다.
    public Double switchCalculator() { // testSimpleSwitchStatement 메서드의 시작


        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 정수 : ");
        int num2 = sc.nextInt();

        System.out.println("연산기호 : ");
        char op = sc.next().charAt(0);

        double result = 0.0;

        switch (op){
            case '+' : result = num1 + num2; break;
            case '-' : result = num1 - num2; break;
            case '*' : result = num1 * num2; break;
            case '/' : result = num1 / num2; break;
            default: System.out.println("연산 불가");break;
        }
        return result;
        /*
        [switch문 표현식]
        switch(비교 대상 값){

            case 비교값 : 비교값이 참인 경우 실행할 구문; break;
            case 비교값 : 비교값이 참인 경우 실행할 구문; break;
            default : case에 모두 해당하지 않는 경우; break;
            }
         */

    // 계산기를 만들고 결과를 반환합니다. (switch를 이용함) 반환된 결과는 application02에서 출력해주세요
    // + - * / 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 반환 값을 0.0으로 합니다.


    }// D_switch의 종료

    // main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요
    // 100 = a+
    // 100~91 = a
    // 90 ~ 84 = b+
    // 85 ~ 76 = b
    // 75 ~ 60 = c
    // 60 미만 D
    // f는 없다.

    public void grade(int result){

        String abc = "";

        if(result == 100){
            abc = "A+";
        }
        else if(result < 100 && result > 90){
            abc = "A";
        }
        else if(result <= 90 && result > 80){
            abc = "B+";
        }
        else if(result <= 80 && result > 70){
            abc = "B";
        }
        else if(result <= 70 && result >= 60){
            abc = "C";
        }
        else{
            System.out.println("오류");
        }
        System.out.println("등급 : " + abc + " 입니다 ");
    }

    // 등급 계산기 프로그램 if 사용
    // main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요
    // 100 = a+
    // 100~95 = a
    // 90 ~ 84 = b+
    // 85 ~ 76 = b
    // 75 ~ 60 = c
    // 60 미만 D
    // f는 없다.
    // 1. 메서드를 만든다.
    // 2. 입력받는 성적을 매개변수로 전달한다.


}
