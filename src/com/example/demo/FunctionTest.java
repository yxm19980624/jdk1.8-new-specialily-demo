package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yxm
 * @Date: 2020/8/12 14:06
 */
public class FunctionTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        输出所有参数
        System.out.println(integers);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        List<String> filtered2 = strings.stream().filter(string -> !string.equals("abc")).collect(Collectors.toList());
        System.out.println(filtered);
        System.out.println(filtered2);
    }
}
