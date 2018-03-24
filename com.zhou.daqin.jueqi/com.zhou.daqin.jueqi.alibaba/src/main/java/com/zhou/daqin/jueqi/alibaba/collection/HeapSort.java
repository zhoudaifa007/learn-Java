package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Daifa on 2018/3/24.
 */
public class HeapSort {

    public static void sort(int[] array) {

        int len = array.length;
        for (int i = (len / 2 - 1); i >= 0; i--) {
            heapAdjust(array, i,len);
        }

        for(int i = len - 1; i >=0; i++) {
            swap(array,0, i);
            heapAdjust(array,0,i - 1);
        }
    }

    private static void heapAdjust(int[] array, int start, int end) {
        int temp = array[start];
        for(int j = 2* start + 1; j < end - 1 ; j = 2*j + 1) {
            if(array[j] < array[j + 1] ) {
                j = j + 1;
            }
            if(temp >= array[j]) {
                break;
            }
            array[start] = array[j];
            start = j;
        }
        array[start] = temp;
    }

    private static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j]  = temp;
    }
}
