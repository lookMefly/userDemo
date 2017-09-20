package com.bwie.test;
/**
 *@作者：刘佳
 *@时间：2017年8月18日上午8:04:43
 *@功能：分别实现懒汉和饿汉两种单例。（80分）
                    2：在测试类中完成测试（循环输出对象，保证对象的地址唯一）

 */

public class Test {
	public static void main(String[] args) {
		
		System.out.println("-------------------饿汉---------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(ScopeOne.togetUser("小红", 15, "女"));
		}
		
		
		System.out.println("-------------------懒汉---------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(ScopeDouble.togetUser("小刚", 15, "男"));
		}
	}
}
