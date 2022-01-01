package com.zhou.daqin.jueqi.alibaba.contest;

public class Leetcode5956 {

    public String firstPalindrome(String[] words) {

        for(String word: words) {
           boolean flag =  isPalindrome(word);
           if(flag) {
               return word;
           }
        }

        return "";
    }

    private boolean isPalindrome(String s) {
        char[] array = s.toCharArray();

        for(int i = 0; i < array.length / 2; i++) {
            if(array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode5956 leetcode5956 = new Leetcode5956();
        String[] words = {"notapalindrome","racecar"};
        String s =  leetcode5956.firstPalindrome(words);
        System.out.println(s);
    }
}
