package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Leetcode0253 {

    public int minMeetingRooms(int[][] intervals) {

        if(intervals == null || intervals.length == 0 || intervals[0].length == 0) {
            return 0;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            map.put(start, map.getOrDefault(start,0) + 1);
            int end = intervals[i][1];
            map.put(end, map.getOrDefault(end,0) - 1);
        }
        int max = 0;
        int curr = 0;

        Iterator<Map.Entry<Integer,Integer>> iterator =   map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer,Integer> entry = iterator.next();
            curr = curr + entry.getValue();
            max = Math.max(curr, max);
        }

        return max;
    }
}
