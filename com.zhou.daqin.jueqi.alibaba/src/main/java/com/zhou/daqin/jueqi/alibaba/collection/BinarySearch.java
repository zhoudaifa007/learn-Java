package com.zhou.daqin.jueqi.alibaba.collection;

/**
 * Created by Daifa on 2018/4/5.
 */
public class BinarySearch {

    public int find(int[] array, int key) {

        if(array == null) {
            return -1;
        }

        int start = 0;
        int end = array.length -1;
        while (start <=end) {
            int index = (start + end) / 2;
            if(array[index] > key) {
                end = index -1;
            } else if(array[index] < key) {
                start = index + 1;
            } else {
                return index;
            }
        }
        return -1;
    }
}
