package com.ohgiraffers.section03.copy;

import java.beans.beancontext.BeanContextChild;

public class Application01 {
    public static void main(String[] args){
        String[] goldSideName = {"김재석", "송재희", "황정한"};
        String[] names = goldSideName;

        System.out.println(goldSideName);
        System.out.println(names);
        goldSideName[0] = "김효주";
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);   //얕은 복사
        System.out.println("------깊은 복사------");

        // 깊은 복사
        goldSideName = new String[] {"김재석", "송재희", "황정한"};  // 변수명을 새롭게 할당하는 것이 불편해서 임시로 사용
        names = new String[3];
        // for each
        int i = 0;
        for(String name : goldSideName){
            names[i] = name;
            i++;
        }
        goldSideName[0] = "이상우";
        for (String name : names){
            System.out.println(name);
        }
    }

}
