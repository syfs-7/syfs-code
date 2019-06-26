package com.zpark.service;

import java.util.List;

import com.zpark.pojo.OrderDetailedVO;

public interface TborderdetailedService {
	
	public List<OrderDetailedVO> selectOrderDetailedById(Integer id);

}
