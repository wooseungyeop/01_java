package com.ohgiraffers.section03.dto.problem1;

public class Application01 {

    public static void main(String[] args){
        String name = "송재희";
        char gender = '여';
        int age = 20;
        String phone = "010-1234-5678";
        String addrss = "인사동";

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(name, gender, age, addrss, phone);

        String name1 = "김재석";
        char gender1 = '남';
        int age1 = 19;
        String phone1 = "010-1234-5678";
        String addrss1 = "고잔동";
        memberRepository.addMember(name1, gender1, age1, addrss1, phone1);
        memberRepository.print();
    }


}
