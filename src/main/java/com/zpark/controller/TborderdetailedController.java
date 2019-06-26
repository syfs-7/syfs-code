package com.zpark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpark.pojo.OrderDetailedVO;
import com.zpark.service.TborderdetailedService;

@RestController
@RequestMapping("tborderdetailed")
public class TborderdetailedController {
	
	@Autowired
	private TborderdetailedService tborderdetailedService;
	
	
	/* 根据前台页面传的id值进行查询	订单详细信息
	 * http://localhost:8082/tborderdetailed/selectOrderDetailedById
	 */	@RequestMapping("selectOrderDetailedById")
	public List<OrderDetailedVO> selectOrderDetailedById(Integer id){
		return this.tborderdetailedService.selectOrderDetailedById(id);
	}
	

}
