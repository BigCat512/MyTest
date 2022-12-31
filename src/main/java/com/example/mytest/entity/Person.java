package com.example.mytest.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * <p>
 * 人
 * </p>
 *
 * @author XJH
 * @version 1.0
 * @since 2022/12/30
 */
@Data
public class Person {
    private String name;
    private Integer age;
    private Boolean sex;

    public static void main(String[] args) {
        new ArrayList<String>() {{
            add("1");
            add("1");
            add("1");
            add("1");
            add("1");
            add("1");
        }}
                .stream()
                .map(e -> System.out.printf("e"))
                .collect(Collectors.toList());
        System.out.printf("111");
    }
}
