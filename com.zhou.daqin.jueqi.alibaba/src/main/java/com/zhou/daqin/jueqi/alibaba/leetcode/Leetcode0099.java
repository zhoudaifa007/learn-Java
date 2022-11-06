package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class Leetcode0099 {



    public void recoverTree(TreeNode root) {
        Map<Integer, TreeNode> map = new LinkedHashMap<>();
        init(root, map);

        List<Integer> integerList = new ArrayList<>();
        for(Map.Entry<Integer, TreeNode> entry: map.entrySet()) {
            integerList.add(entry.getKey());
        }

        List<Integer> integerList1 = map.keySet().stream().sorted().collect(Collectors.toList());

        int len = integerList.size();

        for(int i = 0; i < len ; i++) {
            int m = integerList.get(i);
            int n = integerList1.get(i);

            if(m != n) {
                map.get(m).val = n;
            }
        }
    }

    private void init(TreeNode root, Map<Integer, TreeNode> map) {
        if(root == null) return;
        init(root.left, map);
        map.put(root.val, root);
        init(root.right, map);
    }

}
