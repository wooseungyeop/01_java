package com.javaeagles.section01;

import com.javaeagles.section01.controller.Pcontorller;
import com.javaeagles.section01.dto.PhoneDTO;

import java.util.Scanner;

public class Application {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                                    // 입력문을 받을 때 스캐너 선언.
        Pcontorller pcontorller = new Pcontorller();                            // 컨트롤러를 컨트롤러 변수로 저장.
        boolean phone1 = true;                                                  // true or false 타입으로 만들어서 변수명을 true 지정.
        String test = "";                                                       // 문자열 타입으로 변수에 빈 값 생성.


        while (phone1){
            System.out.println("=====전화번호부(그림)=====");
            System.out.println("1. 전화번호 등록");
            System.out.println("2. 전화번호 수정");
            System.out.println("3. 전화번호 삭제");
            System.out.println("4. 전화번호 전체조회");
            System.out.println("5. 전화번호 상세조회");
            System.out.print("무엇을 도와드릴까요? : ");
            int input = sc.nextInt();                                           // input변수로 사용자에게 정수형 타입으로 입력받기
            sc.nextLine();                                                      // 정수형 타입으로 입력을 받으면 버퍼에 남아있는 개행 문자(\n)를 소비하기 위해 만들어준다.
            switch (input){
                case 1 :
                    System.out.print("이름 : ");// 이름
                    String name = sc.nextLine();

                    System.out.print("전화번호 : ");// 전화번호
                    String phone = sc.nextLine();

                    System.out.print("그룹 : ");// 그룹
                    String group = sc.nextLine();

                    System.out.print("메모 : ");// 메모
                    String memo = sc.nextLine();

                    System.out.print("이메일 : ");// 이메일
                    String email = sc.nextLine();

                    test = pcontorller.ptest                                    // 컨트롤러에 전체조회 메소드명을 "ptest"로 지정했다.
                            (new PhoneDTO(name, phone, group, memo, email));    // DTO안에 사용자에게 입력된 값을 받아 컨트롤러에 있는 "ptest"메소드에 보내준다
                                                                                // 컨트롤러에게 할당받은 값을 test로 저장한다.
                    break;
                case 2 :
                    // 수정
                    // 수정하고 싶은 이름 입력
                    // 입력 받은 이름을 조회하고 존재하는 확인
                    // 존재하면 true 수정할 항목선택 존재하지않으면 false
                    // 컨트롤러 넘겨
                    break;
                case 3 :
                    System.out.println("삭제할 번호를 입력해주세요 : ");            // 할당 받은 데이터 안에 삭제하고 싶은 정보의 번호를 입력한다. (인덱스에 들어간 번호는 0번 부터 시작된다.)
                    int no = Integer.parseInt(sc.nextLine());                  // 정수형 변수를 만들어 nextLine으로 사용자가 입력한 번호를 받아 정수형으로 강제 변환해준다.
                    test = no + "번";                                           // no 라는 정수형에 문자열 "번"을 추가하고 test에 값을 저장한다.
                    test += pcontorller.ptest2(no);                            // pcontorller 객체를 사용하여 입력받은 번호에 대한 정보를 조회하여 test 변수에 추가한다.
                    break;
                    // 삭제

                    // 삭제하고 싶은 이름 입력
                    // 입력 받은 이름을 조회하고 존재하는지 확인
                    // 존재하면 true 전체삭제 존재하지 않으면 false
                    // 컨트롤 넘겨
                    // 컨드롤에서 다시 받아서 출력
                case 4 :
                    System.out.println("사용자의 전체 조회입니다.");// 전체조회
                    test = pcontorller.ptest1();// 등록된 번호 모두 조회
                    break;
                    // 넘겨
                case 5 :
                    // 상세조회
                    // 이름을 입력 받아 존재하는지 확인
                    // 있으면 모든 정보 조회 없으면 false
                    // 넘겨
                default:
                    System.out.println("잘못 입력 됐습니다.");
                    break;

            }
            System.out.println(test);
            System.out.println("계속 하시겠습니까?");
            phone1 = sc.nextBoolean();
        }



    }
}
