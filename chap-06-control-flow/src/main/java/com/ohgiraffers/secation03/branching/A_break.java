package com.ohgiraffers.secation03.branching;

public class A_break {
    /*
    break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
     */

    public void testSimpleBreakStatement(){ // 메소드 시작
        int i = 2;

        test : // 분기점 조절
        while(true){ // while 시작
            int x = 0;

            while(x <= 9){  // 두 번째 while 시작

                if(i >= 10){    // if 시작
                    break test;
                }   //if 종료

                if(x >= 5){
                    break;  // 강제 종료

                }

                if (x == 0){
                    x++;
                    continue;   // 건너 뛰기
                }

                System.out.println(i + "*" + x + "=" + i * x);
                x++;

            } //두 번째 while 종료

            i++;

        } // 첫 번째 while 종료
    } //메소드 종료
}
