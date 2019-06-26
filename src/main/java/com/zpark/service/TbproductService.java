package com.zpark.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.ProductVO;
import com.zpark.pojo.Tbproduct;

public interface TbproductService {
	int deleteByPrimaryKey(Integer id);

	int insert(Tbproduct record);

	Tbproduct selectByPrimaryKey(Integer id);

	List<Tbproduct> selectAll();

	int updateByPrimaryKey(Tbproduct record);
	
	public PageInfo<Tbproduct> findTbproductAndTbcatalog (Tbproduct tbproduct,Integer pageNumber);
	
	public PageInfo<ProductVO> selectProductByColumns(ProductVO productVO, Integer pageNumber);
}
