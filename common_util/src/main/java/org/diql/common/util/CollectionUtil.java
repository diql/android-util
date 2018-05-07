package org.diql.common.util;

import java.util.Collection;
import java.util.List;

/**
 * Created by qinglian on 2018/5/7.
 */
public class CollectionUtil {

    private CollectionUtil() {
        // empty.
    }

    /**
     * collection是否为空.
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static int size(Collection collection) {
        return collection == null ? 0 : collection.size();
    }
}
