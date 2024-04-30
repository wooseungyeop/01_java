package com.javaeagles.section01.dao;

import com.javaeagles.section01.dto.PhoneDTO;

import java.util.ArrayList;

public class Prepository {

    // 모든 값들을 private로 받아서 값 할당해주기
    // 할당 받은 값들을 리턴시켜주기
    // ArraryList 해주면 좋고 아니면 말고 ㅋㅋ

    private final ArrayList<PhoneDTO> tests = new ArrayList<>();                      // ArrayList형 tests 변수를 만들고 ArrayList를 생성한 후


    public String ptest(PhoneDTO phoneDTO){                         // 어디서든 접근할 수 있는 문자열 ptest를 만들고 매개변수를 phoneDTO로 만든다.
        int testname = tests.size();                                // tests에 사이즈를 만들어 정수형 testname을 저장한다.
        tests.add(phoneDTO);

        if(testname >= tests.size()){
            return "등록 실패";
        }
        return "등록 성공";
    }

    public ArrayList ptest1(){


        return tests;
    }

    public String ptest2(int no){                                   // 어디서든 접근할 수 있는 문자열 메소드 ptest2와 매개변수를 int no를 만든다.
        int testremove = tests.size();                              // tests에 있는 사이즈를 참조해서 testremove에 저장한다.
        tests.remove(no);                                           // tests에 있는 번호(no)를 삭제시켜준다.
        if(tests.size() >= testremove){                             // 리스트의 크기가 삭제 후 이전과 작거나 같다면 정보가 삭제되지 않았다고 반환해준다.
            return "에 해당되는 이름의 정보가 삭제되지 않았습니다.";
        }
        return "에 해당되는 이름의 정보가 삭제되었습니다.";
    }

    public String ptest3(int num,int upDate, String inputData)
    {
            PhoneDTO test3 = tests.get(num-1);                      // 사용자가 num의 입력 값을 받으면 1부터 시작하지만
                                                                    // ArrayList의 인덱스 값은 0부터 시작한다.
            //"ex) 1.이름 2.번호 3.그룹 4.메모 5.이메일                 // 따라서 사용자한테 받은 num의 값을 -1 해줌으로써 인덱스 값으로 변환시켜준다.
            switch (upDate) {                                       // uoDate에 해당되는 번호에 따라 inputData 값을 덮어 씌어준다.
                case 1:
                    test3.setName(inputData); //test
                    break;
                case 2:
                    test3.setPhone(inputData);
                    break;
                case 3:
                    test3.setGroup(inputData);
                    break;
                case 4:
                    test3.setMemo(inputData);
                    break;
                case 5:
                    test3.setEmail(inputData);
                    break;

                default:
                    return "Error";
            }return test3.toString();
    }
}
