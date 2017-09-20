package com.bwie.integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *@作者：刘佳
 *@时间：2017年8月18日下午8:40:12
 *@功能：进制转换
 */

public class Test {
	public static void main(String[] args) {
		String str = "我们都是中国的年轻人";
		List num = new ArrayList();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			num.add(charArray[i]);
		}
		for (Object object : num) {
			System.out.print(object+" ");
		}
		Collections.shuffle(num);
		System.out.println(num);
	}
}
