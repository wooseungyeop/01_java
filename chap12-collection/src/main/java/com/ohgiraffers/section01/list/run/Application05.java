package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application05 {

    public static void main(String[] args){
        /*
        * queue
        * Queue는 선형 메모리 공간에 데이터를 저장하는
        * 선입선출(FIFO - first Input First out)방식의 자료구조이다.
        * queue 인터페이스는 상속받는 하위 인터페이스들은
        *  Deque, BlockingQueue, BlockingDeque, TransferQueue등 다양하지만
        *  대부분의 큐는 LinkedList를 이용한다.
        * */
        // queue 자체로는 인터페이스 이기 대문에 인스턴스 생성이 불가능하다.
        //Queue<String> que = new Queue();

        Queue<String> que = new LinkedList<>();
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);


        // 가장 맨 앞에 있는 요소 (먼저 들어온 요소)를 반환
        System.out.println("peek() : " + que.peek());
        System.out.println(que);
        System.out.println("poll() : " + que.poll());
        System.out.println(que);
    }
}
