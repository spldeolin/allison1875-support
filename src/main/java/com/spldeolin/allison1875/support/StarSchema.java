package com.spldeolin.allison1875.support;

import java.util.function.Function;

/**
 * @author Deolin 2023-05-01
 */
public final class StarSchema {

    private final static UnsupportedOperationException e = new UnsupportedOperationException();

    public static <E, K> Cft<K> cft(Function<E, K> cftPkGetter, K pk) {
        throw e;
    }

    public static class Cft<K> {

        public <E> Cft<K> oo(Function<E, K> dtFkGetter) {
            throw e;
        }

        public <E> Om<E, K> om(Function<E, K> dtFkGettter) {
            throw e;
        }

        public void over() {
            throw e;
        }

    }

    public static class Om<E, K> extends Cft<K> {

        public Om<E, K> key(Function<E, ?> dtKeyGetter) {
            throw e;
        }

    }

}