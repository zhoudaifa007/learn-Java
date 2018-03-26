package com.zhou.daqin.jueqi.alibaba.collection;

/**
 * Created by Daifa on 2018/3/24.
 */
public class HeapSort {

    public static void sort(int[] array) {

        int len = array.length;
        //i的起始位置是：从下往上，从左往右，最后一个包含子节点的下标
        for (int i = (len / 2 - 1); i >= 0; i--) {
            //构建大顶堆，起始下标需要变化，结束下标固定
            heapAdjust(array, i,len - 1);
        }

        for(int i = len - 1; i > 0; i--) {
            swap(array,0, i);
            //调整大顶堆，起始下标不变，结束下标需要减少
            heapAdjust(array,0,i - 1);
        }
    }

    /**
     *
     * @param array
     * @param start:
     * @param end
     */
    private static void heapAdjust(int[] array, int start, int end) {
        int temp = array[start];
        for(int j = 2* start + 1; j <= end ; j = 2*j + 1) {
            //只有左子树，没有右子树，需要防止数组越界
            if( j + 1 <=end  && array[j] < array[j + 1] ) {
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
