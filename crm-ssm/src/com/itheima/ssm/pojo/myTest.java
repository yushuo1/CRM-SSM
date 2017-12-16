package com.itheima.ssm.pojo;

import java.util.Date;

public class myTest {

	private String id;
	private String name;
	private String addris;
	private int age;
	private String sex;
	private Date  birthday;

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddris() {
		return addris;
	}

	public void setAddris(String addris) {
		this.addris = addris;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
