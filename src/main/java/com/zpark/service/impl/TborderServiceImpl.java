package com.zpark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.mapper.TborderMapper;
import com.zpark.pojo.OrderVO;
import com.zpark.pojo.Tborder;
import com.zpark.service.TborderService;
import com.zpark.util.PageUtil;

@Service("tborderService")
public class TborderServiceImpl implements TborderService {

	@Autowired
	private TborderMapper tborderMapper;

	@Override
	public Tborder selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tborderMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Tborder> selectAll() {
		// TODO Auto-generated method stub
		return tborderMapper.selectAll();
	}
	
//	条件查询+分页
	@Override
	public PageInfo<OrderVO> selectAllOrderByPage(Tborder tborder,Integer pageNumber) {
		if(tborder.getOrderno() == null) {
			tborder.setOrderno("");
		}
		if(tborder.getOrderstatus() == null) {
			tborder.setOrderstatus(-1);
		}
		
		PageHelper.startPage(pageNumber,PageUtil.NOW_PAGE_SIZE);
		List<OrderVO> list = this.tborderMapper.selectAllOrderByPage(tborder);
		return new PageInfo<>(list);
	}

}
