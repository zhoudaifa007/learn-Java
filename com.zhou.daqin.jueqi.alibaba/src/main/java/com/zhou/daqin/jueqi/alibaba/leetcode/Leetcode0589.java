package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.Node;
import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0589 {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        travel(root, res);
        return res;
    }

    public void travel(Node curr, List<Integer> list) {
        if(curr == null) {
            return;
        }

        int val = curr.val;
        list.add(val);

        List<Node> childNode = curr.children;
        if(childNode != null && childNode.size() > 0) {
            for(Node cnode: childNode) {
                travel( cnode, list);
            }
        }

    }
}
