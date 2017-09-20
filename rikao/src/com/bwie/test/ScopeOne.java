package com.bwie.test;
/**
 *@作者：刘佳
 *@时间：2017年8月18日上午8:05:21
 *@功能：饿汉模式
 */

public class ScopeOne {
	private static  User user = new User();
	
	private ScopeOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static User togetUser(String name, int age, String sex){
		user.setName(name);
		user.setAge(age);
		user.setSex(sex);
		return user;
	}
}
