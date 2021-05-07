package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=dfGhf-Ko0L4&ab_channel=basketwangCoding
public class Leetcode0054 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(up < down && left < right) {
            for(int i = left; i < right; i++) ans.add(matrix[up][i]);
            for(int i = up; i < down; i++) ans.add(matrix[i][right]);
            for(int i = right; i > left; i--) ans.add(matrix[down][i]);
            for(int i = down; i > up; i--) ans.add(matrix[i][left]);

            up++;
            left++;
            down--;
            right--;
        }

        //一定不能直接写else，必须是else if
        if(up == down && left != right) {
            for(int i = left; i <= right; i++)
                ans.add(matrix[up][i]);
        }

        if (left == right && up != down) {
            for(int i = up; i <= down; i++)
                ans.add(matrix[i][left]);
        }

        if(up == down && left == right && matrix.length % 2 == 1) {
            ans.add(matrix[up][left]);
        }

        return ans;
    }
}
