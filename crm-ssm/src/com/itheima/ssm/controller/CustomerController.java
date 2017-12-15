package com.itheima.ssm.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.stat.TableStat.Mode;
import com.itheima.ssm.pojo.BaseDict;
import com.itheima.ssm.pojo.Customer;
import com.itheima.ssm.pojo.QueryCondition;
import com.itheima.ssm.service.BaseDictService;
import com.itheima.ssm.service.CustomerService;
import com.itheima.ssm.utlis.Page;

@Controller
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("customer/list")
	public String findByPage(QueryCondition condition,@RequestParam(defaultValue="1")int page, Model model ) throws IOException{		
		//解决查询条件乱码问题
		String custName = condition.getCustName();
		String name = new String(custName.getBytes("iso8859-1"), "utf-8");
		condition.setCustName(name);
		
		
		List<BaseDict>  fromType =baseDictService.selectBycondition("002");
		List<BaseDict>  industryType =baseDictService.selectBycondition("001");
		List<BaseDict>  levelType = baseDictService.selectBycondition("006");
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		
		//根据查询条件查询对应的用户
		Page<Customer> Customers = customerService.findByCondition(condition,page);
		model.addAttribute("page", Customers);
		
		//回显查询条件
		model.addAttribute("custName", condition.getCustName());
		model.addAttribute("custSource", condition.getCustSource());
		model.addAttribute("custIndustry", condition.getCustIndustry());
		model.addAttribute("custLevel", condition.getCustLevel());
		
		
		return "customer";
	}
	
	/**
	 * 查询修改返显数据
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("customer/edit")
	@ResponseBody
	public Customer  editUI(long id,Model model){
		Customer customer =customerService.selectById(id);
		return customer;
	}
	
	/**
	 * 修改客户信息
	 * @param customer
	 * @return
	 */
	@RequestMapping("customer/update")
	@ResponseBody
	public String updateCustomer(Customer customer){
		customerService.updateCustomer(customer);
		return "ok";
	}
	
	@RequestMapping("customer/delete")
	@ResponseBody
	public String deleteCustomer(long id){
		customerService.deleteCustomer(id);
		return "ok";
	}
}
