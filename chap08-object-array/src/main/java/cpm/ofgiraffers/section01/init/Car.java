package cpm.ofgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed){
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
    }

    public void driveMaxSpeed(){
        System.out.println(modelName + "이 최고시속" + maxSpeed + "km/h로 달려갑니다.");
    }
}
