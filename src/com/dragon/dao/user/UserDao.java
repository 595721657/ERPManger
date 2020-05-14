package com.dragon.dao.user;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dragon.pojo.User;

@Repository
public interface UserDao {
	/**
	 * ��֤��¼�ķ��� ʹ��ע�⴫��account password
	 * @param account �˺�
	 * @param password ����
	 * @return �û�����
	 */
	 User validation(@Param("account") String account,@Param("password") String password);
}
