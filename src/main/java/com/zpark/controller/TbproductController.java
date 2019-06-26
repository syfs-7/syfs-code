package com.zpark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.ProductVO;
import com.zpark.pojo.Tbproduct;
import com.zpark.service.TbproductService;

@RestController
@RequestMapping("tbproduct")
public class TbproductController {

	@Autowired
	private TbproductService tbproductService;

	/*
	 * 添加、删除、修改的返回值类型都是Integer 商品添加方法 http://localhost:8082/tbproduct/addProduct
	 */
	@RequestMapping("addProduct")
	public Integer addProduct(Tbproduct tbproduct) {

		return this.tbproductService.insert(tbproduct);
	}

	/*
	 * 商品信息管理，多表查询+分页 http://localhost:8082/tbproduct/findProductBy?pageNumber=1
	 */
	@RequestMapping("findProductBy")
	public PageInfo<ProductVO> findProductBy(ProductVO productVO, Integer pageNumber) {
		System.out.println("controller productVO" + productVO);
		return this.tbproductService.selectProductByColumns(productVO, pageNumber);
	}

	/*
	 * 根据主键id删除对应的商品信息 http://localhost:8082/tbproduct/deleteProductById
	 */
	@RequestMapping("deleteProductById")
	public Integer deleteProductById(Integer id) {

		return this.tbproductService.deleteByPrimaryKey(id);
	}

	/*
	 * 根据主键id查询对应的商品信息 http://localhost:8082/tbproduct/findProductById
	 */
	@RequestMapping("findProductById")
	public Tbproduct findProductById(Integer id) {
		return this.tbproductService.selectByPrimaryKey(id);
	}

	/*
	  *  修改对应的商品信息 
	 * http://localhost:8082/tbproduct/updateProductById
	 */
	@RequestMapping("updateProductById")
	public Integer updateProductById(Tbproduct tbproduct) {
		System.out.println("test.....updateProductById" + tbproduct);
		return this.tbproductService.updateByPrimaryKey(tbproduct);
	}

}
