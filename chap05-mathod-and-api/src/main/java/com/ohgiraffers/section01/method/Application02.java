package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String [] args)
    {
        /*
        전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
         */
        /*
        변수의 종류
        1. 지역변수
        2. 매개변수
        3. 전역변수(필드)
        4. 클래스(static)변수
         */

        /*
        지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다,.
        이 때 전달하는 값을 전달인자(argument)라고 부르고
        메소드 선언부 괄호안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         */
        int age = 20;
        Application02 app1 = new Application02();




        int result = app1.add(1, 2);
        System.out.println(result);

    }

    public int add(int x, int y){ // public 접근 제어자 int age아규먼트

        return x + y;
    }
}
