package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0211 {
     class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public  boolean isWord;
    }

    private TrieNode root = new TrieNode();



    public void addWord(String word) {
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
        return match(word.toCharArray(), 0, root);
    }

    //K表示从0开始的层数
    private boolean match(char[] chs, int k, TrieNode node) {
        if (k == chs.length) {
            return node.isWord;
        }

        char c = chs[k];
        if (c != '.') {
            return node.children[c - 'a'] != null && match(chs, k + 1, node.children[c - 'a']);
        } else {
            for (int i = 0; i < node.children.length; i++) {
                boolean flag = node.children[i] != null && match(chs, k + 1, node.children[i]);
                if(flag) {
                    return true;
                }
            }
            return false;
        }
    }
}
