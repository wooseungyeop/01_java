package com.ohgiraffers.order.dao;

import com.ohgiraffers.dto.OrderDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderRepository {
    private final ArrayList orders = new ArrayList();
    private static int count;



    public String order(OrderDTO orderDTO){
        // 0
        int oldNum = orders.size();
        orders.add(orderDTO);
        //System.out.println(orders);
        if(oldNum >= orders.size()){
            return "등록 실패";
        }
        return "등록 성공";

    }

    public String orderRead(){
        //System.out.println(this.orders);
        return "" + this.orders;
    }
    public OrderDTO orderDetail(int num){

        OrderDTO order = (OrderDTO)orders.get(num);
        System.out.println(orders.get(num));
        return order;
    }
    public void orderDelete(int num){
        orders.remove(num);
    }


}
