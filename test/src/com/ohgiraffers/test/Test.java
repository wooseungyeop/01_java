package com.ohgiraffers.test;

import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("시작");
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();
            String num3 = sc.nextLine();
            String num4 = sc.nextLine();
            String num5 = sc.nextLine();


            for (int i = 0; i < num1.length(); i++){
                System.out.print(num1.charAt(i));
                for(int j = 0; j < num2.length(); j++){
                    System.out.print(num2.charAt(j));
                    for(int k = 0; k < num3.length(); k++){
                        System.out.print(num3.charAt(k));
                        for(int l = 0; l < num4.length(); l++){
                            System.out.print(num4.charAt(l));
                            for(int m = 0; m < num5.length(); m++){
                                System.out.print(num5.charAt(m));
                            }
                        }
                    }
                }
            }


        }
    }

