package com.github.mperry;

/**
 * Created by MarkPerry on 5/04/2014.
 */
public class FHelper {

    static public <A, B, C> F<C, B> o(final F<A, B> f, final F<C, A> g) {
        return new F<C, B>() {
            public B f(final C c) {
                return f.f(g.f(c));
            }
        };
    }

    public static void main(String args[]) {
        o((Integer a) -> 2 * a, (Integer b) -> b + 2);
    }

}
