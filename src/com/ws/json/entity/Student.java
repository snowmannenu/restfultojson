/**
 * 营运系统
 * com.ws.json.entity
 * Student.java
 * 1.0
 * 2014年11月25日-上午10:10:58
 *  2014安能物流-版权所有
 *
 */
package com.ws.json.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.*;

/**
 *
 * 类名称：Student 类描述： 创建人：郑亚琴 修改人：郑亚琴 修改时间：2014年11月25日 上午10:10:58 修改备注：
 * 
 * @version 1.0.0
 *
 */
@XmlRootElement(name = "Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	private long id;
	private String name;
	private Date birthday;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
