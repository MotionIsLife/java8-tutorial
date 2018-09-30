package com.winterbe.java8.samples.other;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
