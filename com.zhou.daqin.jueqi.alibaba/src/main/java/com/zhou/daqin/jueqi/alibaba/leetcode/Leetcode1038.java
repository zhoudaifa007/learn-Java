package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1038 {

    public TreeNode bstToGst(TreeNode root) {
        List<Integer> cumulativeSum = new ArrayList<Integer>();
        cumulativeSum.add(0);
        //Traverse the tree by descending order (Right -> Root -> Left) then update root's value accordingly
        descendingTraversal(root, cumulativeSum);
        return root;
    }

    public void descendingTraversal(TreeNode root, List<Integer> cumulativeSum){
        if(root != null){
            descendingTraversal(root.right,cumulativeSum);
            //Modify the value of the root by the last element in the cumulative array.
            root.val += cumulativeSum.get(cumulativeSum.size()-1);
            //Store the new cumulative sum to update its value later
            cumulativeSum.add(root.val);
            descendingTraversal(root.left,cumulativeSum);
        }
    }
}
