package com.zpark.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Tbcatalog;

public interface TbcatalogService {

    int deleteByPrimaryKey(Integer id);

    int insert(Tbcatalog record);

    Tbcatalog selectByPrimaryKey(Integer id);

    List<Tbcatalog> selectAll();

    int updateByPrimaryKey(Tbcatalog record);
    
    public PageInfo<Tbcatalog> selectAll(Integer pageNumber);
}
