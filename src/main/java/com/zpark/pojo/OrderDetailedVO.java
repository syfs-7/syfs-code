package com.zpark.pojo;

public class OrderDetailedVO {
	private Integer uid;			// 用户编号
	
	private String username;		// 用户姓名
	
	private Integer oid;			// 订单id
	
	private Integer orderstatus;	// 订单状态
	
	private String orderno;			// 订单编号
	
	private String payment;			// 支付方式
	
	private String source;			// 订单来源
	
	private String receiver;		// 收货人
	
	private String tel;				// 联系电话
	
	private String receiverAddr;	// 地址
	
	private Integer odid;			// 商品id
	
	private String productname;		// 商品名称
	
	private String productsn;		// 货号
	
	private Double transactionprice;// 成交价格
	
	private Integer amount;			// 数量
	
	private Double subtotal;		// 小计
	
	private String picpath;			// 商品图片

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getReceiverAddr() {
		return receiverAddr;
	}

	public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
	}

	public Integer getOdid() {
		return odid;
	}

	public void setOdid(Integer odid) {
		this.odid = odid;
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

	public Double getTransactionprice() {
		return transactionprice;
	}

	public void setTransactionprice(Double transactionprice) {
		this.transactionprice = transactionprice;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public String getPicpath() {
		return picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	@Override
	public String toString() {
		return "OrderDetailedVO [uid=" + uid + ", username=" + username + ", oid=" + oid + ", orderstatus="
				+ orderstatus + ", orderno=" + orderno + ", payment=" + payment + ", source=" + source + ", receiver="
				+ receiver + ", tel=" + tel + ", receiverAddr=" + receiverAddr + ", odid=" + odid + ", productname="
				+ productname + ", productsn=" + productsn + ", transactionprice=" + transactionprice + ", amount="
				+ amount + ", subtotal=" + subtotal + ", picpath=" + picpath + "]";
	}

}
