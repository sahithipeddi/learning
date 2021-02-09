package com.learning.Algorithms.binarytrees;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TokKfrequentElements {

    public static void main(String[] args) {

        int[] input = {1,1,1,2,2,3};
        int frequency = 2;
        topKFrequent(input, frequency);
    }

    private static int[] topKFrequent(int[] input, int frequency) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i: input){
            count.put(i, count.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for(int num: count.keySet()){
            queue.add(num);
            if(queue.size() > frequency){
                queue.poll();
            }
        }

        List<Integer> answer = new LinkedList();

        while (!queue.isEmpty()){
            int currentValue = queue.poll();
            System.out.println(currentValue);
            answer.add(currentValue);
        }
        Collections.reverse(answer);
        return answer.stream().mapToInt(i->i).toArray();
    }
}
