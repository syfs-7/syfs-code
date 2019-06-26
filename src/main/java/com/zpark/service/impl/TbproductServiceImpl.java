package com.zpark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.mapper.TbproductMapper;
import com.zpark.pojo.ProductVO;
import com.zpark.pojo.Tbproduct;
import com.zpark.service.TbproductService;
import com.zpark.util.PageUtil;

@Service("tbproductService")
public class TbproductServiceImpl implements TbproductService {

	@Autowired
	private TbproductMapper tbproductMapper;

	@Override
	@Transactional
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbproductMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public int insert(Tbproduct record) {
		// TODO Auto-generated method stub
		return tbproductMapper.insert(record);
	}

	@Override
	public Tbproduct selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tbproductMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Tbproduct> selectAll() {
		// TODO Auto-generated method stub
		return tbproductMapper.selectAll();
	}

	@Override
	@Transactional
	public int updateByPrimaryKey(Tbproduct record) {
		// TODO Auto-generated method stub
		return tbproductMapper.updateByPrimaryKey(record);
	}

	/*
	 * mybatis 分页 插件+条件查询 Tborder 从前台获取的条件
	 */
	public PageInfo<Tbproduct> findTbproductAndTbcatalog(Tbproduct tbproduct, Integer pageNumber) {

		PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
		List<Tbproduct> list = this.tbproductMapper.findTbproductAndTbcatalog(tbproduct);
		System.out.println("tborderService....list:" + list);

		return new PageInfo<>(list);
	}

	/*
	 * mybatis 分页 插件+条件查询 前端传值pageNumber productVO 传值进去的条件
	 */
	public PageInfo<ProductVO> selectProductByColumns(ProductVO productVO, Integer pageNumber) {

		if (productVO.getProductname() == null) {
			productVO.setProductname("%%");
		} else {
			productVO.setProductname("%" + productVO.getProductname() + "%");
		}

		if (productVO.getCatalogid() == null) {
			productVO.setCatalogid(-1);
		}

		if (productVO.getBrandid() == null) {
			productVO.setBrandid(-1);
		}

		if (productVO.getLowprice() == null) {
			productVO.setLowprice(0.0);
		}
		if (productVO.getUpprice() == null) {
			productVO.setUpprice(0.0);
		}
		if (productVO.getShowflag() == null) {
			productVO.setShowflag(-1);
		}
		if (productVO.getGoodflag() == null) {
			productVO.setGoodflag(-1);
		}

		PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
		List<ProductVO> list = this.tbproductMapper.selectProductByColumns(productVO);
		System.out.println("service_selectProductByColumns_list:" + list);
		return new PageInfo<>(list);
	}

}
