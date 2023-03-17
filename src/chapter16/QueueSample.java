package chapter16;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> collect = new PriorityQueue<>(3);//programming to Interface
        //Programming to implementation.
        collect.offer(1);
        collect.offer(2);
        collect.offer(3);
        collect.offer(4);
        System.out.println(collect.peek());
        System.out.println(collect.poll());

        System.out.println(collect);
    }
    }

