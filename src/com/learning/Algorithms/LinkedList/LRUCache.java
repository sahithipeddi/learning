package com.learning.Algorithms.LinkedList;

import java.util.HashMap;
import java.util.Map;

class LRUTest{
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.get(2);
        lruCache.put(4,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }
}

class LRUCache {

    class DNode{
        int key;
        int value;
        DNode prev;
        DNode next;
    }

    public void addNode(DNode newNode){

        newNode.prev = head;
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
    }

    public void removeNode(DNode node){

        DNode previousNode = node.prev;
        DNode nextNode = node.next;

        previousNode.next = nextNode;
        nextNode.prev = previousNode;
    }


    private Map<Integer, DNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DNode head;
    private DNode tail;
    public LRUCache(int capacity) {

        this.size = 0;
        this.capacity = capacity;

        head = new DNode();
        tail = new DNode();

        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {

        DNode node = cache.get(key);
        if(node == null) return -1;
        removeNode(node);
        addNode(node);
        System.out.println("LRU get: "+node.value);
        return node.value;

    }

    public void put(int key, int value) {

        DNode node = cache.get(key);

        if(node == null){

            DNode newNode = new DNode();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            addNode(newNode);
            ++size;

            if(size > capacity){
                removeNode(tail.prev);
                cache.remove(tail.prev.value);
                --size;
            }

        } else {
            node.value = value;
            removeNode(node);
            addNode(node);
        }

    }
}



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */