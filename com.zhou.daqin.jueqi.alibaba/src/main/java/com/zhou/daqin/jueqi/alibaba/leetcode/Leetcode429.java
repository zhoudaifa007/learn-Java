package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.Node;
import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> sol = new ArrayList<>();
        travel(root, sol, 0);
        return sol;
    }

    private void travel(Node curr, List<List<Integer>> sol, int level) {
        if (curr == null) {
            return;
        }

        //每次某一层第一次被遍历的时候创建list
        if (sol.size() <= level) {
            List<Integer> newLevel = new LinkedList<>();
            sol.add(newLevel);
        }

        //获取该层列表，插入数据
        List<Integer> collection = sol.get(level);

        collection.add(curr.val);

        List<Node>  children  =  curr.children;
        if(children != null && children.size() > 0 ) {
            for(Node cnode: children) {
                travel(cnode, sol, level + 1);
            }
        }
    }
}
