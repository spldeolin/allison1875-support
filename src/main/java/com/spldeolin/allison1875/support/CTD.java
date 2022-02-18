package com.spldeolin.allison1875.support;

import java.util.Collection;
import java.util.List;

/**
 * CTD (Convert-Transformer Detect marker, convert-transformer的转化发现点)
 *
 * @author Deolin 2022-02-06
 */
public class CTD {

    private final static UnsupportedOperationException e = new UnsupportedOperationException();

    /**
     * 实例按类型转换
     *
     * @param from 源Javabean
     * @param to 目标Javabean的类型
     * @return 转换后的Javabean
     */
    public static <S, D> D of(S from, Class<D> to) {
        throw e;
    }


    /**
     * 实例转换到提供的实例
     *
     * @param from 源Javabean
     * @param to 目标Javabean（已初始化的）
     * @return 转换后的Javabean
     */
    public static <S, D> D of(S from, D to) {
        throw e;
    }

    /**
     * 列表按类型转换
     *
     * @param from 多个源Javabean
     * @param to 目标Javabean的类型
     * @return 多个转换后的Javabean
     */
    public static <S, D> List<D> of(Collection<S> from, Class<D> to) {
        throw e;
    }

}