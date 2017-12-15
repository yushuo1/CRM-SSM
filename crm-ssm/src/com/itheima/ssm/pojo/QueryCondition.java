package com.itheima.ssm.pojo;

public class QueryCondition {

	private String custName;    //客户名称
	private String custSource;   //客户来源
	private String custIndustry;  //所属行业
 	private String custLevel; //客户级别
	
 	//分页初始化参数
 	private Integer size =10;	//每页个数
 	private Integer start;      //开始索引
 	
 	
 	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	
 	
}
