package com.molinari.spesa.bean.wrapper;

import java.util.Set;

import com.molinari.spesa.bean.Product;
import com.molinari.spesa.bean.entity.CategoryEntity;
import com.molinari.spesa.bean.entity.ICategoryEntity;
import com.molinari.utility.database.dao.GenericDAO;

public class WrapperCategory implements ICategoryEntity{

	private GenericDAO<CategoryEntity> categoryDAO;

	public WrapperCategory(CategoryEntity entity) {
		categoryDAO = new GenericDAO<CategoryEntity>(entity);
	}
	
	@Override
	public long getIdCategory() {
		return categoryDAO.getEntita().getIdCategory();
	}
	
	@Override
	public void setIdCategory(long idCategory) {
		categoryDAO.getEntita().setIdCategory(idCategory);
	}

	@Override
	public String getName() {
		return categoryDAO.getEntita().getName();
	}

	@Override
	public void setName(String name) {
		categoryDAO.getEntita().setName(name);
	}

	@Override
	public String getDescription() {
		return categoryDAO.getEntita().getDescription();
	}

	@Override
	public void setDescription(String description) {
		categoryDAO.getEntita().setDescription(description);
	}

	@Override
	public Set<Product> getProducts() {
		return categoryDAO.getEntita().getProducts();
	}

	@Override
	public void setProducts(Set<Product> products) {
		categoryDAO.getEntita().setProducts(products);
	}
}
