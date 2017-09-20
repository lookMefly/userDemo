package com.bwie.service;

import java.util.List;

import com.bwie.bean.Food;

/**
 *@作者：刘佳
 *@时间：2017年8月25日上午10:02:43
 *@功能：FoodService接口
 */

public interface FoodService {

	List<Food> togetFoodList(String name);

}
