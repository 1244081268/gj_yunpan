package com.gj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gj.service.FileService;
import com.gj.service.UserService;
import com.gj.utils.UserUtils;

@Controller
public class IndexController {
	@Autowired
	private UserService userService;
	/**
	 * 主页面页面
	 * @param request
	 * @return
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request){
		String username = UserUtils.getUsername(request);
		String countSize = userService.getCountSize(username);
		request.setAttribute("countSize", countSize);
		return "index";
	}
	@RequestMapping("")
	public String index(){
		return "login";
	}
}
