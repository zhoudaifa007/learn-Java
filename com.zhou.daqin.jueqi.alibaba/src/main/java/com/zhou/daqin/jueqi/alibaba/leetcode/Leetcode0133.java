package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.List;

public class Leetcode0133 {

    public class UndirectedGraphNode {
        public int label;
        public List<UndirectedGraphNode> neighbors;

        public UndirectedGraphNode() {}

        public UndirectedGraphNode(int _val) {
            label = _val;
        }
    }

    public class Solution {
        private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
            return clone(node);
        }

        private UndirectedGraphNode clone(UndirectedGraphNode node) {
            if (node == null) return null;

            if (map.containsKey(node.label)) {
                return map.get(node.label);
            }
            UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
            map.put(clone.label, clone);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                clone.neighbors.add(clone(neighbor));
            }
            return clone;
        }
    }
}
