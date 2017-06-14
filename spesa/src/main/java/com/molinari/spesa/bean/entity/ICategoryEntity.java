package com.molinari.spesa.bean.entity;

import java.util.Set;

import com.molinari.spesa.bean.Product;

public interface ICategoryEntity {

	long getIdCategory();

	void setIdCategory(long idCategory);

	String getName();

	void setName(String name);

	String getDescription();

	void setDescription(String description);

	Set<Product> getProducts();

	void setProducts(Set<Product> products);

}