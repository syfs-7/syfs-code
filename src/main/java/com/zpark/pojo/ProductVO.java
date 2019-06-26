package com.zpark.pojo;

public class ProductVO {

	private Integer id;			// 商品编号

	private String picpath;		// 图片的名称

	private String productname;	// 商品名称

	private String productsn;	// 货号

	private Integer catalogid;	// 分类编号

	private Integer brandid;	// 品牌的id

	private String brandname;	// 品牌名称

	private Double price;		// 价格

	private Double lowprice;	// 下限价格

	private Double upprice;		// 上限价格

	private Integer showflag;	// 是否上架

	private Integer goodflag;	// 是否精品

	private Integer amount;		// 库存

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPicpath() {
		return picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductsn() {
		return productsn;
	}

	public void setProductsn(String productsn) {
		this.productsn = productsn;
	}

	public Integer getCatalogid() {
		return catalogid;
	}

	public void setCatalogid(Integer catalogid) {
		this.catalogid = catalogid;
	}

	public Integer getBrandid() {
		return brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getLowprice() {
		return lowprice;
	}

	public void setLowprice(Double lowprice) {
		this.lowprice = lowprice;
	}

	public Double getUpprice() {
		return upprice;
	}

	public void setUpprice(Double upprice) {
		this.upprice = upprice;
	}

	public Integer getShowflag() {
		return showflag;
	}

	public void setShowflag(Integer showflag) {
		this.showflag = showflag;
	}

	public Integer getGoodflag() {
		return goodflag;
	}

	public void setGoodflag(Integer goodflag) {
		this.goodflag = goodflag;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", picpath=" + picpath + ", productname=" + productname + ", productsn="
				+ productsn + ", catalogid=" + catalogid + ", brandid=" + brandid + ", brandname=" + brandname
				+ ", price=" + price + ", lowprice=" + lowprice + ", upprice=" + upprice + ", showflag=" + showflag
				+ ", goodflag=" + goodflag + ", amount=" + amount + "]";
	}

}
