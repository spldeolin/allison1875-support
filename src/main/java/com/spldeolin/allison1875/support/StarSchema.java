package com.spldeolin.allison1875.support;

import java.util.function.Function;

/**
 * @author Deolin 2023-05-01
 */
@SuppressWarnings("all")
public final class StarSchema {

    private final static UnsupportedOperationException e = new UnsupportedOperationException();

    /**
     * 指定事实表
     *
     * @param centralFactTablePrimaryKeyGetter 事实表的主键getter方法引用
     * @param primaryKey 主键
     */
    public static <E, K> Cft<K> cft(Function<E, K> centralFactTablePrimaryKeyGetter, K primaryKey) {
        throw e;
    }

    public static class Cft<K> {

        /**
         * 指定维度表（事实-维度关联关系是One to One）
         *
         * @param dimensionTableForeignKeyGetter 维度表关联事实表的外键getter方法引用
         */
        public <E> Cft<K> oo(Function<E, K> dimensionTableForeignKeyGetter) {
            throw e;
        }

        /**
         * 指定维度表（事实-维度关联关系是One to Many）
         *
         * @param dimensionTableForeignKeyGetter 维度表关联事实表的外键getter方法引用
         */
        public <E> Om<E, K> om(Function<E, K> dimensionTableForeignKeyGetter) {
            throw e;
        }

        public void over() {
            throw e;
        }

    }

    public static class Om<E, K> extends Cft<K> {

        /**
         * 为One to Many关系的维度表指定其他需要关注的key，映射到Map
         *
         * @param dtKeyGetter 维度表key的getter方法引用
         */
        public Om<E, K> key(Function<E, ?> dimensionTableKeyGetter) {
            throw e;
        }

        /**
         * 为One to Many关系的维度表指定其他需要关注的key，映射到Multimap
         *
         * @param dtKeyGetter 维度表key的getter方法引用
         */
        public Om<E, K> mkey(Function<E, ?> dimensionTableKeyGetter) {
            throw e;
        }

    }

}