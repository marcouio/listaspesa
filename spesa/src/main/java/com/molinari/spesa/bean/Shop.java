package com.molinari.spesa.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
public class Shop {
	
	@Id
	@Column(nullable=false)
	private long idShop;

	@Column
	private String name;
	
	@OneToOne()
	@JoinColumn(unique=true, name="IDADDRESS", referencedColumnName="IDADDRESS")
	private Address address;
	
	@JoinTable(name="PRODUCTSHOP",
			joinColumns=@JoinColumn(name="IDSHOP", referencedColumnName="IDSHOP"),
			inverseJoinColumns=@JoinColumn(name="IDPRODUCT", referencedColumnName="IDPRODUCT")
		)
	private Set<Product> products;

	public long getIdShop() {
		return idShop;
	}

	public void setIdShop(long idShop) {
		this.idShop = idShop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
