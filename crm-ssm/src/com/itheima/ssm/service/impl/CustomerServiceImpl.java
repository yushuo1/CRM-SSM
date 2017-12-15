package com.itheima.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.ssm.mapper.CustomerMapper;
import com.itheima.ssm.pojo.BaseDict;
import com.itheima.ssm.pojo.Customer;
import com.itheima.ssm.pojo.QueryCondition;
import com.itheima.ssm.service.CustomerService;
import com.itheima.ssm.utlis.Page;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	/**
	 * 根据查询条件分页查询用户
	 */
	public Page<Customer> findByCondition(QueryCondition condition, int page) {
		//计算开始索引
		Integer start = (page - 1) * condition.getSize();
		condition.setStart(start);
		//根据条件查询指定的用户信息
		List<Customer> customers =customerMapper.findByCondition(condition);
		//查询用户的总记录数
		Integer total =customerMapper.selectCountByCondition(condition);

		//创建page对象 封装参数
		Page<Customer> result =new Page<Customer>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(condition.getSize());
		result.setTotal(total);
		
		return result;
	}
	/**
	 * 修改前查询返显数据
	 */
	public Customer selectById(long id) {
		return customerMapper.selectById(id);
	}

	/**
	 * 修改客户信息
	 */
	public void updateCustomer(Customer customer) {
	   customerMapper.updateCustomer(customer);
	}
	
	/**
	 * 删除指定客户
	 */
	public void deleteCustomer(long id) {
		customerMapper.deleteCustomer(id);
	}
}
