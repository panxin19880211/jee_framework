package com.loy.e.sys.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.loy.e.core.data.MenuData;
import com.loy.e.core.data.Tree;
import com.loy.e.core.entity.BaseEntity;


/**
 * 
 * @author Loy Fu qq群 540553957
 * @since 1.7
 * @version 1.0.0
 * 
 */
@Entity
@Table(name="loy_resource") 
public class ResourceEntity extends BaseEntity implements Tree{
	@Column(length = 100)
	private String name;
	
	@Column(length = 100)
	private String url;
	
	@Column(length = 100)
	private String permission;
	
	private Boolean available = Boolean.TRUE;
	
	@Column(length = 36)
	private String parentId;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private ResourceTypeEnum resourceType;
	
	@Column(length = 50)
	private String cls;
	
	@Column(length = 100)
	private String lableKey;
	@Column
	private Integer sortNum= 0;
	@Column(length = 50)
	private String accessCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public ResourceTypeEnum getResourceType() {
		return resourceType;
	}
	public void setResourceType(ResourceTypeEnum resourceType) {
		this.resourceType = resourceType;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getLableKey() {
		return lableKey;
	}
	public void setLableKey(String lableKey) {
		this.lableKey = lableKey;
	}
	public Integer getSortNum() {
		return sortNum;
	}
	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}
	
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	@Override
	public MenuData getData() {
		MenuData menuData = new MenuData();
		menuData.setName(this.getName());
		menuData.setCls(this.getCls());
		menuData.setUrl(this.getUrl());
		menuData.setLableKey(this.getLableKey());
		return menuData;
	}
	
	
}