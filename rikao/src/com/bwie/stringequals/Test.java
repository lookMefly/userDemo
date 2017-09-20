package com.bwie.stringequals;
/**
 *@作者：刘佳
 *@时间：2017年8月18日下午7:03:41
 *@功能：10.5	字符串的相等比较
 */

public class Test {
	public static void main(String[] args) {
		String str1 = new String("abc");
		
		String str2 = new String("abc");
		
		String str3 = "abc";
		
		String str4 = str1;
		
		String str5 = "abc";
		
		System.out.println(str1 == str2); //false
		
		System.out.println(str1.equals(str2)); // true
		
		System.out.println(str1 == str4);//true
		
		System.out.println(str1 == str5);//false
		
		System.out.println(str3 == str5);//true
		
		System.out.println(str3.equals(str5));//true
	}
}
