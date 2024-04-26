package com.ohgiraffers.section02.loopping;

public class B_while {

    public  void testSimpleWhileStatement(){
        /*
        [while문 표현식]
        초기식 :
        whlie(조건식){
            조건식을 만족하는 경우 수행할 구문(반복할 구문);
            증감식;
         while(조건식){
            조건식을 만족하는 경우 수행할 구문
            }
         */

        // while문을 이용하여 구구단 만들기
        // 1, 초기식 작성
        // 2. while문의 조건식
        // 3. 중첩 while 조건식
        // 4. i * j
        // 5. 출력
        // 6. 중첩 while 증감식
        // 7. while 증감식
        // 8. 중첩 while의 조건 변수 초기화

        int i = 1;
        int j = 1;

        while(i < 9){
            // 반복해야 하는 대상의 길이를 알 수 없을 때 사용한다.
            // i 는 8까지 반복
            i++;    // 조건이 참일 때 i+1
            System.out.println(i + "단 " + i * j); // 2단
            while(j < 9){   // j 는 8까지
                j++;    // 조건이 참일 때 j+1
                System.out.println(i + "단 " + i * j);   // 2 + 단 + 2 * 2( ~ 9)
                // i = 2, j = 2
            }
            j = 1;  // j가 9가 되면 while을 빠져나와 다시 j = 1 초기화
            //System.out.println(i + "단 " + i * j);
        }





    }

}
