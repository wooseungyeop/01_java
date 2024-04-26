package com.ohgeraffers.section02.superkeyaord;

import java.util.Date;

public class Computer extends Product {
    /* 설명. Computer는 하나의 Product이지만, 모든 Product는 Computer가 아니다. (IS-A) */

    private String cpu;					//cpu
    private int hdd;					//hdd
    private int ram;					//ram
    private String operationSystem;		//운영체제

    /* 설명. 기본생성자 */
    public Computer() {

        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    /* 설명. 모든 필드를 초기화하는 생성자 */
    public Computer(String cpu, int hdd, int ram, String operationSystem) {

        /* 설명. 부모클래스의 기본생성자 호출 */
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    /* 설명. 부모의 필드도 모두 초기화하는 생성자 */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem) {

        /* 설명. 부모의 모든 필드를 초기화하는 생성자로 Product클래스가 가진 필드를 초기화 할 값 전달 */
        super();

        /* 설명. 나머지 필드를 초기화 */
//		this(cpu, hdd, ram, operationSystem);	//에러남

        /* 설명.
         *  위처럼 하고싶지만 this()로 위에 작성한 생성자를 호출한다는 의미는
         *  super()를 두 번 호출하는 것과 같기 때문에 허용되지 않는다.
         *  부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한 번만 호출 가능하다.
         * */

        /* 설명. 나머지 필드는 그냥 작성함 */
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출함...");
    }

    /* 설명.
     *  setter와 getter는 부모 필드의 메소드에 대해서는 자신의 것 처럼 사용 가능하다.
     *  따로 작성할 필요 없이 부모클래스에 작성한 것을 사용할 수 있다.
     *  따라서 자식클래스에 추가된 필드에 대해서만 setter/getter를 작성하면 된다.
     * */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    /* 설명. Product 클래스에 작성한 getInformation클래스를 오버라이딩 해서 작성한다. */

    @Override
    public String getInformation() {
        return "Computer ["
                + "cpu=" + this.cpu
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", operationSystem=" + this.operationSystem
                + "]";
    }
}
