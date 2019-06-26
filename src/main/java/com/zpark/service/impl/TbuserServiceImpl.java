package com.zpark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.mapper.TbuserMapper;
import com.zpark.pojo.Tbuser;
import com.zpark.service.TbuserService;
import com.zpark.util.PageUtil;

@Service("tbuserService")
public class TbuserServiceImpl implements TbuserService {

	@Autowired
	private TbuserMapper tbuserMapper;
	
	@Override
	@Transactional
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbuserMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public int insert(Tbuser record) {
		// TODO Auto-generated method stub
		return tbuserMapper.insert(record);
	}

	@Override
	public Tbuser selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbuserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Tbuser> selectAll() {
		// TODO Auto-generated method stub
		return tbuserMapper.selectAll();
	}

	@Override
	@Transactional
	public int updateByPrimaryKey(Tbuser record) {
		// TODO Auto-generated method stub
		return tbuserMapper.updateByPrimaryKey(record);
	}
	
    public Tbuser login(Tbuser tbuser) {
    	return tbuserMapper.login(tbuser);
    }

    public Tbuser selectByName(String name) {
    	return this.tbuserMapper.selectByName(name);
    }
    
    @Override
	public PageInfo<Tbuser> findTbuser(Tbuser tbuser, Integer pageNumber) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
		List<Tbuser> list = this.tbuserMapper.findTbuser(tbuser);
		
		return new PageInfo<>(list);
	}

}
