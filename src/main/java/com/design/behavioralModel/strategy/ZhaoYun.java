package com.design.behavioralModel.strategy;

/**
 *使用情况
 *
 * @author xf
 * @create: 2020/4/16
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;

        System.out.println("----------刚到吴国使用第一个锦囊---------------");
        context = new Context(new StartStrategy());
        context.operate();
        System.out.println("\n");

        System.out.println("----------刘备乐不思蜀使用第二个锦囊---------------");
        context.setStrategy(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("----------孙权的追兵来了，使用第三个锦囊---------------");
        context.setStrategy(new BlackEnemy());
        context.operate();
        System.out.println("\n");
    }
}
