package com.zpark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Tbuser;
import com.zpark.service.TbuserService;

@RestController
@RequestMapping("tbuser")
public class TbuserController {

	@Autowired
	private TbuserService tbuserService;

	/* 注册访问的地址
	 * http://localhost:8082/tbuser/register
	 */	@RequestMapping("register")
	public Integer register(Tbuser tbuser) {

		return this.tbuserService.insert(tbuser);
	}

	/* 登录的访问地址 
	 * http://localhost:8082/tbuser/login
	 */
	@RequestMapping("login")
	public Tbuser login(Tbuser tbuser) {
		return this.tbuserService.login(tbuser);
	}

	/* 登录访问地址 根据名字查询 
	 * http://localhost:8082/tbuser/selectByName
	 */
	@RequestMapping("selectByName")
	public Integer selectByname(String uname) {
		// 防止内存溢出

		Tbuser tb = this.tbuserService.selectByName(uname);
		if (tb == null) {
			return 1; // 返回1 该用户名可以使用
		}
		return 0; // 返回0 数据库中该用户名不可以使用

	}

	/* 查询所有的用户信息
	 * http://localhost:8082/tbuser/findAllTbuser
	 */
	@RequestMapping("/findAllTbuser")
	public PageInfo<Tbuser> findAllTbuser(String username, Integer userstatus, Integer pageNumber) {

		if (username == null || username == "") {
			username = "%%";
		} else {
			username = "%" + username + "%";
		}
		if (userstatus == null) {
			userstatus = -1;
		}

		Tbuser tbuser = new Tbuser();
		tbuser.setUsername(username);
		tbuser.setUserstatus(userstatus);
		return this.tbuserService.findTbuser(tbuser, pageNumber);
	}

	/* 根据id进行删除
	 * http://localhost:8082/tbuser/deleteById
	 */
	@RequestMapping("deleteById")
	public Integer deleteById(Integer id) {
		System.out.println("controller....deleteById::" + id);

		return this.tbuserService.deleteByPrimaryKey(id);
	}
	
	/* 根据id查询单个用户
	 * http://localhost:8082/tbuser/findUserById
	 */
	@RequestMapping("findUserById")
	public Tbuser findUserById(Integer id) {
		System.out.println("controller...find..id"+id);
		
		return this.tbuserService.selectByPrimaryKey(id);
	}
	
	/* 修改用户信息
	 * http://localhost:8082/tbuser/updateUserById
	 */
	@RequestMapping("updateUserById")
	public Integer updateMallGoodsById(Tbuser tbuser) {
		System.out.println("updateUserById...."+tbuser);
		
		return this.tbuserService.updateByPrimaryKey(tbuser);
	}

}
