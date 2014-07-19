package com.jshop.entity;

// Generated 2014-7-19 21:21:18 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GoodsDetailRpT generated by hbm2java
 */
@Entity
@Table(name = "goods_detail_rp_t", catalog = "jshoper3")
public class GoodsDetailRpT implements java.io.Serializable {

	private String id;
	private String goodsid;
	private String detail;

	public GoodsDetailRpT() {
	}

	public GoodsDetailRpT(String id) {
		this.id = id;
	}

	public GoodsDetailRpT(String id, String goodsid, String detail) {
		this.id = id;
		this.goodsid = goodsid;
		this.detail = detail;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "GOODSID", length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "DETAIL", length = 65535)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
