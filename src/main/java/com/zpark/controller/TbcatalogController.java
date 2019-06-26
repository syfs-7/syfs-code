package com.zpark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Tbcatalog;
import com.zpark.service.TbcatalogService;

@RestController
@RequestMapping("tbcatalog")
public class TbcatalogController {

	@Autowired
	private TbcatalogService tbcatalogService;

	/*
	 * 查找所有的商品类型表tbcatalog
	 * http://localhost:8082/tbcatalog/findAllTbcatalog
	 */
	@RequestMapping("findAllTbcatalog")
	public List<Tbcatalog> findAllTbcatalog() {
		return this.tbcatalogService.selectAll();
	}

	/*
	 * 添加商品类型tbcatalog
	 * http://localhost:8082/tbcatalog/addCatalog
	 */
	@RequestMapping("addCatalog")
	public Integer addCatalog(Tbcatalog tbcatalog) {
		return this.tbcatalogService.insert(tbcatalog);
	}
	
	/*
	 * 删除商品类型deleteCatalog
	 * http://localhost:8082/tbcatalog/deleteCatalog
	 */
	@RequestMapping("deleteCatalog")
	public Integer deleteCatalog(Integer id) {
		return this.tbcatalogService.deleteByPrimaryKey(id);
	}

	/*
	 * 根据主键id查找商品类型findCatalogById
	 * http://localhost:8082/tbcatalog/findCatalogById
	 */
	@RequestMapping("findCatalogById")
	public Tbcatalog findCatalogById(Integer id) {
		return this.tbcatalogService.selectByPrimaryKey(id);
	}

	/*
	 * 修改商品类型updateCatalog
	 * http://localhost:8082/tbcatalog/updateCatalog
	 */
	@RequestMapping("updateCatalog")
	public Integer updateCatalog(Tbcatalog tbcatalog) {
		return this.tbcatalogService.updateByPrimaryKey(tbcatalog);
	}

	/*
	 * 查找所有的商品类型selectAllCatalog+分页
	 * http://localhost:8082/tbcatalog/selectAllCatalog
	 * 测试：http://localhost:8082/tbcatalog/selectAllCatalog?pageNumber=1
	 */
	@RequestMapping("selectAllCatalog")
	public PageInfo<Tbcatalog> selectAllCatalog(Integer pageNumber) {
		return this.tbcatalogService.selectAll(pageNumber);
	}

}
