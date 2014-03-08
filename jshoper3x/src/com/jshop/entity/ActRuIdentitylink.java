package com.jshop.entity;

// Generated 2014-1-25 22:43:14 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ActRuIdentitylink generated by hbm2java
 */
@Entity
@Table(name = "act_ru_identitylink", catalog = "jshoper3")
public class ActRuIdentitylink implements java.io.Serializable {

	private String id;
	private ActReProcdef actReProcdef;
	private ActRuExecution actRuExecution;
	private ActRuTask actRuTask;
	private Integer rev;
	private String groupId;
	private String type;
	private String userId;

	public ActRuIdentitylink() {
	}

	public ActRuIdentitylink(String id) {
		this.id = id;
	}

	public ActRuIdentitylink(String id, ActReProcdef actReProcdef,
			ActRuExecution actRuExecution, ActRuTask actRuTask, Integer rev,
			String groupId, String type, String userId) {
		this.id = id;
		this.actReProcdef = actReProcdef;
		this.actRuExecution = actRuExecution;
		this.actRuTask = actRuTask;
		this.rev = rev;
		this.groupId = groupId;
		this.type = type;
		this.userId = userId;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROC_DEF_ID_")
	public ActReProcdef getActReProcdef() {
		return this.actReProcdef;
	}

	public void setActReProcdef(ActReProcdef actReProcdef) {
		this.actReProcdef = actReProcdef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROC_INST_ID_")
	public ActRuExecution getActRuExecution() {
		return this.actRuExecution;
	}

	public void setActRuExecution(ActRuExecution actRuExecution) {
		this.actRuExecution = actRuExecution;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TASK_ID_")
	public ActRuTask getActRuTask() {
		return this.actRuTask;
	}

	public void setActRuTask(ActRuTask actRuTask) {
		this.actRuTask = actRuTask;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "GROUP_ID_")
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Column(name = "TYPE_")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "USER_ID_")
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
