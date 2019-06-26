package com.zpark.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.ProductVO;
import com.zpark.pojo.Tbproduct;
import com.zpark.service.TbproductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbproductTest {

	@Autowired
	private TbproductService tbproductService;

	@Test
	public void testAddTbproduct() {
		Tbproduct tbproduct = new Tbproduct();
		tbproduct.setId(701);
		tbproduct.setProductname("茅台（MOUTAI）贵州茅台 老酒 和美一家酒 ");
		tbproduct.setProductsn("70701");
		tbproduct.setCatalogid(70);
		tbproduct.setBrandid(707071);
		tbproduct.setPrice((float) 158.00);
		tbproduct.setSaleamout(5813546);
		tbproduct.setSaleprice((float) 398);
		tbproduct.setSerialno(701);
		tbproduct.setWeight((float) 0.55);
		tbproduct.setProductdesc("53度 酱香型白酒 500ml单瓶装");
		tbproduct.setProductremark("【满699减30】茅台古法酿造，酱香纯美，天然发酵，历久弥香，王茅归来，贵州茅台酒股份有限公司出品，人生正好喝王茅点击了解详情》》》(此商品不参加上述活动)");
		tbproduct
				.setProductmark("商品名称：茅台白酒商品编号：100001710941商品毛重：1.455kg商品产地：贵州容量：375mL-500mL度数：50度以上包装：单瓶酿造工艺：其它香型：酱香");
		tbproduct.setAmount(55535);
		tbproduct.setShowflag(1);
		tbproduct.setPayflag(1);
		tbproduct.setGoodflag(1);
		tbproduct.setPicpath("D:\\PanDownload");

		int i = tbproductService.insert(tbproduct);
		System.out.println("i=" + i);

	}
	
	@Test
	public void testFindTbproductTbcatalog() {
		
		Tbproduct tbproduct = new Tbproduct();
		tbproduct.setProductname("%%");
		tbproduct.setCatalogid(-1);
		
		PageInfo<Tbproduct> page = tbproductService.findTbproductAndTbcatalog(tbproduct, 0);
		System.out.println("test....page"+page);
	}
	
	@Test
	public void testFindProductBy() {
		
		ProductVO productVO = new ProductVO();
		productVO.setProductname("");
		productVO.setCatalogid(-1);
		productVO.setBrandid(-1);
		productVO.setShowflag(-1);
		productVO.setGoodflag(-1);
		productVO.setLowprice(0.0);
		productVO.setUpprice(0.0);
		
		PageInfo<ProductVO> page = this.tbproductService.selectProductByColumns(productVO, 1);
		System.out.println("test....page"+page);
	}
	
	
	
	
	
	
	
}
