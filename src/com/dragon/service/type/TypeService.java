package com.dragon.service.type;

import java.util.List;

import com.dragon.pojo.Type;

public interface TypeService {
	//查询所有
	List<Type> getList();
	//删除
	boolean delType(int tid);
	//通过编号查询数据
	Type FindByTid(int tid);
	//增加
	boolean addType(String tname,String notes);
	//修改
	boolean updateType(Type type); 
}
