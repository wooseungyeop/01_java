package com.ohgiraffers.order.service;

import com.ohgiraffers.dto.OrderDTO;
import com.ohgiraffers.order.dao.OrderRepository;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    private final OrderRepository orderRepository = new OrderRepository();
    Scanner sc = new Scanner(System.in);



    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.
    // 배열을 만들어서 몇 개까지 입력이 되는지 확인
    // 입력 값 받아와야지
    // 반복문으로 배열의 길이만큼 입력 값을 받아서 래파지토리에 보내주기

    public String order(OrderDTO[] oreders){
        String result = orderRepository.order(orderDTO);
        return result;
        for(OrderDTO orderDTO : oreders){

        }


    }

    // 배열을 만들어서 길이를 줘
    // 배열의 길이만큼 반복 돌려
    // 1번 돌아갈 때 마다 주문할 메뉴를 입력해 뭐로? 입력문으로
    //입력문 한 번 입력 될 때 마다 래파지토리로 줘버려
    public void  orderMemu(){
        String[] members = new String[10];
        for(int i = 0; i < members.length; i++){
            System.out.println("주문할 메뉴를 넣어주세요 : ");
            members[i] = sc.next();
            orderRepository.orderMemu(members);
        }
    }

    public String orderRead() {
        orderRepository.orderRead();
        return orderRepository.orderRead();
    }

    public OrderDTO orderDetail(int num){

        OrderDTO order = orderRepository.orderDetail(num);
        return order;
    }

}

