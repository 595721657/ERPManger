package com.dragon.pojo;

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
}
