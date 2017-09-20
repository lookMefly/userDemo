package com.bwie.upcase;
/**
 *@作者：刘佳
 *@时间：2017年8月18日下午8:51:51
 *@功能：大小写转换
 */

public class Test {
	public static void main(String[] args) {
		String str = "abAcC";
		//全部都小写
		String lowerCase = str.toLowerCase();
		System.out.println(lowerCase);
		//全部大写
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		System.out.println(str.trim());
		System.out.println(str.valueOf(3));
	}
}
