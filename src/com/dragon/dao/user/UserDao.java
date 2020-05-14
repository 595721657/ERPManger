package com.dragon.dao.user;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dragon.pojo.User;

@Repository
public interface UserDao {
	/**
	 * 验证登录的方法 使用注解传参account password
	 * @param account 账号
	 * @param password 密码
	 * @return 用户对象
	 */
	 User validation(@Param("account") String account,@Param("password") String password);
}
