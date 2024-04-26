package com.ohgiraffers.order.controller;

import com.ohgiraffers.dto.OrderDTO;
import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.service.OrderService;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderController {
    private final OrderService orderService = new OrderService();
    Scanner sc = new Scanner(System.in);


    public String order(OrderDTO[] orders){
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.

        for(OrderDTO orderDTO : orders)
            if(orderDTO.getQuantity() <= 0){
                return "수량을 입력해주세요";
            }
            if(orders.getPrice() <= 0){
                return "땅 파서 장사하냐?";
            }
            return OrderService.order;
        }


        // service 로직으로 넘김
        String result = orderService.orders(orders);
        return result;
    }
    /*
    public String orderDelete(){

        System.out.println("삭제할 번호를 입력해주세요 : ");
        int num = sc.nextInt();
        orderRepository.orderDelete(num);
        return "주문 삭제";
    }
     */

        public String orderModify(){
        return "주문수정";
    }
    public String orderRead(){
        orderService.orderRead();

        return orderService.orderRead();

    }

    public String orderDetail(int num){
        if( num < 0 ){
            return "번호를 잘못 입력하셨습니다.";
        }
        orderService.orderDetail(num);

        return "" + num;

    }



}
