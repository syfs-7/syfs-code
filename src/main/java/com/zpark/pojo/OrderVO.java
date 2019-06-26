package com.zpark.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderVO {
	
	private Integer id;	// 订单id

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date submittime;	// 提交时间

    private Integer userid;		// 用户的id

    private Double amount;		// 订单金额

    private String payment; 	// 支付方式

    private String source;		// 订单来源

    private Integer orderstatus;//订单状态

    private String orderno;		// 订单编号 时间+几位随机数

    private String receiver;	// 收货人

    private String tel;			// 联系电话

    private String receiveraddr;// 收货地址
    
    private String username;	// 收货人姓名

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getSubmittime() {
		return submittime;
	}

	public void setSubmittime(Date submittime) {
		this.submittime = submittime;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	public String getReceiveraddr() {
		return receiveraddr;
	}

	public void setReceiveraddr(String receiveraddr) {
		this.receiveraddr = receiveraddr;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "OrderVO [id=" + id + ", submittime=" + submittime + ", userid=" + userid + ", amount=" + amount
				+ ", payment=" + payment + ", source=" + source + ", orderstatus=" + orderstatus + ", orderno="
				+ orderno + ", receiver=" + receiver + ", tel=" + tel + ", receiveraddr=" + receiveraddr + ", username="
				+ username + "]";
	}
    
}
