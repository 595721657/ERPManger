package com.dragon.controller.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

@Controller
@RequestMapping("/test")
public class TestController {
      //实现页面跳转
	  @RequestMapping(value = "Inventory.html",method =RequestMethod.GET )
	  public String Test() {
		 return "inventory";
	}
	  //测试删除
	  @RequestMapping(value = "/DelTest",method = RequestMethod.POST)
	  @ResponseBody
	  public Object delTest(@RequestParam("id") int id) {
		  Map<String,String> map=new HashMap<String,String>();
		  map.put("isok", "true");
		  return JSONArray.toJSONString(map);
	  }
	  
}
