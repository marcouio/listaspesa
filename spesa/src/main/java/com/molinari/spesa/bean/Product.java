package com.molinari.spesa.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@Column(nullable=false)
	private long idProduct;
	
	@Column(nullable=false)
	private String name;
	
	@Column
	private String description;
	
	@Column
	private double price;
	
	@ManyToOne(targetEntity=Brand.class)
	@JoinColumn(name="IDBRAND")
	private Brand brand;
	
	@ManyToOne(targetEntity=Category.class)
	@JoinColumn(name="IDCATEGORY")
	private Category category;
	
	@ManyToMany(targetEntity=List.class)
	@JoinTable(name="PRODUCTLIST",
			inverseJoinColumns=@JoinColumn(name="IDLIST", referencedColumnName="IDLIST"),
			joinColumns=@JoinColumn(name="IDPRODUCT", referencedColumnName="IDPRODUCT")
	)
	private Set<List> lists;
	
	@ManyToMany(mappedBy="products", targetEntity=Discount.class)
	@JoinTable(name="PRODUCTDISCOUNT",
		inverseJoinColumns=@JoinColumn(name="IDDISCOUNT", referencedColumnName="IDDISCOUNT"),
		joinColumns=@JoinColumn(name="IDPRODUCT", referencedColumnName="IDPRODUCT")
	)
	private Set<Discount> discounts;

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<List> getLists() {
		return lists;
	}

	public void setLists(Set<List> lists) {
		this.lists = lists;
	}

	public Set<Discount> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Set<Discount> discounts) {
		this.discounts = discounts;
	}
}
