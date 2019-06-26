package com.zpark.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.OrderVO;
import com.zpark.pojo.Tborder;

public interface TborderService {

	Tborder selectByPrimaryKey(Integer id);

	List<Tborder> selectAll();
	
	// 条件查询+分页
	public PageInfo<OrderVO> selectAllOrderByPage(Tborder tborder,Integer pageNumber);
	
}
