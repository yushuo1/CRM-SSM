package com.itheima.ssm.service;

import com.itheima.ssm.pojo.Customer;
import com.itheima.ssm.pojo.QueryCondition;
import com.itheima.ssm.utlis.Page;

public interface CustomerService {

	Page<Customer> findByCondition(QueryCondition condition, int page);

	Customer selectById(long id);

	void updateCustomer(Customer customer);

	void deleteCustomer(long id);

}
