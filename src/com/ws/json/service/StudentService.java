/**
 * 营运系统
 * com.ws.json.service
 * StudentService.java
 * 1.0
 * 2014年11月25日-上午10:14:54
 *  2014安能物流-版权所有
 *
 */
package com.ws.json.service;

/*import javax.ws.rs.Consumes;*/
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
/*import javax.ws.rs.Produces;*/
import javax.ws.rs.QueryParam;

import com.ws.json.entity.Student;
import com.ws.json.entity.UserResponse;

/**
 *
 * 类名称：StudentService 类描述： 创建人：郑亚琴 修改人：郑亚琴 修改时间：2014年11月25日 上午10:14:54 修改备注：
 * 
 * @version 1.0.0
 *
 */
@Path(value = "/student/{id}")
/*@Produces({"application/xml"}) */
public interface StudentService {
	@GET
	@Path(value = "/info")
/*	@Produces({"application/xml"}) */
	Student getStudent(@PathParam("id") long id, @QueryParam("name") String name);

	@GET
	@Path(value = "/info2")
	/*@Produces({"application/xml"}) */
	UserResponse getStudent(@QueryParam("name") String name);
}
