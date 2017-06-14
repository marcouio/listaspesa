package com.molinari.spesa.bean.entity;

import java.util.Date;
import java.util.Set;

import com.molinari.spesa.bean.Product;

public interface IDiscountEntity {

	long getIdDiscount();

	void setIdDiscount(long idDiscont);

	String getName();

	void setName(String name);

	String getDescription();

	void setDescription(String description);

	String getFormula();

	void setFormula(String formula);

	Date getStarting();

	void setStarting(Date starting);

	Date getEnding();

	void setEnding(Date ending);
	
	public Set<Product> getProducts();

	public void setProducts(Set<Product> products);

}