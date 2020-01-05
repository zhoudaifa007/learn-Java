package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0029 {

    public int divide(int dividend, int divisor) {
        long dividendAbs = Math.abs((long)dividend);
        long divisorAbs = Math.abs((long)divisor);

        int count = (int)ldivide(dividendAbs,divisorAbs);

        if(isSame(dividend, divisor)) {
            if(count == Integer.MIN_VALUE) {
                count = Integer.MAX_VALUE;
            }
        } else {
            if(count == Integer.MIN_VALUE) {
                count = Integer.MIN_VALUE;
            } else {
                count = 0 - count;
            }
        }
        return count;
    }


    private long getCount(long dividendAbs, long divisorAbs) {
        int count = 0;
        while (dividendAbs - divisorAbs >= 0) {
            dividendAbs =  dividendAbs - divisorAbs;
            count = count + 1;
        }
        return count;
    }
    private long ldivide(long ldividend, long ldivisor) {
        // Recursion exit condition
        if (ldividend < ldivisor) return 0;

        //  Find the largest multiple so that (divisor * multiple <= dividend),
        //  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
        //  Think this as a binary search.
        long sum = ldivisor;
        long multiple = 1;
        while ((sum+sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }
        //Look for additional value for the multiple from the reminder (dividend - sum) recursively.
        return multiple + ldivide(ldividend - sum, ldivisor);
    }



    private boolean isSame(int dividend, int divisor) {
        if(dividend > 0 && divisor > 0) {
            return true;
        } else if (dividend > 0 && divisor < 0) {
            return false;
        } else if(dividend < 0 && divisor > 0) {
            return false;
        } else  {
            return true;
        }
    }
}
