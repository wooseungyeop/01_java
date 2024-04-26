package com.ohgiraffers.section01.section02.encapsulation.problem1;

import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);
    private int bookId;
    private String name = "어린왕자";
    private String author = "우승엽";



        //System.out.println("책의 필요한 정보를 알려주세요 : ");
        //System.out.println("1번 책 번호");
        //System.out.println("2번 책 이름");
        //System.out.println("3번 책 저자");
        //int num = sc.nextInt();


/*
    public int BookNumber(){
        int BookId = 0;

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

 */

    //------------------------------------------------------------------------
    public void Book(int bookId, String name, String author){
        this.bookId = bookId;
        this.name = name;
        this.author = author;
    }

    //--------------------------------------------------------

    public void setBookId(int bookId) {

        if (bookId > 0) {
            this.bookId = bookId;
        } else {
            System.out.println("책의 번호는 0보다 작을 수 없습니다.");
        }
    }
    public int getBookId(){
        return this.bookId;
    }

    //--------------------------------------------------------

    public void setName(String name){
        if(name.equals(getName())) {
            this.name = name;
        }

    }

    public String getName(){
        return this.name;
    }

    //-------------------------------------------------------

    public void setAuthor(String author){
        if(author.equals(getAuthor())) {
            this.author = author;
        }
    }
    public String getAuthor(){
        return this.author;
    }
}
