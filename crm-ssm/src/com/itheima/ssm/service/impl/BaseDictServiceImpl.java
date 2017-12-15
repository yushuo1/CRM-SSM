package com.itheima.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.ssm.mapper.BaseDictMapper;
import com.itheima.ssm.pojo.BaseDict;
import com.itheima.ssm.pojo.QueryCondition;
import com.itheima.ssm.service.BaseDictService;
import com.itheima.ssm.utlis.Page;
@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	/**
	 * 初始化查询条件
	 */
	public List<BaseDict> selectBycondition(String code) {
		return baseDictMapper.selectByCode(code);
	}

}
