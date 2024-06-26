package com.javaeagles.section01.controller;

import com.javaeagles.section01.dto.PhoneDTO;
import com.javaeagles.section01.service.Pservice;

import java.util.ArrayList;


public class Pcontorller {

    // 필수 값 누락되지는 확인해줭
    // contorller -> service 넘겨줭
    // 필수 값 누락되는지 확인하는 전화번호 등록하는 메소드 하나
    // 필수 값 누락되는지 확인하는 전화번호 수정하는 메소드 하나
    // 필수 값 누락되는지 확인하는 전화번호 삭제하는 메소드 하나
    private Pservice pservice = new Pservice();


    public String ptest(PhoneDTO phoneDTO){
        // 이름과 번호만 빈 칸이면 다시 입력해달라고 물어보기
        /*
        if(phoneDTO.getName().equals("")){

            return "이름을 다시 입력해주세요";
        }

         */
        String test = pservice.ptest(phoneDTO);
        return test;
    }

    public String ptest1(){                                             // 데이터에 있는 정보들을 삭제할 메소드 "ptest1"이라고 지정한다.
        ArrayList testList = pservice.ptest1();                         // ArrayList를 만들어 변수명 testList 만들고 pservice에 있는 ptest()를 참조 후 testList에 저장한다.
        String test = "사용자의 정보 목록" + testList.toString();          // testLine에 있는 toSting메소드 값을 test에 저장한다.
        return test;
    }

    public String ptest2(int no){
        String test = pservice.ptest2(no);
        return test;
    }

    public String ptest3(int num, int upDate,String inputData){          // 부분 수정할 메소드 명을 "ptest3"이라고 지정한다.
        if(num<=0 && upDate <=0 && inputData.equals("")) {                // 컨트롤러에는 필수 값 누락을 확인하기 위해
            return " 입력 값 넣어!!!!!!!! 넣으라고!!!!!!!!!!!!!!!!!!";       // num, upDate, inputData의 빈 값이 있는지 확인한다.
        }
        return pservice.ptest3(num, upDate, inputData);                 // 서비스에 ptest3 매개변수를 넣어준다.




    }
}
