package com.molinari.spesa.bean.entity;

import java.util.Set;

import com.molinari.spesa.bean.Brand;
import com.molinari.spesa.bean.Category;
import com.molinari.spesa.bean.Discount;
import com.molinari.spesa.bean.List;

public interface IProductEntity {

	long getIdProduct();

	void setIdProduct(long idProduct);

	String getName();

	void setName(String name);

	String getDescription();

	void setDescription(String description);

	double getPrice();

	void setPrice(double price);

	Brand getBrand();

	void setBrand(Brand brand);

	Category getCategory();

	void setCategory(Category category);

	Set<List> getLists();

	void setLists(Set<List> lists);

	Set<Discount> getDiscounts();

	void setDiscounts(Set<Discount> discounts);

}