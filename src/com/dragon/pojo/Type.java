package com.dragon.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//�����еĲ���set get����
@Data
//�����в�������
@AllArgsConstructor
//�޲ι���
@NoArgsConstructor
public class Type {
     private int tid;
     private String tname;
     private String describe;
     private String notes;
     private int createby;//������
     private Date createdate;//����ʱ��
     private int modifyby;//�޸���
     private Date modifydate;//�޸�ʱ��
	public Type(String tname, String notes, int createby, Date createdate) {
		super();
		this.tname = tname;
		this.notes = notes;
		this.createby = createby;
		this.createdate = createdate;
	}
	public Type(int tid, String tname, String describe, String notes, int modifyby, Date modifydate) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.describe = describe;
		this.notes = notes;
		this.modifyby = modifyby;
		this.modifydate = modifydate;
	}
     
}
