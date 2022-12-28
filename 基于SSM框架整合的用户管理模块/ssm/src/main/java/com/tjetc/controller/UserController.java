package com.tjetc.controller;

import com.tjetc.domain.User;
import com.tjetc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/add")
	public String add(User user){
		System.out.println("user = " + user);
		boolean b=userService.add(user);
		return "redirect:/user/list";
	}
	@RequestMapping("/update")
	public String update(User user){
		System.out.println("user = " + user);
		boolean b=userService.update(user);
		return "redirect:/user/list";
	}
	@RequestMapping("/list")
	public String list(Model model){
		List<User> list=userService.list();
		model.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("/findById/{id}")
	public String findById(@PathVariable("id") Integer id,Model model){
		User user=userService.findById(id);
		model.addAttribute("user", user);
		return "update";
	}
	@RequestMapping("/del/{id}")
	public String del(@PathVariable("id") Integer id){
		boolean b=userService.del(id);
		return "redirect:/user/list";
	}
}
