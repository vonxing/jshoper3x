package com.jshop.entity;

// Generated 2014-1-25 22:43:14 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MemberLocationT generated by hbm2java
 */
@Entity
@Table(name = "member_location_t", catalog = "jshoper3")
public class MemberLocationT implements java.io.Serializable {

	private String lid;
	private String memberid;
	private String address;
	private double lat;
	private double lng;
	private Date createtime;
	private int versiont;
	private Date updatetime;

	public MemberLocationT() {
	}

	public MemberLocationT(String lid, String memberid, String address,
			double lat, double lng, Date createtime, int versiont,
			Date updatetime) {
		this.lid = lid;
		this.memberid = memberid;
		this.address = address;
		this.lat = lat;
		this.lng = lng;
		this.createtime = createtime;
		this.versiont = versiont;
		this.updatetime = updatetime;
	}

	@Id
	@Column(name = "LID", unique = true, nullable = false, length = 20)
	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	@Column(name = "MEMBERID", nullable = false, length = 20)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "ADDRESS", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "LAT", nullable = false, precision = 22, scale = 0)
	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	@Column(name = "LNG", nullable = false, precision = 22, scale = 0)
	public double getLng() {
		return this.lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
