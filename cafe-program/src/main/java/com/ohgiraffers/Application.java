package com.ohgiraffers;

import com.ohgiraffers.dto.OrderDTO;
import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dao.OrderRepository;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // OrderController 불러오기 변수명 = 생성자 클래스 OrderController
        OrderController orderController = new OrderController();
        boolean order = true;
        String result = "";



            //몇 개의 음료를 받을지 출력문으로 물어본다.
            //몇 개의 음료를 받을지 입력문으로 사용자에게 받는다.
            //음료가 몇 개인지 입력을 받고 DTO로 받는다.
            //orders의 길이만큼 메뉴와 수량 가격을 입력 받는다.
            //입력 받은 값들을 orders배열에 저장한다.
            //


        while(order){
            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠나요?");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1 : // 주문 등록


                    System.out.println("몇개의 음료를 주문하시겠습니까?");
                    int cnt = sc.nextInt();
                    sc.nextLine();          // int 20\n, int age 20   char '남'      \n
                    OrderDTO[] orders = new OrderDTO[cnt];
                    for(int i = 0; i < orders.length; i++) {
                        System.out.println("주문할 메뉴 이름을 등록해주세요 : ");
                        String menuName = sc.nextLine();

                        System.out.println("수량을 입력해주세요 : ");
                        int quantity = sc.nextInt();

                        System.out.println("가격을 입력해주세요 : ");
                        int price = sc.nextInt();
                        orders[i] = new OrderDTO(menuName, price, quantity);


                    }
                    result = orderController.order(orders);

                    break;
                case 2 : // 주문 삭제
                    System.out.println("삭제할 정보 입니다.");
                    //orderController.orderDelete();
                    break;
                case 3 : // 주문 수정
                    orderController.orderModify();
                    break;
                case 4 : // 주문 상세조회
                    //System.out.println(orderController.orderRead());
                    System.out.println("주문 상세조회입니다. 번호를 입력해주세요 : ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    result = orderController.orderDetail(num);

                    break;
                case 5 : // 주문 전체조회
                    System.out.println("주문 전체조회 입니다. ");
                    result = orderController.orderRead();

                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }
            System.out.println(result);

            System.out.print("주문을 계속하시겠습니까??");
            order = sc.nextBoolean();
        }
    }
}
