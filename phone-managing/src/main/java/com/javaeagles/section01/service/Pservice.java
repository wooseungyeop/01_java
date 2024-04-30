package com.javaeagles.section01.service;

import com.javaeagles.section01.dao.Prepository;
import com.javaeagles.section01.dto.PhoneDTO;

import java.sql.SQLType;
import java.util.ArrayList;
import java.util.jar.Attributes;

public class Pservice {

    // 컨트롤이랑 파인더 받은 데이터를 관리
    // 로직 수행 및 데이터 베이스에 대한 리소스를 관리
    // 등록일 경우 등록해주기
    // 수정일 경우 수정해주기
    // 삭제일 경우 삭제해주기
    // 전체조회
    // 상세조회
    // 레파지토리로 넘겨주기
    private Prepository prepository = new Prepository();

    public String ptest(PhoneDTO phoneDTO){                             // 어디서든 접근할 수 있는 문자열 ptest메소드를 만들고 매개 변수를 phoneDTO로 준다.
        if(phoneDTO.getName().equals("")){                              // phoneDTO의 이름이 빈칸일 경우 이름 입력 실패로 반환해준다.
            return "이름 입력 실패";
        }
        String test = prepository.ptest(phoneDTO);                      // 레파지토리에 있는 ptest(매개변수 : phoneDTO)를 참조해서 test에 저장한다.
        return test;                                                    // 값을 저장시킨 test를 반환해준다.
    }

    public ArrayList ptest1(){
        ArrayList testList = prepository.ptest1();
        return testList;
    }

    public String ptest2(int no){                                       // 어디서든 접근할 수 있는 문자열 메소드 ptest2와 매개변수 int no를 만든다.(ptest2는 데이터를 삭제할 메소드명)
        String test = prepository.ptest2(no);                           // 레파지토리에 있는 ptest2(매개변수 : no)를 참조해서 test에 저장한다.
        return test;                                                    // 값이 저장된 test를 반환해준다.
    }

    public String ptest3(int num, int upDate, String inputData){

        return prepository.ptest3(num, upDate, inputData);
    }
}
