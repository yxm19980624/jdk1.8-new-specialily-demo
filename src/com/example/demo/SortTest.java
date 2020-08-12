package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yxm
 * @Date: 2020/8/12 10:19
 */
public class SortTest {
    public static void main(String[] args) {

        SortTest sortTest = new SortTest();

        ArrayList<String> names = new ArrayList<>();
        names.add("1");
        names.add("2");
        names.add("5");
        names.add("3");
        names.add("4");
        sortTest.sortStringByJdk8(names);
        System.out.println(names);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(8);
        integers.add(2);
        sortTest.sortIntegerByJdk8(integers);
        System.out.println(integers);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> objects = new ArrayList<>();
        integers.forEach(integer -> objects.add(integer));

        //等价于上面  integers.forEach()
        /*for (Integer i : integers) {}*/
        System.out.println(objects);

    }

    //jdk1.8 排序新规则  针对String类型
    private void sortStringByJdk8(List<String> list){
        //原始写法 lambda表达式
//        Collections.sort(list,(a1,a2) -> a1.compareTo(a2));

        //简化  ::表示方法调用
//        Collections.sort(list, String::compareTo);

        //names.sort 调用的是ArrayList自带的排序方法
        list.sort(String::compareTo);
    }

    //jdk1.8 排序新规则  针对String类型
    private void sortIntegerByJdk8(List<Integer> list){
        //原始写法 lambda表达式
//        Collections.sort(list,(a1,a2) -> a1.compareTo(a2));

        //简化  ::表示方法调用
//        Collections.sort(list, Integer::compareTo);

        //names.sort 调用的是ArrayList自带的排序方法
        list.sort(Integer::compareTo);
    }
}
