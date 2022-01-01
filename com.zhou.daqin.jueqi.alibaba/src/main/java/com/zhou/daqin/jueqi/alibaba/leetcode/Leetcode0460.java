package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Leetcode0460 {

    private final int capacity;
    private final HashMap<Integer, Integer> keyToVal;
    private final HashMap<Integer, Integer> keyToCount;
    private final TreeMap<Integer, LinkedHashSet<Integer>> countToLRUKeys;

    public Leetcode0460(int capacity) {
        this.capacity = capacity;
        this.keyToVal = new HashMap<>();
        this.keyToCount = new HashMap<>();
        this.countToLRUKeys = new TreeMap<>();
    }

    public int get(int key) {
        if (!keyToVal.containsKey(key)) {
            return -1;
        }
        refreshCount(key);
        return keyToVal.get(key);
    }

    private void refreshCount(int key) {
        int count = keyToCount.getOrDefault(key, 0);
        keyToCount.put(key, count + 1);
        countToLRUKeys.getOrDefault(count, new LinkedHashSet<>()).remove(key); // remove key from current count (since we will inc count)
        if(countToLRUKeys.getOrDefault(count, new LinkedHashSet<>()).size() == 0) {
            countToLRUKeys.remove(count);
        }
        LinkedHashSet<Integer> countToLRUKeysOrDefault = countToLRUKeys.getOrDefault(count + 1, new LinkedHashSet<>());
        countToLRUKeysOrDefault.add(key);
        countToLRUKeys.put(count + 1, countToLRUKeysOrDefault);
    }


    public void put(int key, int value) {
        if (capacity <= 0) return;

        if (keyToVal.containsKey(key)) {
            keyToVal.put(key, value); // update key's value
            refreshCount(key);
        } else {
            if (keyToVal.size() < capacity) {
                keyToVal.put(key, value); // update key's value
                refreshCount(key);
            } else {
                Map.Entry<Integer, LinkedHashSet<Integer>> integerLinkedHashSetEntry = countToLRUKeys.firstEntry();
                Integer countKey = integerLinkedHashSetEntry.getKey();
                Integer next = integerLinkedHashSetEntry.getValue().stream().findFirst().get();
                integerLinkedHashSetEntry.getValue().remove(next);
                if (integerLinkedHashSetEntry.getValue().size() == 0) {
                    countToLRUKeys.remove(countKey);
                }
                keyToVal.remove(next);
                keyToCount.remove(next);
                keyToVal.put(key, value); // adding new key and value
                refreshCount(key);
            }
        }
    }

}
