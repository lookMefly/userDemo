package com.bwie.mapper;

import java.util.List;

import com.bwie.bean.Food;

/**
 *@作者：刘佳
 *@时间：2017年8月25日上午10:03:27
 *@功能：FoodMapper 接口
 */

public interface FoodMapper {

	List<Food> togetFoodList(String name);

}
