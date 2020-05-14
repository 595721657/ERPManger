package com.dragon.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//�����еĲ���set get����
@Data
//�����в�������
@AllArgsConstructor
//�޲ι���
@NoArgsConstructor
public class User {
     private int uid;//�û����
     private String uname;//�û�����
     private String account;//�û���
     private int gender;//�Ա�
     @DateTimeFormat(pattern = "yyyy-MM-dd")
     @JSONField(format = "yyyy-MM-dd")  //json��ʽ���ڵ�ע��
     private Date birthday;//��������
     private String phone;//�绰����
     private String place;//����
     private String email;//����
     private String introg;//��ע
     private int userrole;//��ɫ
     private int createby;//������
     private Date createdate;//����ʱ��
     private int modifby;//�޸���
     private Date modifydate;//�޸�ʱ��
     private String password;//�û�����
     private int age;
     @SuppressWarnings("deprecation")
	 public int getAge() {
    	age=new Date().getYear()-birthday.getYear();
		return age;
	 }
}
