package com.zhaiyz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhaiyz.vo.StringBean;
import com.zhaiyz.vo.User;
import com.zhaiyz.vo.UserList;

@Controller
public class HelloWorldController {
	
	
	/*
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 1、收集参数、验证参数
		// 2、绑定参数到命令对象
		// 3、将命令对象传入业务对象进行业务处理
		// 4、选择下一个页面
		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象
		mv.addObject("message", "Hello World!你好，世界！");
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("hello");
		return mv;
	}
	*/
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		StringBean sb = new StringBean();
		sb.setString("你好，世界！");
		return new ModelAndView("hello", "message", sb);
	}
	
	@RequestMapping("/fuck")
	public ModelAndView sayFuck(String message) {
		StringBean sb = new StringBean();
		sb.setString(message);
		return new ModelAndView("hello", "message", sb);
	}
	
	@RequestMapping("/user")
	public ModelAndView printUser(int id, String name) {
		User u = new User();
		u.setId(1);
		u.setName("文");
		
		User u1 = new User();
		u1.setId(id);
		u1.setName(name);
		
		List<User> list = new ArrayList<User>();
		list.add(u);
		list.add(u1);
		
		UserList userList = new UserList();
		userList.setUserList(list);
		
		return new ModelAndView("hello", "message", userList);
	}

}
