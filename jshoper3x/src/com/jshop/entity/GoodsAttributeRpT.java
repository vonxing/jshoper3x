package com.jshop.entity;

// Generated 2014-7-19 21:21:18 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * GoodsAttributeRpT generated by hbm2java
 */
@Entity
@Table(name = "goods_attribute_rp_t", catalog = "jshoper3")
public class GoodsAttributeRpT implements java.io.Serializable {

	private String id;
	private String goodsid;
	private String attrval;

	public GoodsAttributeRpT() {
	}

	public GoodsAttributeRpT(String id, String goodsid, String attrval) {
		this.id = id;
		this.goodsid = goodsid;
		this.attrval = attrval;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "ATTRVAL", nullable = false, length = 45)
	public String getAttrval() {
		return this.attrval;
	}

	public void setAttrval(String attrval) {
		this.attrval = attrval;
	}

}
