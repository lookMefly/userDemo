package com.bwie.animal;
/**
 *@作者：刘佳
 *@时间：2017年8月18日下午7:38:12
 *@功能：测试类
 */

public class SpeakTest {
	
	public void speak(Animal a){
		a.speak();
	}
	public static void main(String[] args) {
		SpeakTest st = new SpeakTest();
		
		Animal a1 = new Dog();
		
		Animal a2 = new Cat();
		
		Animal a3 = new Animal();
		
		st.speak(a3);
	}
}
