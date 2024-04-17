package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args){
        Application03 app3 = new Application03();


        String Info = app3.myInfo("우승엽", 20, '남', "010-9394-1997");
        System.out.println(Info);

    }

    // public String myInfo(){}
    // 매개변수 넣기 String name, int age, char gender, String number
    // String result = name + age + gender + number;
    // return result;
    // result = app3.myInfo(result);
    // System.out.println(result)

    public String myInfo(String name, int age, char gender, String number){
        String result = name + age + gender + number;
        return result;
    }



    /*
    myInfo 함수를 만들고
    이름 : 문자열
    나이 : 정수
    성별 : 문자
    전화번호 : '-'을 포함한 전화번호
    위 4개의 자료형을 받고 main에서 출력하기
     */




}
