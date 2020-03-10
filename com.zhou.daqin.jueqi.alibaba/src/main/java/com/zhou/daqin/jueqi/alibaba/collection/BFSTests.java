package com.zhou.daqin.jueqi.alibaba.collection;

import org.junit.Test;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTests {

    @Test
    public void test1() throws Exception {
        File file = new File("F:\\Git\\learn-Java\\com.zhou.daqin.jueqi.alibaba\\src\\main\\java\\com\\zhou\\daqin\\jueqi\\alibaba");
        Queue<File> fileQueue = new LinkedList<>();
        fileQueue.offer(file);
        while (fileQueue.size() != 0) {
            File file1 = fileQueue.poll();
            System.out.println(file1.getCanonicalPath());
            File[] files = file1.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    fileQueue.offer(files[i]);
                }
            }
        }
    }
}
