package com.zpark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.mapper.TbcatalogMapper;
import com.zpark.pojo.Tbcatalog;
import com.zpark.service.TbcatalogService;
import com.zpark.util.PageUtil;

@Service("tbcatalogService")
public class TbcatalogServiceImpl implements TbcatalogService {
	
	@Autowired
	private TbcatalogMapper tbcatalogMapper;

	@Override
	@Transactional
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbcatalogMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public int insert(Tbcatalog record) {
		// TODO Auto-generated method stub
		return tbcatalogMapper.insert(record);
	}

	@Override
	public Tbcatalog selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbcatalogMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Tbcatalog> selectAll() {
		// TODO Auto-generated method stub
		return tbcatalogMapper.selectAll();
	}

	@Override
	@Transactional
	public int updateByPrimaryKey(Tbcatalog record) {
		// TODO Auto-generated method stub
		return tbcatalogMapper.updateByPrimaryKey(record);
	}
	
	/*
	 * mybatis 分页 插件+条件查询 Tbcatalog 从前台获取的条件
	 */
	@Override
	public PageInfo<Tbcatalog> selectAll(Integer pageNumber) {
		PageHelper.startPage(pageNumber,PageUtil.NOW_PAGE_SIZE);
		List<Tbcatalog> list = this.tbcatalogMapper.selectAll();
		return new PageInfo<Tbcatalog>(list);
	}
	

}
