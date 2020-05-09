package com.example.demo.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Bean.UserBean;
import com.example.demo.Repo.UsersRepo;

@Controller
public class homeController {
	@Autowired
	UsersRepo usersrepo;

	@RequestMapping({ "/home", "/" })
	public String home() {
		return "home";
	}

	@RequestMapping("register")
	public String register(Model m) {
		m.addAttribute("userbean", new UserBean());
		return "register";
	}

	@RequestMapping("/submitForm")
	public String validateForm(@Valid @ModelAttribute("userbean") UserBean userbean, BindingResult bindingresult,
			Model m) {

		if (bindingresult.hasErrors()) {
			m.addAttribute("error", "Please Insert correct Details");
			return "register";
		}

		usersrepo.save(userbean);
		return "home";
	}

	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("userbean", new UserBean());
		return "login";
	}

	@RequestMapping("/validateLogin")
	public String validate(@ModelAttribute("userbean") UserBean userbean, Model m, HttpSession session) {
		UserBean userDB = usersrepo.findByEmail(userbean.getEmail());
		if (userDB != null) {
			if (userDB.getPassword().equals(userbean.getPassword())) {
				session.setAttribute("user", userbean.getEmail());
				session.setMaxInactiveInterval(60);
				m.addAttribute("email",userbean.getEmail());
				return "Dummy";
			} else {
				return "login-error";
			}
		} else {
			return "noUser";
		}

	}

	
}
