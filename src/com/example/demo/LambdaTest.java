package com.example.demo;

/**
 * @Author: yxm
 * @Date: 2020/8/12 11:05
 */
public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        /**
         * 加法 声明类型 不用大括号和返回值
         */
        //原始写法
//      MathOperation  add = (int a,int b) -> a + b;
        MathOperation add = Integer::sum;

        /**
         * 减法   不用声明类型  lambda会自动判断参数类型
         */
        MathOperation  sub = ( a, b) -> a - b;

        /**
         * 乘法   加大括号和 return 并且还有分号(不推荐)
         */
        MathOperation mul = (int a,int b) -> { return a * b ; };

        /**
         * 除法 不用大括号和返回值 不声明类型
         * 除法会有点小问题  如果是小数或者0.几的时候 不会显示正确的值  是因为int类型的整数值相除结果可能不会整除 有小数
         * 这时候在用int类型去接收就会发生自动类型转换，导致结果值不正确
         ** 主要是学lambda表达式**
         */
        MathOperation div = ( a, b) -> a / b;

        System.out.println("1 + 2 = " + lambdaTest.operate(1,2,add));
        System.out.println("1 - 2 = " + lambdaTest.operate(1,2,sub));
        System.out.println("1 * 2 = " + lambdaTest.operate(1,2,mul));
        System.out.println("2 / 1 = " + lambdaTest.operate(2,1,div));
    }

    /**
     * 定义操作方法接口
     */
    interface MathOperation{
        int operate(int a, int b);
    }

    /**
     * 定义调用方法
     * @param a 参数
     * @param b 参数
     * @param mathOperation 操作方法
     * @return 操作方法返回值
     */
    private int operate(int a, int b,MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }
}
