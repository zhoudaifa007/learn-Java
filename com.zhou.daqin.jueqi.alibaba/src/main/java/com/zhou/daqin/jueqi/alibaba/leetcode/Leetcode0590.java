package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.Node;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0590 {

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        travel(root, res);
        return res;
    }

    public void travel(Node curr, List<Integer> list) {
        if(curr == null) {
            return;
        }

        List<Node> childNode = curr.children;
        if(childNode != null && childNode.size() > 0) {
            for(Node cnode: childNode) {
                travel( cnode, list);
            }
        }

        int val = curr.val;
        list.add(val);
    }
}
