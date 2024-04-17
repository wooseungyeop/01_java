package com.ohgiraffers.secation01.conditional;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){
        //A_if aIf = new A_if();
        //aIf.testSimpleIfStatement();


        Application01 app = new Application01();
        double result = app.calcaultor();
        System.out.println(result);




    }

    /*
    계산기 만들기
    두 수와 연산기호을 입력받아
    수식에 맞는 연산을 수행하는 프로그램을 만들어주세요
     */


        public double calcaultor(){
            Scanner sc = new Scanner(System.in);

            System.out.println("첫 번째 수");
            int first = sc.nextInt();

            System.out.println("두 번째 수");
            int second = sc.nextInt();
            sc.nextLine();

            System.out.println("연산기호");
            char operator = sc.nextLine().charAt(0);


            double result = 0;

            if(operator == '+'){
                result = first + second;
            }
            else if(operator == '-'){
                result = first - second;
            }
            else if(operator == '*'){
                result = first * second;
            }
            else if(operator == '/'){
                result = first / second;
            }

            return result;
        }




        // 메서드 만듬
        // 입력 받을 수 있는 기능 추가
        // 첫 번째 수를 입력받는다

        // 두 번째 수를 입력받는다
        // 연산 기호를 입력받는다
        // 연산 기호를 확인한다.
        // 연산을 진행한다.
        // 반환한다.

        // 한번에 연산식 입력받기


    /*
    public String call(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split("");
        int result1 = 0;
        if(target[1].equals("+")){
            result1 = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);

        }
        else if(target[1].equals("-")){
            result1 = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }
        else if(target[1].equals("*")){
            result1 = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }
        else{
            result1 = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);

        }
        return "" + result1;
    }
    */


}
