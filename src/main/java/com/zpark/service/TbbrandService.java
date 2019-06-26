package com.zpark.service;

import java.util.List;

import com.zpark.pojo.Tbbrand;

public interface TbbrandService{
	
	int deleteByPrimaryKey(Integer id);

    int insert(Tbbrand record);

    Tbbrand selectByPrimaryKey(Integer id);

    List<Tbbrand> selectAll();

    int updateByPrimaryKey(Tbbrand record);

}
