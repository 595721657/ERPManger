package com.dragon.pojo;

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
}
