package com.zpark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpark.pojo.Tbbrand;
import com.zpark.service.TbbrandService;

@RestController
@RequestMapping("tbbrand")
public class TbbrandController {
	
	@Autowired
	private TbbrandService tbbrandService;
	
	/* 
	 * 查找所有的品牌表Tbbrand
	 * http://localhost:8082/tbbrand/findAllTbbrand
	 */
	@RequestMapping("findAllTbbrand")
	public List<Tbbrand> findAllTbbrand(){
		return this.tbbrandService.selectAll();
	}

}
