package com.learning.mutlthreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TrafficControlDeadLock {

    public static void main(String[] args) {

        Intersection intersection = new Intersection();
        Thread trainAThread = new Thread(new TrainA(intersection));
        Thread trainBThread = new Thread(new TrainB(intersection));
        trainAThread.start();
        trainBThread.start();

    }

    public static class TrainA implements Runnable{


        private Intersection intersection;
        private Random random = new Random();

        public TrainA(Intersection intersection){
            this.intersection = intersection;
        }

        @Override
        public void run() {

            while (true){
                long sleepingTime = random.nextInt(5);
                try {
                    Thread.sleep(sleepingTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                intersection.takeRoadA();
            }
        }
    }

    public static class TrainB implements Runnable{


        private Intersection intersection;
        private Random random = new Random();

        public TrainB(Intersection intersection){
            this.intersection = intersection;
        }

        @Override
        public void run() {

            while (true){
                long sleepingTime = random.nextInt(5);
                try {
                    Thread.sleep(sleepingTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                intersection.takeRoadB();
            }
        }
    }
    public static class Intersection{

        private Object roadA = new Object();
        private Object roadB = new Object();

        Lock lock = new ReentrantLock();

        public void takeRoadA(){
            lock.lock();
            lock.unlock();
            synchronized (roadA){
                System.out.println("Road A is locked by Thread: "+ Thread.currentThread().getName());
            }

            synchronized (roadB){
                System.out.println("Train is passing through road A");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void takeRoadB(){
            synchronized (roadB){
                System.out.println("Road B is locked by Thread: "+ Thread.currentThread().getName());
            }

            synchronized (roadA){
                System.out.println("Train is passing through road B");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
