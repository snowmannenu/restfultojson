/**
 * 营运系统
 * com.ws.json.entity
 * UserResponse.java
 * 1.0
 * 2014年11月25日-上午10:10:01
 *  2014安能物流-版权所有
 *
 */
package com.ws.json.entity;
import javax.xml.bind.annotation.*;

/**
 *
 * 类名称：UserResponse 类描述： 创建人：郑亚琴 修改人：郑亚琴 修改时间：2014年11月25日 上午10:10:01 修改备注：
 * 
 * @version 1.0.0
 *
 */
@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserResponse {
	private String status;

	private Student data;

	public UserResponse() {
	}

	public UserResponse(String status, Student data) {
		this.status = status;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}
}
