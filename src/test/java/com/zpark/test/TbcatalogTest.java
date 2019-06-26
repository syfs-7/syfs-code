package com.zpark.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zpark.pojo.Tbcatalog;
import com.zpark.service.TbcatalogService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbcatalogTest {
	
	@Autowired
	private TbcatalogService tbcatalogService;
	
	@Test
	public void testAddTbcatalog() {
		
		Tbcatalog tbcatalog = new Tbcatalog();
		tbcatalog.setId(70);
		tbcatalog.setCatalog("酒类");
		tbcatalog.setCatalogdesc("所有酒种");
		tbcatalog.setShowflag(1);
		tbcatalog.setGoodflag(1);
		tbcatalog.setSerialno(701);
		tbcatalog.setParentid(7070);
		
		int i = tbcatalogService.insert(tbcatalog);
		System.out.println("i=" + i);
	}
	
}
