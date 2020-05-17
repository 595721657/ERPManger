package com.dragon.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//给所有的参数set get方法
@Data
//给所有参数构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class Type {
     private int tid;
     private String tname;
     private String describe;
     private String notes;
     private int createby;//创建者
     private Date createdate;//创建时间
     private int modifyby;//修改者
     private Date modifydate;//修改时间
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
