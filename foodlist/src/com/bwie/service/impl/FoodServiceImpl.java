package com.bwie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwie.bean.Food;
import com.bwie.mapper.FoodMapper;
import com.bwie.service.FoodService;

/**
 *@作者：刘佳
 *@时间：2017年8月25日上午10:02:56
 *@功能：Service
 */
@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	private FoodMapper foodmapper;

	//获取菜品集合
	@Override
	public List<Food> togetFoodList(String name) {
		
		return foodmapper.togetFoodList(name);
	}
	
}
