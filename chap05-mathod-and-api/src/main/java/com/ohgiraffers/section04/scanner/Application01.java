package main.java.com.ohgiraffers.section04.scanner;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        Application01 app = new Application01();
        String info = app.inputInfo();
        System.out.println(info);


        /*
        Scanner sc = new Scanner(System.in); // Scanner : 사용자 정의 타입
        // sc 변수명 == 메모리 주소 == 값

        System.out.print("당신의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 당신의 이름은 : " + name + "입니다.");

        System.out.println("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("당신의 나이는 " + age + "세 입니다");
        */

    }
    /*
    inputInfo 메서드를 만들고
    사용자의 이름 키 성별 나이를 입력받아 main에서 출력
     */
    //inputInfo 메서드 만듬
    //사용자에게 값을 입력받는다.
    // 키 나이 성별 이름을 입력받아 문자열로 합친다.
    // 문자열로 반환한다.
    // public String inputInfo(String name, float hight, char gender, int age){} 함수 만들기
    // Application01 app = new Application01();
    // String result = name + hight + gender + age;


    public String inputInfo(){

        Scanner sc = new Scanner(System.in);

        System.out.println(" 키 ");
        double hight = sc.nextDouble();
        sc.nextLine();

        System.out.println(" 나이 ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println(" 성별 ");
        char gender = sc.nextLine().charAt(0);


        System.out.println(" 이름 ");
        String name = sc.nextLine();



        return "당신의 이름은 : " + name + "입니다. \n" + "당신의 나이는 : " + age + "입니다 \n" + "당신의 키는 : " + hight + "입니다 \n" + "당신의 성별은 : "
        + gender + "입니다";
    }
}
