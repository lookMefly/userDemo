package com.bwie.test;
/**
 *@作者：刘佳
 *@时间：2017年8月18日上午8:10:01
 *@功能：懒汉模式
 */

public class ScopeDouble {
	private static User user = null;
	private ScopeDouble(){};
	public static User togetUser(String name, int age, String sex){
		if(user == null){
			user = new User(name,age,sex);
			return user;
		}else{
			return user;
		}
	}
}
