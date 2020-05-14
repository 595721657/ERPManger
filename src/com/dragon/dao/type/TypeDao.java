package com.dragon.dao.type;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dragon.pojo.Type;

@Repository
public interface TypeDao {
	/**
	 * ��ѯȫ�������
	 * @return ����
	 */
      List<Type> getList();
      /**
       * ɾ�����
       * @param tid �����
       * @return ɾ���Ľ��
       */
      int delType(@Param("tid") int tid);
      /**
       * ͨ����Ų�ѯ�౻
       * @param tid �����
       * @return ��ѯ��ʵ����
       */
      Type FindByTid(@Param("tid") int tid);
      /**
       * �������
       * @param tname �������
       * @param notes ���ע
       * @return ���ӵĽ��
       */
      int addType(@Param("tname") String tname,@Param("notes") String notes);
      /**
       * �޸����
       * @param type �޸ĵ�����
       * @return �޸ĵĽ��
       */ 
      int updateType(Type type); 
}
