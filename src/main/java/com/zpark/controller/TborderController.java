package com.zpark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.OrderVO;
import com.zpark.pojo.Tborder;
import com.zpark.service.TborderService;

@RestController
@RequestMapping("tborder")
public class TborderController {

	@Autowired
	private TborderService tborderService;

	/*
	  *  分页+条件查询 
	 * http://localhost:8082/tborder/selectByPage
	 */
	@RequestMapping("selectByPage")
	public PageInfo<OrderVO> selectBypage(Tborder tborder,Integer pageNumber){
		return this.tborderService.selectAllOrderByPage(tborder,pageNumber);
	}

}
