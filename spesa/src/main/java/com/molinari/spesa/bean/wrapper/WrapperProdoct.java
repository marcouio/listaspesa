package com.molinari.spesa.bean.wrapper;

import java.util.Set;

import com.molinari.spesa.bean.Brand;
import com.molinari.spesa.bean.Category;
import com.molinari.spesa.bean.Discount;
import com.molinari.spesa.bean.List;
import com.molinari.spesa.bean.entity.IProductEntity;
import com.molinari.spesa.bean.entity.ProductEntity;
import com.molinari.utility.database.Clausola;
import com.molinari.utility.database.dao.GenericDAO;
import com.molinari.utility.database.dao.IDAO;

public class WrapperProdoct implements IProductEntity, IDAO<ProductEntity> {

	private GenericDAO<ProductEntity> productDAO;
	
	@Override
	public long getIdProduct() {
		return productDAO.getEntita().getIdProduct();
	}

	@Override
	public void setIdProduct(long idProduct) {
		productDAO.getEntita().setIdProduct(idProduct);
	}

	@Override
	public String getName() {
		return productDAO.getEntita().getName();
	}

	@Override
	public void setName(String name) {
		productDAO.getEntita().setName(name);
	}

	@Override
	public String getDescription() {
		return productDAO.getEntita().getDescription();
	}

	@Override
	public void setDescription(String description) {
		productDAO.getEntita().setDescription(description);
	}

	@Override
	public double getPrice() {
		return productDAO.getEntita().getPrice();
	}

	@Override
	public void setPrice(double price) {
		productDAO.getEntita().setPrice(price);
	}

	@Override
	public Brand getBrand() {
		return productDAO.getEntita().getBrand();
	}

	@Override
	public void setBrand(Brand brand) {
		productDAO.getEntita().setBrand(brand);
	}

	@Override
	public Category getCategory() {
		return productDAO.getEntita().getCategory();
	}

	@Override
	public void setCategory(Category category) {
		productDAO.getEntita().setCategory(category);
	}

	@Override
	public Set<List> getLists() {
		return productDAO.getEntita().getLists();
	}

	@Override
	public void setLists(Set<List> lists) {
		productDAO.getEntita().setLists(lists);
	}

	@Override
	public Set<Discount> getDiscounts() {
		return productDAO.getEntita().getDiscounts();
	}

	@Override
	public void setDiscounts(Set<Discount> discounts) {
		productDAO.getEntita().setDiscounts(discounts);
	}

	public WrapperProdoct(ProductEntity product) {
		productDAO = new GenericDAO<>(product);
	}

	@Override
	public ProductEntity getEntitaPadre() {
		return productDAO.getEntitaPadre();
	}

	@Override
	public ProductEntity selectById(int id) {
		return productDAO.selectById(id);
	}

	@Override
	public java.util.List<ProductEntity> selectWhere(java.util.List<Clausola> clausole, String appentoToQuery) {
		return productDAO.selectWhere(clausole, appentoToQuery);
	}

	@Override
	public java.util.List<ProductEntity> selectAll() {
		return productDAO.selectAll();
	}

	@Override
	public boolean insert(ProductEntity oggettoEntita) {
		return productDAO.insert(oggettoEntita);
	}

	@Override
	public boolean delete(int id) {
		return productDAO.delete(id);
	}

	@Override
	public boolean update(ProductEntity oggettoEntita) {
		return productDAO.update(oggettoEntita);
	}

	@Override
	public boolean deleteAll() {
		return deleteAll();
	}
}
