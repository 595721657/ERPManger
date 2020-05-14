package com.dragon.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//给所有的参数set get方法
@Data
//给所有参数构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class User {
     private int uid;//用户编号
     private String uname;//用户姓名
     private String account;//用户名
     private int gender;//性别
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     @JSONField(format = "yyyy-MM-dd")  //json格式日期的注解
     private Date birthday;//出生日期
     private String phone;//电话号码
     private String place;//籍贯
     private String email;//邮箱
     private String introg;//备注
     private int userrole;//角色
     private int createby;//创建者
     private Date createdate;//创建时间
     private int modifby;//修改者
     private Date modifydate;//修改时间
     private String password;//用户密码
     private int age;
     @SuppressWarnings("deprecation")
	 public int getAge() {
    	age=new Date().getYear()-birthday.getYear();
		return age;
	 }
}
