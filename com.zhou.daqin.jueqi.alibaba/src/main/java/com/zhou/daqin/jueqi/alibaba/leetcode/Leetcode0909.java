package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//https://www.youtube.com/watch?v=0psTRx1FxPQ&feature=youtu.be&ab_channel=happygirlzt
public class Leetcode0909 {
    public int snakesAndLadders(int[][] board) {
        if (board == null || board.length == 0) return 0;
        int n = board.length;
        boolean[] used = new boolean[n * n + 1];

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);

        int moves = 0;
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int cur = q.poll();
                if (cur == n * n) {
                    return moves;
                }

                for (int j = 1; j <= 6; j++) {
                    int next = j + cur;
                    if (next > n * n) break;

                    if (!used[next]) {
                        used[next] = true;
                        int row = n - (next - 1) / n - 1;
                        //col非常难求
                        int col = ((n - row) % 2 != 0) ? (next - 1) % n : n - (next - 1) % n - 1;

                        if (board[row][col] == cur) continue;
                        if (board[row][col] == -1) {
                            q.offer(next);
                        } else {
                            q.offer(board[row][col]);
                        }
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}
