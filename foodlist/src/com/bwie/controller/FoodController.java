package com.bwie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bwie.bean.Food;
import com.bwie.service.FoodService;

/**
 *@作者：刘佳
 *@时间：2017年8月25日上午10:03:41
 *@功能：Controller
 */
@Controller
public class FoodController {
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("togetlist")
	@ResponseBody
	public ModelAndView list(String name){
		ModelAndView mav = new ModelAndView();
		name = name == null ? "" : name;
		List<Food> foods =  foodService.togetFoodList(name);
		System.out.println("foods:"+foods);
		mav.addObject(foods);
		mav.setViewName("food_list");
		return mav;
	}
	
	//去页面
	@RequestMapping("toshow")
	public String toshow(){
		return "show";
	}
}
