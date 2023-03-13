package com.example.photo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class UserController {

	@GetMapping("/sign_up")
	public String signUp(Model model) {
		model.addAttribute("title", "サインアップ");
		model.addAttribute("main", "users/sign_up::main");
		return "layout/not_logged_in";
	}

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "ログイン");
		model.addAttribute("main", "users/login::main");
		return "layout/not_logged_in";
	}

	@GetMapping("/detail/{id}")
	public String detail(Model model) {
		model.addAttribute("title", "ユーザープロフィール");
		model.addAttribute("main", "users/detail::main");
		return "layout/logged_in";
	}

	@GetMapping("/edit/{id}")
	public String edit(Model model) {
		model.addAttribute("title", "ユーザー情報を編集");
		model.addAttribute("main", "users/edit::main");
		return "layout/logged_in";
	}

}