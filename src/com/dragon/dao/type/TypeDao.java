package com.dragon.dao.type;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dragon.pojo.Type;

@Repository
public interface TypeDao {
	/**
	 * 查询全部的类别
	 * @return 集合
	 */
      List<Type> getList();
      /**
       * 删除类别
       * @param tid 类别编号
       * @return 删除的结果
       */
      int delType(@Param("tid") int tid);
      /**
       * 通过编号查询类被
       * @param tid 类别编号
       * @return 查询的实体类
       */
      Type FindByTid(@Param("tid") int tid);
      /**
       * 增加类别
       * @param tname 类别名称
       * @param notes 类别备注
       * @return 增加的结果
       */
      int addType(@Param("tname") String tname,@Param("notes") String notes);
      /**
       * 修改类别
       * @param type 修改的数据
       * @return 修改的结果
       */ 
      int updateType(Type type); 
}
