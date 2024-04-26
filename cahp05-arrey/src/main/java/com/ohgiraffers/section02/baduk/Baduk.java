package com.ohgiraffers.section02.baduk;

import java.util.Scanner;

public class Baduk {
    public static void main(String[] args){
        Baduk baduk = new Baduk();
        baduk.baduk();
    }

    public void baduk(){
        String[][] board = new String[2][2];        // --- 3
                                                    // [i] i개

        for (int i = 0; i < board.length; i++){     // 배열의 행의 수 19까지 반복
            for (int j = 0; j < board[0].length; j++){  // 배열의 0번째 인덱스 부터 18번째까지 길이
                board[i][j] = "[]";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        // board.length : 행의 수
        //  board.length[19][19] : 배열의 0 번째 부터 19번째까지 총 길이


        String play = "";
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[2];
        int turn = 0;
        while(!play.equals("exit")){
            System.out.println(" 첫 좌표를 입력해주세요 :");
            index[0] = scanner.nextInt();
            System.out.println(" 두 번째 좌표를 입력해주세요 :");
            index[1] = scanner.nextInt();
            if (board[index[0]][index[1]].equals("[]")) {
                if(turn % 2 == 0){
                    board[index[0]][index[1]] = "흑";
                }
                else{
                    board[index[0]][index[1]] = "백";
                }
            }
            else{
                System.out.println("같은 위치에 바둑 돌을 놓을 수 없습니다.");
                turn += 2;
                continue;
            }



            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board[0].length; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            turn ++;



        }
    }
}
