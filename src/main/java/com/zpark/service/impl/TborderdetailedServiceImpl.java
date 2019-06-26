package com.zpark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpark.mapper.TborderdetailedMapper;
import com.zpark.pojo.OrderDetailedVO;
import com.zpark.service.TborderdetailedService;

@Service("tborderdetailedService")
public class TborderdetailedServiceImpl implements TborderdetailedService {
	
	@Autowired
	private TborderdetailedMapper tborderdetailedMapper;

	@Override
	public List<OrderDetailedVO> selectOrderDetailedById(Integer id) {
		// TODO Auto-generated method stub
		return this.tborderdetailedMapper.selectOrderDetailedById(id);
	}

}
