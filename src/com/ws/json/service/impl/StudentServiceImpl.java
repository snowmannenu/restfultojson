/**
 * 营运系统
 * com.ws.json.service.impl
 * StudentServiceImpl.java
 * 1.0
 * 2014年11月25日-上午10:16:55
 *  2014安能物流-版权所有
 *
 */
package com.ws.json.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.core.Response;

import com.ws.json.entity.Student;
import com.ws.json.entity.UserResponse;
import com.ws.json.service.StudentService;

/**
 *
 * 类名称：StudentServiceImpl 类描述： 创建人：郑亚琴 修改人：郑亚琴 修改时间：2014年11月25日 上午10:16:55 修改备注：
 * 
 * @version 1.0.0
 *
 */
public class StudentServiceImpl implements StudentService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ws.json.service.StudentService#getStudent(long,
	 * java.lang.String)
	 */
	@Override
	public Student getStudent(long id, String name) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		try {
			s.setBirthday(new SimpleDateFormat("yyyy-MM-dd")
					.parse("1983-04-26"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return s;
	}

	public Response getStudent1(String name)
    {
        Student s = new Student();
        s.setId(1);
        s.setName(name);
        try
        {
            s.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1983-04-26"));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        return Response.ok(s).build();
        //return s;
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ws.json.service.StudentService#getStudent(java.lang.String)
	 */
	@Override
	public UserResponse getStudent(String name) {
		Student s = new Student();
		s.setId(3);
		s.setName(name);
		try {
			s.setBirthday(new SimpleDateFormat("yyyy-MM-dd")
					.parse("1982-07-29"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return new UserResponse("ok", s);
	}

}
