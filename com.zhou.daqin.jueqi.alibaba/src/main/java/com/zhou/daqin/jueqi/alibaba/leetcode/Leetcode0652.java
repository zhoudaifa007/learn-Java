package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.*;

public class Leetcode0652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<Long, Integer> map = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        List<TreeNode> list = new ArrayList<>();
        getId(root, map, count, list);
        return list;
    }

    private int  getId(TreeNode root, Map<Long, Integer> ids,  Map<Integer, Integer> count,List<TreeNode> treeNodeList) {
        if(root == null) {
            return 0;
        }
        long leftId = getId(root.left, ids, count,treeNodeList);
        long rightId = getId(root.right, ids, count,treeNodeList);
        long key = (((long)root.val << 32)) +  (leftId << 16) + rightId;

        Integer id = ids.get(key);
        if(id == null) {
            id = ids.size() + 1;
            ids.put(key, id);
        }

        count.put(id, count.getOrDefault(id,0) + 1);
        if(count.get(id) == 2) {
            treeNodeList.add(root);
        }
        return id;
    }
}
