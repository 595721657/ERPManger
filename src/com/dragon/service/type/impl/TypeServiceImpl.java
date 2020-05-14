package com.dragon.service.type.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragon.dao.type.TypeDao;
import com.dragon.pojo.Type;
import com.dragon.service.type.TypeService;
@Service
public class TypeServiceImpl implements TypeService {
	@Autowired
    private TypeDao typeDao;
	@Override
	public List<Type> getList() {
		return typeDao.getList();
	}

	@Override
	public boolean delType(int tid) {
		if(typeDao.delType(tid)>0) {
			return true;
		}else {
		    return false;
		}
	}

	@Override
	public Type FindByTid(int tid) {
		return typeDao.FindByTid(tid);
	}

	@Override
	public boolean addType(String tname, String notes) {
		if(typeDao.addType(tname, notes)>0) {
			return true;
		}else {
		    return false;
		}
	}

	@Override
	public boolean updateType(Type type) {
		if(typeDao.updateType(type)>0) {
			return true;
		}else {
		    return false;
		}
	}

}
