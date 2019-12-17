package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0127 {
    private class Node {
        String val;
        int level;

        Node(String val, int level) {
            this.val = val;
            this.level = level;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Breadth First Search
        Queue<Node> queue = new LinkedList();

        // put original world as a root node
        queue.add(new Node(beginWord, 0));

        // don't check words twice
        Set<String> checked = new HashSet();

        while(!queue.isEmpty()) {
            Node word = queue.remove();

            if(word.val.equals(endWord)) {
                return word.level + 1;
            }

            for(String w : wordList) {
                String key = w;
                if(!checked.contains(key) && isOnlyOneLetterDifference(w, word.val) ) {
                    queue.add(new Node(w, word.level + 1));
                    checked.add(key);
                }
            }
        }
        return 0;
    }

    /*
     * validate two strings
     * rule: only one letter can be changed at a time
     */
    private boolean isOnlyOneLetterDifference(String current, String destination) {
        // the rule: all words have the same length.
        if(current.length() != destination.length()) {
            return false;
        }

        int count = 0;
        for(int i=0; i < current.length(); i++) {
            if(current.charAt(i) != destination.charAt(i)) {
                count++;

                if(count > 1) {
                    return false;
                }
            }
        }
        return count == 1;
    }
}
