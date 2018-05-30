package org.diql.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qinglian on 2018/5/30.
 */
public class DisplayUtilTest {


    @Test
    public void constNum() {
        assertNotEquals(0, DisplayUtil.IOS_DP_SCALE);
        assertEquals(360 / 375.0, DisplayUtil.IOS_DP_SCALE, 0.000001);
    }
}