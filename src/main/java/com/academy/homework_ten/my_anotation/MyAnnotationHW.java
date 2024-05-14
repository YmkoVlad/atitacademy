package com.academy.homework_ten.my_anotation;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD})
public @interface MyAnnotationHW {
    boolean run() default true;
    int age() default 1;
}

