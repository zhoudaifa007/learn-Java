package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode0052 {


    private int res = 0;

    Set<Integer> col = new HashSet<>();
    Set<Integer> diff = new HashSet<>();
    Set<Integer> sum = new HashSet<>();

    public int totalNQueens(int n) {
        if(n <= 0) {
            return res;
        }
        dfs(0,n);
        return res;
    }

    private void dfs(int level, int n) {
        if(level == n) {
            res++;
            return;
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("%d   %d \n", level,i);
            if(!col.contains(i) && !diff.contains(level -i) && !sum.contains(level + i)) {
                col.add(i);
                diff.add(level - i);
                sum.add(level + i);
                dfs(level + 1,n);
                col.remove(i);
                diff.remove(level -i);
                sum.remove(level + i);
            }
        }
    }
}
