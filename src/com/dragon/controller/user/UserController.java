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
      //����һ����¼�ķ���
	  @RequestMapping(value = "/login.html",method = RequestMethod.GET)
      public String login() {
		return "login";
	}
	  //��¼��֤�ķ���
	  @RequestMapping(value = "/Login",method = RequestMethod.POST)
	  public String dologin(@RequestParam("account") String account,@RequestParam("password") String password,@RequestParam("code") String code,HttpSession session) {
		  //��ȡ��֤��
		  String new_code=(String) session.getAttribute("yzm");
		  //��֤��֤��
		  if(new_code.equals(code)) {
			  //��֤������˺��Ƿ���ȷ
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
	  //�˳���¼
	  @RequestMapping(value = "/doLogin",method = RequestMethod.GET)
	  public String doLogin(HttpSession session) {
		  session.invalidate();
		  return "login";
	}

}
