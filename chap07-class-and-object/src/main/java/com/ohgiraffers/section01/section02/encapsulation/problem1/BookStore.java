package com.ohgiraffers.section01.section02.encapsulation.problem1;

import java.sql.SQLType;
import java.util.Scanner;

public class BookStore {
    // 책 번호
    // 책 이름
    // 책 저자

    Scanner sc = new Scanner(System.in);
    public void BookStore() {

        while(true){
            System.out.println("책의 필요한 정보를 알려주세요 : ");
            System.out.println("1번 책 번호");
            System.out.println("2번 책 이름");
            System.out.println("3번 책 저자");
            int num = sc.nextInt();

        }

    }
    public int BookNumber(){
        System.out.println("책 번호 입력");
        int BookId = sc.nextInt();
        return BookId;
    }
    public String  BookName(){
        System.out.println("책 이름 입력");
        String BookName = sc.nextLine();
        return BookName;
    }
    public String BookAuthor(){
        System.out.println("책 저자 입력");
        String BookAuthor = sc.nextLine();
        return BookAuthor;
    }
}
