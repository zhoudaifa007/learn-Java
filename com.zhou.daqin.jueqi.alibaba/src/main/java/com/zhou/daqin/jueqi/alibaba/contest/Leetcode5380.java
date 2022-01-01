package com.zhou.daqin.jueqi.alibaba.contest;

public class Leetcode5380 {

    public static boolean isThree(int n) {
        boolean flag = false;
        int sqrt = (int)Math.sqrt(n);
        if(sqrt * sqrt != n) {
            return false;
        }

       boolean f =  isPrimeNumber(sqrt);

        return f;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


     public static void main(String[] args) {
       System.out.println(isThree(12));
       System.out.println(isThree(9));
       System.out.println(isThree(121));
    }
}
