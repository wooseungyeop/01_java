package com.ohgiraffers.section05.overloading;

public class OverloadingTest {


    /*
    오버로딩이란?
    오버로딩은 동일한 이름을 가진 메서드를 생성하는 것을 의미한다.
    여기서 동일한 메서드는 생성이 불가능한데 이때 메서드의 시그니처 부분을 다르게하면
    생성이 가능하게된다. 우리가 가장 많이 사용했떤 오버로딩 메서드는 System.out.println이다.

     */

    /*
    오버로딩의 사용 이유
    매개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종있다.
    이 때, 동일한 기능이 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고
    관리하기가 매우 어려울 것이다.
    규모가 작은 프로그램의 경우 정도가 덜 하지만 규모가 거대해지면 메소드 또한 관리하기가 매우 어려워진다.
    따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름을 관리하기 위해
    사용하는 기술을 오버로딩이라고 한다.
     */
    public void test(){}

    //public String test(){return "";} 반환 값은 존재하지만 매소드가 식별되지 않음

    //private void test(){} private는 매서드 내부에서 식별이 불가능하다.

    public void test(int age){}

    public void test(String name){}

    public void test(int age, String name){}
}
