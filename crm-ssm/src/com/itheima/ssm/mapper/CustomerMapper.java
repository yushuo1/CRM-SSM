package com.itheima.ssm.mapper;

import java.util.List;

import com.itheima.ssm.pojo.BaseDict;
import com.itheima.ssm.pojo.Customer;
import com.itheima.ssm.pojo.QueryCondition;

public interface CustomerMapper {

	List<Customer> findByCondition(QueryCondition condition);

	Integer selectCountByCondition(QueryCondition condition);

	Customer selectById(long id);

	void updateCustomer(Customer customer);

	void deleteCustomer(long id);

}
