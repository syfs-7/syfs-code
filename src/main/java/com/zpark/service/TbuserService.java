package com.zpark.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Tbuser;

public interface TbuserService {
	int deleteByPrimaryKey(Integer id);

	int insert(Tbuser record);

	Tbuser selectByPrimaryKey(Integer id);

	List<Tbuser> selectAll();

	int updateByPrimaryKey(Tbuser record);
	
    public Tbuser login(Tbuser tbuser);

    public Tbuser selectByName(String name);

    public PageInfo<Tbuser> findTbuser(Tbuser tbuser,Integer pageNumber);
}
