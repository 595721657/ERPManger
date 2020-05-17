package com.dragon.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dragon.pojo.User;
import com.dragon.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	  @Autowired
      private UserService userService;
      //创建一个登录的方法
	  @RequestMapping(value = "/login.html",method = RequestMethod.GET)
      public String login() {
		return "login";
	}
	  //登录验证的方法
	  @RequestMapping(value = "/Login",method = RequestMethod.POST)
	  public String dologin(@RequestParam("account") String account,@RequestParam("password") String password,@RequestParam("code") String code,HttpSession session) {
		  //获取验证码
		  String new_code=(String) session.getAttribute("yzm");
		  //验证验证码
		  if(new_code.equals(code)) {
			  //验证密码和账号是否正确
			  User user=userService.validation(account, password);
			  if(user == null) {
				  return "login";
			  }else {
				  session.setAttribute("douser", user);
				  return "index";
			  }	
		  }else {
			  return "login";
		  }
	}
	  //退出登录
	  @RequestMapping(value = "/doLogin",method = RequestMethod.GET)
	  public String doLogin(HttpSession session) {
		  session.invalidate();
		  return "login";
	}

}
