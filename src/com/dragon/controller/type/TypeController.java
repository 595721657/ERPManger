package com.dragon.controller.type;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.dragon.pojo.Type;
import com.dragon.service.type.TypeService;

@Controller
@RequestMapping(value = "/type")
public class TypeController {
	 @Autowired
     private TypeService typeService;
	 //显示全部的类别信息
	 @RequestMapping(value = "/Type",method = RequestMethod.GET)
	 public String type(Model model) {
		model.addAttribute("typeList",typeService.getList());
		return "type";
	}
	//增加类别信息
	@RequestMapping(value = "/AddType",method = RequestMethod.POST)
	@ResponseBody
	public Object addType(@RequestParam("tname") String tname,@RequestParam("notes") String notes) {
		Map<String,String> map=new HashMap<String,String>();
		System.out.println(tname+","+notes);
		boolean isPass=typeService.addType(tname, notes);
		System.out.println("是否通过::"+isPass);
		if(isPass) {
			map.put("isok","true");
		}else {
			map.put("isok","false");
		}
		return JSONArray.toJSONString(map);
	}
	  //展示全部数据的方法
	  @RequestMapping(value = "Index.html",method = RequestMethod.GET)
	  public String index() {
		 return "index";
	}
	  //删除类别
	  @RequestMapping(value = "/DelType",method = RequestMethod.POST)
	  @ResponseBody
	  public Object delType(@RequestParam("id") int id) {
		    Map<String,String> map=new HashMap<String,String>();
			boolean isPass=typeService.delType(id);
			System.out.println("是否通过::"+isPass);
			if(isPass) {
				map.put("isok","true");
			}else {
				map.put("isok","false");
			}
			return JSONArray.toJSONString(map);
	}
	  //通过id查询数据
	  @RequestMapping(value = "/FindbyTid",method =RequestMethod.GET )
	  public String FindByTid(Model model,@Param("tid") int tid) {
		Type type=typeService.FindByTid(tid);
		model.addAttribute("type", type);
		return "update_type";
	}
}
