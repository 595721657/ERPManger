package com.dragon.service.type;

import java.util.List;

import com.dragon.pojo.Type;

public interface TypeService {
	//��ѯ����
	List<Type> getList();
	//ɾ��
	boolean delType(int tid);
	//ͨ����Ų�ѯ����
	Type FindByTid(int tid);
	//����
	boolean addType(String tname,String notes);
	//�޸�
	boolean updateType(Type type); 
}
