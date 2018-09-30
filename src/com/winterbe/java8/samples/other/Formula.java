package com.winterbe.java8.samples.other;

/*Методы интерфейсов по умолчанию*/
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
