package com.zhou.daqin.jueqi.alibaba.java8;

import org.junit.Test;

import java.io.File;

/**
 * Created by Daifa on 2018/4/29.
 */
public class Pracice1 {

    @Test
    public void test1() {
        File[] hiddenFiles = new File("F:\\tmp").listFiles(File::isHidden);
        System.out.println(hiddenFiles);
    }
}
