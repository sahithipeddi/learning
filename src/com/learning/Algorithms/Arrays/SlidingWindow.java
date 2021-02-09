package com.learning.Algorithms.Arrays;

public class SlidingWindow {


    public static void main(String[] args) {

        int[] myArray = {1,4,2,3};

//        int[] myArray = {-1,-3,3,5,6,7};

        int slidingWindowNoOfPosition = 4;
        double[] medianSlidingWindow = medianSlidingWindow(myArray, slidingWindowNoOfPosition);

        for (int i = 0; i < medianSlidingWindow.length; i++) {

            System.out.println(medianSlidingWindow[i]);

        }
    }

    private static double[] medianSlidingWindow(int[] myArray, int slidingWindowNoOfPosition) {

        double[] medians = new double[myArray.length - slidingWindowNoOfPosition +1];

        int counter =0;

        for (int i = 0; i < (myArray.length - slidingWindowNoOfPosition +1); i++) {

            double[] slidingWindowArray = new double[slidingWindowNoOfPosition];

            for (int j = 0; j < slidingWindowNoOfPosition; j++) {

                slidingWindowArray[j] = myArray[i+j];

            }
            findMedian(slidingWindowArray, counter, medians);

            counter++;

        }

        return medians;

    }

    private static void findMedian(double[] slidingWindowArray, int counter, double[] medians) {


        for (int i = 0; i < slidingWindowArray.length; i++) {

            for(int j = i+1; j< slidingWindowArray.length; j++){

                if(slidingWindowArray[i] > slidingWindowArray[j]){

                    double temp = slidingWindowArray[i];
                    slidingWindowArray[i] = slidingWindowArray[j];

                    slidingWindowArray[j] = temp;

                }

            }

        }


        double median = 0;
        int middleofArray = (slidingWindowArray.length)/2;
        if (slidingWindowArray.length %2 == 0){

            median = (slidingWindowArray[middleofArray] + slidingWindowArray[middleofArray -1]) / 2 ;

        }else{

            median = slidingWindowArray[middleofArray];
        }

        medians[counter] = median;
    }
}