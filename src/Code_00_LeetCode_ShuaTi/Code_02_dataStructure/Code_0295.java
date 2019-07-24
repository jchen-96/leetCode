package Code_00_LeetCode_ShuaTi.Code_02_dataStructure;

//https://leetcode-cn.com/problems/find-median-from-data-stream/

import javax.swing.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Code_0295 {
}

class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /**以下是对比较器升序、降序的理解.
                 *(1) 写成return o1.compareTo(o2) 或者 return o1-o2表示升序
                 *(2) 写成return o2.compareTo(o1) 或者return o2-o1表示降序
                 */
                return o2.compareTo(o1);
            }
        });
    }

    public void addNum(int num) {
        if(minHeap.isEmpty()){
            minHeap.offer(num);
            return;
        }
        if(maxHeap.isEmpty()){
            maxHeap.offer(num);
            return;
        }
        if(maxHeap.size()==minHeap.size()){
            shuffle(maxHeap,minHeap);
        }
        if(maxHeap.size()==minHeap.size()){

            if(num<=maxHeap.peek()){
                maxHeap.offer(num);
            }else{
                minHeap.offer(num);
            }
            return;
        }
        if(maxHeap.size()>minHeap.size()){
            minHeap.offer(num);
            shuffle(maxHeap,minHeap);
            return;
        }
        if(minHeap.size()>maxHeap.size()){
            maxHeap.offer(num);
            shuffle(maxHeap,minHeap);
            return;
        }
    }
    private void shuffle(PriorityQueue<Integer> maxHeap,
                         PriorityQueue<Integer> minHeap){
            if(minHeap.peek()<maxHeap.peek()){
                int minP=minHeap.poll();
                int maxP=maxHeap.poll();
                maxHeap.offer(minP);
                minHeap.offer(maxP);
            }
            return;

    }

    public double findMedian() {
        if(maxHeap.isEmpty()&&minHeap.isEmpty()){
            return -1;
        }
        if(maxHeap.isEmpty()){
            return minHeap.peek();
        }
        if(minHeap.isEmpty()){
            return maxHeap.peek();
        }
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+minHeap.peek())/2.0;
        }else if(maxHeap.size()>minHeap.size()){
            return maxHeap.peek();
        }else{
            return minHeap.peek();
        }

    }

//    public static void main(String[] args) {
//        MedianFinder medianFinder=new MedianFinder();
//        medianFinder.addNum(1);
//        medianFinder.addNum(2);
//        System.out.println(medianFinder.findMedian());
//        medianFinder.addNum(3);
//        System.out.println(medianFinder.findMedian());
//
//    }
}
