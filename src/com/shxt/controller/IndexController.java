package com.shxt.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@Scope(value="prototype")
@RequestMapping(value="/sys")
public class IndexController {
	@RequestMapping(value="shxt")//访问路径
	public String index(){
		System.out.println("哈哈");
		return InternalResourceViewResolver.REDIRECT_URL_PREFIX+"/jsp/hello.jsp";
		//↑→请求转发;
	}
	@RequestMapping(value="word")
	public ModelAndView index02(){
		
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	@RequestMapping(value="user",method=RequestMethod.POST)
	public ModelAndView add(){
		System.out.println("我是添加");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	@RequestMapping(value="user")
	public ModelAndView sel(){
		System.out.println("我是查询");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	@RequestMapping(value="user",method=RequestMethod.PUT)
	public ModelAndView update(){
		System.out.println("我是更新");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	@RequestMapping(value="user",method=RequestMethod.DELETE)
	public ModelAndView delete(){
		System.out.println("我是删除");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
}
