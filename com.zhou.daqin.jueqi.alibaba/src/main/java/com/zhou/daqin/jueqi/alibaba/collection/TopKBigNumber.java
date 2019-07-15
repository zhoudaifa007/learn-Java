package com.zhou.daqin.jueqi.alibaba.collection;

import java.util.List;

/**
 * Created by Daifa on 2018/3/25.
 */
public class TopKBigNumber {


    public static int[] getTopkItems(int k, List<Integer> inPut) {
        if (inPut == null)
            return null;
        int len = inPut.size();
        if (len < k) {
            int[] items = new int[len];
            for (int i = 0; i < len; i++) {
                items[i] = inPut.get(i);
            }
            return items;
        } else {
            int[] items = new int[k];
            for (int i = 0; i < k; i++) {
                items[i] = inPut.get(i);
            }

            //构建小顶堆
            for (int i = k / 2 - 1; i >= 0; i--) {
                heapAdjust(items, i, k - 1);
            }

            for (int i = k; i < len; i++) {
                int temp = inPut.get(i);
                if ( temp > items[0]) {
                    items[0] = inPut.get(i);
                    heapAdjust(items, 0, k - 1);
                }
            }
            return items;
        }
    }

    private static void heapAdjust(int[] array, int start, int end) {
        int temp = array[start];
        for (int j = 2 * start + 1; j <= end; j = 2 * j + 1) {
            //只有左子树，没有右子树，需要防止数组越界
            if (j + 1 <= end && array[j] > array[j + 1]) {
                j = j + 1;
            }
            if (temp <= array[j]) {
                break;
            }
            array[start] = array[j];
            start = j;
        }
        array[start] = temp;
    }
}
