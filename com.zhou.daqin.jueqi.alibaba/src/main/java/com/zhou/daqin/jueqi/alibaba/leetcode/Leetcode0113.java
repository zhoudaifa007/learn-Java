package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode0113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> list =   getList(root);
        for(List<Integer> integerList:list) {
            if(integerList.stream().mapToInt(Integer::intValue).sum() == sum) {
                res.add(integerList);
            }
        }
        return res;
    }

    List<List<Integer>> getList(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) {
            return list;
        }

        if(root.left == null && root.right == null){
            List<Integer> integerList = new LinkedList<>();
            integerList.add(root.val);
            list.add(integerList);
            return list;
        }

        List<List<Integer>> leftList = getList(root.left);

        for (List<Integer> integerList:leftList) {
            integerList.add(0, root.val);
            list.add(integerList);
        }

        List<List<Integer>> rightList = getList(root.right);
        for (List<Integer> integerList:rightList) {
            integerList.add(0, root.val);
            list.add(integerList);
        }
        return  list;
    }
}
