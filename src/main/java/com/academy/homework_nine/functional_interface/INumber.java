package com.academy.homework_nine.functional_interface;
@FunctionalInterface
public interface INumber<T, R> {
    R workNumber(T number);
}
