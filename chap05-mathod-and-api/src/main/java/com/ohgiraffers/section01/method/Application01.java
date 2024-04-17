package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args){
        /*
        메소드
        메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.

         */
        System.out.println("main() 시작됨....");

        // 객체 중에 메소드 기능을 하나 만들어준다.
        // 하나의 자료형을 만들어 줄 수 있는 걸.....
        Application01 app1 = new Application01(); // 참조 자료형 래퍼런스타입
        app1.methodA();

        System.out.println("main() 종료됨 ..");

    }

    public void methodA(){ // public 접근 제어자 void 반환 타입 methodA 메소드 이름
        System.out.println("methodA() 시작됨");
        methodB();

        System.out.println("methodA() 종료함");

    }

    public void methodB(){
        System.out.println("methodB() 시작됨");
        methodC();
        System.out.println("methodB() 종료됨");
        // 모든 매소드는 return을 만나야 끝난다.
    }


    public void methodC(){
        System.out.println("methodC() 시작됨");
        System.out.println("methodC() 종료됨");
    }
}
