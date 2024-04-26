package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;
    // 날짜를 관리하기 위한 데이터

    // 접근 제어자 클래스명(){}
    // 기본 생성자
    public UserDTO(){

    }

    //전체 필드를 초기화 하는 생성자
    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "UserDTo{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
