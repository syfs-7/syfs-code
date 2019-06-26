package com.zpark.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Tborder;
import com.zpark.service.TborderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TborderTest {

	@Autowired
	private TborderService tborderService;

}
