package org.diql.common.util;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by qinglian on 2018/5/7.
 */
public class CollectionUtilTest {

    @Test
    public void isEmpty_null() {
        assertTrue(CollectionUtil.isEmpty(null));
    }

    @Test
    public void isEmpty_empty() {
        assertTrue(CollectionUtil.isEmpty(new ArrayList()));
    }

    @Test
    public void isEmpty_not_empty() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(null);
        assertFalse(CollectionUtil.isEmpty(arrayList));
    }

    @Test
    public void isEmpty_not_empty_2() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        assertFalse(CollectionUtil.isEmpty(arrayList));
    }


    @Test
    public void size_null() {
        assertEquals(0, CollectionUtil.size(null));
    }

    @Test
    public void size_empty() {
        assertEquals(0, CollectionUtil.size(new ArrayList()));
    }

    @Test
    public void size_1() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        assertEquals(1, CollectionUtil.size(arrayList));
    }
}