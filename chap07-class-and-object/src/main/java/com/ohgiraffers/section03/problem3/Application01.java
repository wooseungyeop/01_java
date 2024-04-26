package com.ohgiraffers.section03.problem3;

public class Application01 {
    public static void main(String[] args){
        Car ram = new Car();
        ram.setName("람보르기니");
        Car po = new Car();
        CarRacer carRacer = new CarRacer();
        po.setName("포르쉐");

        CarRacer woo = new CarRacer();
        woo.setCar(ram);
        woo.myCarInfo();

        woo.starUp();

        woo.go();
        woo.stop();
        woo.turnOff();
    }
}
