package com.github.mperry;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by MarkPerry on 6/04/2014.
 */
public class FTest {

    final static F<Integer, Integer> dub = new F<Integer, Integer>() {
        @Override
        public Integer f(Integer i) {
            return 2 * i;
        }
    };

    final static F<Integer, Integer> addThree = new F<Integer, Integer>() {
        @Override
        public Integer f(Integer i) {
            return i + 3;
        }
    };

    @Test
    public void test1() {
        int z = FHelper.o(addThree, dub).f(8);
        assertTrue(z == 19);
    }

    @Test
    public void test2() {
        assertTrue(FHelper.o(addThree, (Integer i) -> 2 * i).f(8) == 19);

    }

}
