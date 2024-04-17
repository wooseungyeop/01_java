package main.java.com.ohgiraffers.section01.method;

public class Application05 {

    public static void main(String[] args){
        Application05 app = new Application05();
        Application05 app1 = new Application05();

        int x = 10;
        int y = 3;




        int result1 = app.plus(x, y);
        System.out.println(result1);

        int result2 = app.minus(x, y);
        System.out.println(result2);

        long result3 = app.multiply(x, y);
        System.out.println(result3);

        double value = app.divide(x, y);
        System.out.println(value);

        boolean value1 = app1.valueCheck(x, y);
        int num = app1.maxNumberOf(x, y);


        

    }

    public int plus(int x, int y){
        int result1 = x + y;
        return result1;
    }

    public int minus(int x, int y){
        int result2 = x - y;
        return result2;
    }

    public long multiply(int x, int y){
        long result3 = x * y;
        return result3;
    }

    public double divide(int x, int y){
        double value = x / (double)y;

        return value;
    }

    public boolean valueCheck(int x, int y){
        boolean value1 = (x == y)? true : false;
        return value1;
    }

    public int maxNumberOf(int x, int y){
        int num = (x > y)? x : (x == y)? 0 : y;
        return num;
    }

    public boolean rangeNum(int x, boolean value){
        boolean result = ((x > 0) && (x < 100))? true : false;
        return result;
    }

}
