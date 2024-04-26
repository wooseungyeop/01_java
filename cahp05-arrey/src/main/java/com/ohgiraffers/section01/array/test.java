package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class test {


    public static void main(String[] args) {
    /*
    A학생의 평균 점수를 구하는 프로그램을 만들어주세요
    시험의 과목은 5개로 점수는 정수 단위 입니다.
    5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다
    예) A학생의 수학 : 90점, 영어 : 80점, 국어 : 100점, 과학 : 79점, 사회 : 80점이며 평균은 x 입니다.
     */

        // n개의 정수를 입력받아 n번 반복
        // n개의 개수 만큼 정수 입력받기
        // n개의 정수를 입력받은 곳에서 최소값 찾기
        // n개의 정수를 입력받은 곳에서 최대값 찾기

        Scanner sc = new Scanner(System.in);                // 입력문 받기
        System.out.println("몇 개의 정수를 입력하겠습니까? ");   // 정수 몇 개 받을지 출력
        int N = sc.nextInt();                               // 정수형 N개의 입력
        int[] n = new int[N];                               // 정수형 배열 n을 N의 길이로 선언

        for(int i = 0; i < N; i++){
            System.out.println("정수를 입력해주세요 : ");
            n[i] = sc.nextInt();
        }
        int min = n[0];

        for(int i = 0; i < n.length; i++){
            if(n[i] < min){
                min = n[i];
            }

        }
        System.out.println(min);
        /*

        for(int i = 0; i < n; i++) {
            System.out.println("정수를 입력해주세요 : ");
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
            System.out.println(max);
        }

         */

        /*

        int[] value = new int[5];
        double total = 0;


        for(int i = 0; i < value.length; i++){      // 조건식의 길이 => 배열의 길이를 알려주는 length로 대체
            Scanner sc = new Scanner(System.in);
            value[i] = sc.nextInt();                // 자료형 변수 입력 받기 => 배열의 i번째로 입력 받기 대체

            System.out.println("과목 점수 : " + value[i]);  // 출력문에 변수명을 넣기 => value 배열에 i번째로 대체

            total += value[i];                      // 변수1 = 변수1 + 변수2 => 변수1 + 배열 i번째로 대체
        }

        double avg = total/ value.length;           // 평균값 변수 = 총과목 점수 / 과목 계수 => 총과목 점수 / 배열의길이로 대체
        System.out.println("평균 : " + avg);


         */

    }
    // 메소드 만들기
    // 입력문 만들어서 과목 점수 입력받기
    // for문으로 과목 5개 입력 받기
    // 과목 점수 받고 평균 구하기


    














    /*
    public void avg(){  // avg 메소드 만들기 동일한 자료형을 넣는다 => 배열
        Scanner sc = new Scanner(System.in);    // 입력문 받기
        int[] score = new int[5];               // 정수형 배열 score 만들고 int[5] 크기만큼 만들기
        int result = 0;                         // result 0으로 초기화
        for(int i = 0; i < score.length; i++){  // for문 i = 0 초기화 i 는 score길이보다 작게 설정 i는 1씩 증가
            score[i] = sc.nextInt();            // score 배열 변수를 입력 받기
            result += score[i];                  // result는 score[i] 만큼 + => 0번째 1번째 2번째 3번째
        }
        double avg = result/score.length;        // 실수 자료형 avg 만들고 result에 score 길이만큼 나누기

        String[] subject = {"수학", "영어", "국어", "과학", "사회"};  // 문자열 배열 subject 만들어서 문자열 넣기

        for(int i = 0; i < score.length; i++){  // i = 0, i 는 스코어 길이보다 작을 때까지 i +1 증감
            System.out.print(subject[i] + " : " + score[i] + " ");
        }

        System.out.println("평균점수 : " + avg);
    }
     */

}
