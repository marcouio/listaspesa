package com.molinari.spesa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class List {

	@Id
	@Column(nullable=false)
	private long idList;
	
	@Column(nullable=false)
	private String name;
	
	@Column
	private String description;
	
	@ManyToMany(mappedBy="lists")
	@JoinTable(name="PRODUCTLIST",
		joinColumns=@JoinColumn(name="IDLIST", referencedColumnName="IDLIST"),
		inverseJoinColumns=@JoinColumn(name="IDPRODUCT", referencedColumnName="IDPRODUCT")
	)
	private java.util.List<Product> products;

	public long getIdList() {
		return idList;
	}

	public void setIdList(long idList) {
		this.idList = idList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
