package com.interview.JZ;

import java.util.PriorityQueue;
import java.util.Queue;

public class JZ63 {

    Queue<Integer> max;
    Queue<Integer> min;

    public JZ63(){
        max = new PriorityQueue<>();
        min = new PriorityQueue<>( (o1,o2) -> o2.compareTo(o1) );
    }

    public void Insert(Integer num) {
        max.add(num);
        min.add(max.poll());
        //保持max堆中的个数 >= min堆中的个数
        if( max.size() < min.size() ){
            max.add(min.poll());
        }
    }

    public Double GetMedian() {
        if(max.size() > min.size()) return 1.0 * max.peek();
        return (max.peek() + min.peek()) / 2.0;
    }
}
