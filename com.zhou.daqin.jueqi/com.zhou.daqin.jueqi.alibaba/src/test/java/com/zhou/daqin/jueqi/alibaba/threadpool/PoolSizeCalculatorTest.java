package com.zhou.daqin.jueqi.alibaba.threadpool;

import org.junit.Test;
import java.math.BigDecimal;

/**
 * Created by zhoudf2 on 2017-7-11.
 */

public class PoolSizeCalculatorTest {

    @Test
    public void test1() throws InterruptedException,
            InstantiationException,
            IllegalAccessException,
            ClassNotFoundException {
        MyPoolSizeCalculator calculator = new MyPoolSizeCalculator();
        calculator.calculateBoundaries(new BigDecimal(1.0),
                new BigDecimal(100000));
    }
}
