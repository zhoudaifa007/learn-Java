package com.zhou.daqin.jueqi.alibaba.threadpool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by zhoudf2 on 2017-7-11.
 */
@RunWith(SpringRunner.class)
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
