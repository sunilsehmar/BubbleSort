package com.sparta.ss;

import java.util.Arrays;
import java.util.Random;

public class bubbleSort {

    public static void main(String[] args) {

        int[] listArray = {1, 4, 7, 2, 8};

        System.out.println(Arrays.toString(bubbleSorting(listArray)));

    }

    static int[] oneIterationSort(int[] search){
        int temp;
        for ( int elememt = 0; elememt < search.length - 1; elememt++){
            if (search[elememt] > search[elememt + 1]){
                temp = search[elememt];
                search[elememt] = search[elememt + 1];
                search[elememt + 1] = temp;
            }
        }
        return search;
    }

        static int[] bubbleSorting(int[] arr){

        for (int num = 0; num < arr.length - 1; num++) {
            arr = oneIterationSort(arr);
        }
        return arr;
    }
}

