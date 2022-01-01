package com.zhou.daqin.jueqi.alibaba.leetcode;


public class Leetcode0679 {


    public boolean judgePoint24(int[] nums) {
        double[] arr = new double[] {nums[0], nums[1], nums[2], nums[3]};
        return helper(arr);
    }

    private boolean helper(double[] a) {
        if (a.length == 1) return Math.abs(a[0] - 24) < 0.0001;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                double[] b = new double[a.length - 1];

                //把不是i 和j的原元素加入
                for( int k = 0, index = 0; k < a.length; k++) {
                    if(k !=i && k !=j) {
                        b[index++] = a[k];
                    }
                }

                for(double d: compute(a[i],a[j])) {
                    b[b.length - 1] = d;
                    if(helper(b)) return true;
                }
            }
        }

        return false;
    }

    private double[] compute(double x, double y) {
        return new double[] {x + y, x- y, y-x, x * y, x/ y, y/x};
    }
}
