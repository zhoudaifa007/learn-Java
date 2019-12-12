package com.zhou.daqin.jueqi.alibaba.review;

import org.junit.Test;

public class Reetcode1071Tests {

    @Test
    public void test1() {
        Reetcode1071 reetcode1071 = new Reetcode1071();
        reetcode1071.gcdOfStrings("ABCABC","ABC");
    }

    @Test
    public void test2() {
        Reetcode1071 reetcode1071 = new Reetcode1071();
        reetcode1071.gcdOfStrings("ABABAB","ABAB");
    }

    @Test
    public void test3() {
        Reetcode1071 reetcode1071 = new Reetcode1071();
        reetcode1071.gcdOfStrings("LEET","CODE");
    }

    @Test
    public void test4() {
        Reetcode1071 reetcode1071 = new Reetcode1071();
        reetcode1071.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");
    }
}
