package com.zpark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zpark.mapper.TbbrandMapper;
import com.zpark.pojo.Tbbrand;
import com.zpark.service.TbbrandService;

@Service("tbbrandService")
public class TbbrandServiceImpl implements TbbrandService {

	@Autowired
	private TbbrandMapper tbbrandMapper;
	
	@Override
	@Transactional
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbbrandMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public int insert(Tbbrand record) {
		// TODO Auto-generated method stub
		return tbbrandMapper.insert(record);
	}

	@Override
	public Tbbrand selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbbrandMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Tbbrand> selectAll() {
		// TODO Auto-generated method stub
		return tbbrandMapper.selectAll();
	}

	@Override
	@Transactional
	public int updateByPrimaryKey(Tbbrand record) {
		// TODO Auto-generated method stub
		return tbbrandMapper.updateByPrimaryKey(record);
	}

}
