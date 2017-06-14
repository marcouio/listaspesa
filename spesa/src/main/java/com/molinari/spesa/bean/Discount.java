package com.molinari.spesa.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Discount {

	@Id
	@Column
	private long idDiscount;
	
	@Column(nullable=false)
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String formula;
	
	@Column
	private Date starting;
	
	@Column
	private Date ending;
	
	@ManyToMany(targetEntity=Product.class)
	@JoinTable(name="PRODUCTDISCOUNT",
			joinColumns=@JoinColumn(name="IDDISCOUNT", referencedColumnName="IDDISCOUNT"),
			inverseJoinColumns=@JoinColumn(name="IDPRODUCT", referencedColumnName="IDPRODUCT")
		)
	private Set<Product> products;

	public long getIdDiscount() {
		return idDiscount;
	}

	public void setIdDiscount(long idDiscont) {
		this.idDiscount = idDiscont;
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

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public Date getStarting() {
		return starting;
	}

	public void setStarting(Date starting) {
		this.starting = starting;
	}

	public Date getEnding() {
		return ending;
	}

	public void setEnding(Date ending) {
		this.ending = ending;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
