package com.pd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexCotroller {
//http://www.ajstore.com/index.html
	@RequestMapping("/")
	public ModelAndView showIndex()
	{
		System.out.println("---------------index");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/index.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/index.html")
	public ModelAndView showIndex1()
	{
		System.out.println("---------------index");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/index.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/search")
	public ModelAndView showSearch()
	{
		System.out.println("---------------search");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/search.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/product_details.html")
	public ModelAndView showProduct()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/product_details.jsp");
		return modelAndView;
	}
//	@RequestMapping("/{page}.html")
//	public ModelAndView showCommon(@PathVariable String page)
//	{
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.setViewName("/"+page+".jsp");
//		System.out.println("/"+page+".jsp");
//		return modelAndView;
//	}
	
//	@RequestMapping("/item_food.html")
//	public ModelAndView ItemFood() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("/item_food.html");
//		return modelAndView;
//	}
}
