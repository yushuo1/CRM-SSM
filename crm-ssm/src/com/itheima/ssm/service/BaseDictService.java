package com.itheima.ssm.service;

import java.util.List;

import com.itheima.ssm.pojo.BaseDict;
import com.itheima.ssm.pojo.QueryCondition;
import com.itheima.ssm.utlis.Page;

public interface BaseDictService {

	List<BaseDict> selectBycondition(String code);


}
