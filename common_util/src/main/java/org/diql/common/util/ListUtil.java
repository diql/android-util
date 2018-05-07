package org.diql.common.util;

import java.util.List;

/**
 * Created by qinglian on 2018/5/7.
 */
public class ListUtil {

    private ListUtil() {
        // empty.
    }

    public static <E> E get(List<E> list, int index) {
        if (CollectionUtil.isEmpty(list)) {
            return null;
        }
        return list.get(index);
    }

    public static <E> int indexOf(List<E> list, E obj) {
        if (list == null) {
            return -1;
        }
        return list.indexOf(obj);
    }

    public static <E> int lastIndexOf(List<E> list, E obj) {
        if (list == null) {
            return -1;
        }
        return list.lastIndexOf(obj);
    }
}
