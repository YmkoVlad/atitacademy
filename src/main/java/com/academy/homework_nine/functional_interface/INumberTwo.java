package com.academy.homework_nine.functional_interface;
@FunctionalInterface
public interface INumberTwo<T1, T2, R> {
    R workNumber(T1 number1, T2 number2);
}
