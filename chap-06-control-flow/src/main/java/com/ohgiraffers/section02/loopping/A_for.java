package com.ohgiraffers.section02.loopping;

import java.sql.SQLType;
import java.util.Scanner;

public class A_for {

    public void testSimpleForstatement(){
        String star = "";
        for(int i = 0; i < 1; i++){ // star에 * 넣어줌

            for(int j = 0; j < 8; j++) {    // 0번째 ** 1번째
                System.out.println(star +="*");
            }
            for(int x = 1; x < 8; x++){
                System.out.println("");
            }
        }



        /*


        for(int w = 0; w <= 9; w++){
            Scanner sc = new Scanner(System.in);
            System.out.println("이름을 입력해주세요");
            String name = sc.nextLine();

            System.out.println("나이를 입력해주세요");
            int age = sc.nextInt();
            System.out.println("이름 : " + name + "나이 : " + age);


        }



        [for믄 표현식]
        for(초기식; 조건식; 증감식){
            // 조건식이 참인 경우 실행할 구문 == 반복할 구문
            }

        // i * j = value;
        // if(value % 2 == 0){}  //
        for(int i = 1; i <= 9; i++){

            for(int j = 1; j <= 9; j++){
                if(j % i == 0) { // 2 % 2 == 0 3 % 6 == 0 3 % 9 == 0
                    System.out.println(i + "단 " + i + "*" + j + " = " + i * j);
                }
            }


        }
        */

        for(int i = 2; i <= 9; i++){    // i = 2부터 시작하고 9까지 1씩 더한다.

            for(int j = 0; j <= 9; j+=i){   // j = 0부터 시작하고 9까지 j = j + i씩 더한다.
                                            // 2    2 * 2   2 * 4  3 * 3
                                            // j = j + i ==         0 = 0 + 2 ==> 2
                if(j != 0) { // j가 0 아니면 true   j == 0 true ! 부정문
                    System.out.println(i + "단 " + i + "*" + j + " = " + i * j);
                }
            }


        }





        }



    }





