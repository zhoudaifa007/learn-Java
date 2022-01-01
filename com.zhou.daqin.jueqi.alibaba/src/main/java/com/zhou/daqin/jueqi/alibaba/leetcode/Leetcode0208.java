package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0208 {

    class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public  boolean isWord;
    }

    private TrieNode root;

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        return match(word.toCharArray(), 0, root ,false);
    }


    public boolean startsWith(String prefix) {
        return match(prefix.toCharArray(), 0, root, true);
    }





    //K表示从0开始的层数
    private boolean match(char[] chs, int k, TrieNode node, boolean pre) {
        if (k == chs.length) {
            if(pre) {
                return true;
            } else {
                return node.isWord;
            }
        }
        char c = chs[k];
        return node.children[c - 'a'] != null && match(chs, k + 1, node.children[c - 'a'], pre);
    }


}
