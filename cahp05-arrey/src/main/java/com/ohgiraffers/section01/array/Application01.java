package com.ohgiraffers.section01.array;

import java.sql.SQLType;

public class Application01 {
    public static void main(String[] args){
        /*
        배열이란?
        동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        배열은 heap 영역에 new 연산자를 이용하여 할당한다.
         */

        /*
        배열의 사용 이휴
        만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        연속된 메모리 공간을 관리할 수 없다.
        반복문을 이용한 연속 처리가 불가능하다.
         */

        // 자료형[] 변수명 = new 자료형[길이];

         String[] bread = new String[10];
         bread[0] = "식빵";
         bread[1] = "식빵";
         bread[2] = "식빵";
         bread[3] = "식빵";
         bread[4] = "식빵";
         bread[5] = "식빵";
         bread[6] = "식빵";
         bread[7] = "식빵";
         bread[8] = "식빵";
         bread[9] = "식빵";



        //for(int i = 0; i <= 10; i++){
            //System.out.println(bread[i]);
        //}

        // 배열 선언식
        int[] iarr = new int[5];    // 0 ~ 4
        char carr[] = new char[10]; // 0 ~ 9
        iarr[2] = 10;

        iarr = null;
        System.out.println(iarr);
        iarr[0] = 10;
        System.out.println(iarr[0]);

        int result = 100;

        int newArrey[] = new int[result];
        for(int i = 0; i < newArrey.length; i++){
            newArrey[i] = 10;
        }

        //
    }
}
