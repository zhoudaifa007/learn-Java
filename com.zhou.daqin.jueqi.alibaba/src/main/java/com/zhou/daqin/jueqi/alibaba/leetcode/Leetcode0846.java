package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.TreeMap;

public class Leetcode0846 {

    public boolean isNStraightHand(int[] hand, int W) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n: hand) {
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        boolean f = true;
        while(map.size() > 0 && f) {
          int key =   map.firstEntry().getKey();

          for( int i = 0; i < W - 1; i++) {
              int left = key + i;
              int right = key + i + 1;
              if(!map.containsKey(left) || !map.containsKey(right)) {
                  f = false;
                  break;
              }
          }
          if(!f) {
              break;
          }

          for(int i = 0; i < W ; i++) {
              int nvalue = map.get(key + i);
              nvalue = nvalue - 1;
              if(nvalue == 0) {
                  map.remove(key + i);
              } else {
                  map.put(key + i, nvalue);
              }
          }

        }
        return f;
    }
}
