package com.jshop.entity;

// Generated 2014-7-19 21:21:18 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ImgTypeT generated by hbm2java
 */
@Entity
@Table(name = "img_type_t", catalog = "jshoper3")
public class ImgTypeT implements java.io.Serializable {

	private String imgTypeId;
	private String imgTypeName;
	private Date createtime;
	private String creatorid;

	public ImgTypeT() {
	}

	public ImgTypeT(String imgTypeId, String imgTypeName, Date createtime,
			String creatorid) {
		this.imgTypeId = imgTypeId;
		this.imgTypeName = imgTypeName;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	@Id
	@Column(name = "IMG_TYPE_ID", unique = true, nullable = false, length = 20)
	public String getImgTypeId() {
		return this.imgTypeId;
	}

	public void setImgTypeId(String imgTypeId) {
		this.imgTypeId = imgTypeId;
	}

	@Column(name = "IMG_TYPE_NAME", nullable = false, length = 45)
	public String getImgTypeName() {
		return this.imgTypeName;
	}

	public void setImgTypeName(String imgTypeName) {
		this.imgTypeName = imgTypeName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

}
