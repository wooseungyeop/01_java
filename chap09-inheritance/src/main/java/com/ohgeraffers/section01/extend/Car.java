package com.ohgeraffers.section01.extend;

public class Car {

    private boolean runningStatus;



    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨");
    }
    /*

    public Car() {
        super(); // object라는 부모
    }

     */

    public void soundHorn(){
        if(isRunning()){
           System.out.println("빵! 빵!");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경직을 올릴 수 없습니다.");
        }
    }

    //private boolean isRunning(){
        //return runningStatus;
    //}


    protected boolean isRunning(){
        return runningStatus;
    }



    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
        public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
        public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
}
