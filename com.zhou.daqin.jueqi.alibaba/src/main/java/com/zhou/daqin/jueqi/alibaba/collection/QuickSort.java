package com.zhou.daqin.jueqi.alibaba.collection;

import java.util.Random;

/**
 * Created by Daifa on 2018/3/27.
 */
public class QuickSort {

    public static void quickSort(int[] n) {
        if (n == null || n.length == 0)
            return;
        quickSort(n, 0, n.length - 1);
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start == end)
            return;
        int pivot = partion(array, start, end);

        if (pivot > start) {
            quickSort(array, start, pivot - 1);
        }

        if (pivot < end) {
            quickSort(array, pivot + 1, end);
        }
    }

    private static int partion(int[] array, int start, int end) {
        int index = getRandom(start, end);
        //将最后一个位置当做临时变量
        swap(array, index, end);
        int small = start - 1;

        for (index = start; index < end; ++index) {
            if (array[index] < array[end]) {
                ++small;
                if (small != index) {
                    swap(array, index, small);
                }
            }
        }
        ++small;
        swap(array, small, end);
        return small;
    }

    //交换数组元素
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //获取[min,max]范围的随机数
    private static int getRandom(int min, int max) {
        Random random = new Random();
        //nextInt左闭右开[0,n)
        return random.nextInt(max - min + 1) + min;
    }
}
