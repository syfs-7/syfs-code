package com.zpark.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zpark.pojo.Tbuser;
import com.zpark.service.TbuserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbuserTest {
	
	@Autowired
	private TbuserService  tbuserService;
	
	@Test
	public void testAddTbuser() {
		
		Tbuser tbuser = new Tbuser();
		tbuser.setUsername("林则徐2");;
		tbuser.setUserpwd("asdf22");
		tbuser.setEmail("2557503600@qq.com");
		tbuser.setCreatedate(new Date());
		tbuser.setUserstatus(0);
		
		int i = tbuserService.insert(tbuser);
		System.out.println("i=" + i);
	}
	
	@Test
	public void testSelectByName() {
		// TODO Auto-generated method stub
		String name = "张三丰";
		Tbuser user = this.tbuserService.selectByName(name);
			
//		如果返回得user是null
//		说明数据库中没有此账号 可以使用
//		如果返回得user不是null 有对象信息 说明 数据库中存在此账号 不可以进行注册
		System.out.println("testSelectByName::::"+user);
	}
	
	// 测试单个用户登录
	@Test
	public void testLogin() {
		Tbuser tbuser = new Tbuser();
		tbuser.setUsername("张三丰");
		tbuser.setUserpwd("123432r");
		Tbuser user = this.tbuserService.login(tbuser);
		
		System.out.println("test user:::"+user);
	}
	
	//测试查找所有的用户信息
	@Test
	public void testFindAllTbuser() {
		
		List<Tbuser> list = tbuserService.selectAll();
		System.out.println(list);
		
	}
	
	
}
