package com.molinari.spesa.bean.wrapper;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.molinari.spesa.bean.Product;
import com.molinari.spesa.bean.entity.DiscountEntity;
import com.molinari.spesa.bean.entity.IDiscountEntity;
import com.molinari.utility.database.Clausola;
import com.molinari.utility.database.dao.GenericDAO;
import com.molinari.utility.database.dao.IDAO;

public class WrapperDiscount implements IDiscountEntity, IDAO<DiscountEntity>{

	private GenericDAO<DiscountEntity> discountDAO;

	public WrapperDiscount(DiscountEntity entity) {
		discountDAO = new GenericDAO<>(entity);
	}
	
	@Override
	public long getIdDiscount() {
		return discountDAO.getEntita().getIdDiscount();
	}

	@Override
	public void setIdDiscount(long idDiscount) {
		discountDAO.getEntita().setIdDiscount(idDiscount);
	}

	@Override
	public String getName() {
		return discountDAO.getEntita().getName();
	}

	@Override
	public void setName(String name) {
		discountDAO.getEntita().setName(name);
	}

	@Override
	public String getDescription() {
		return discountDAO.getEntita().getDescription();
	}

	@Override
	public void setDescription(String description) {
		discountDAO.getEntita().setDescription(description);
	}

	@Override
	public String getFormula() {
		return discountDAO.getEntita().getFormula();
	}

	@Override
	public Date getStarting() {
		return discountDAO.getEntita().getStarting();
	}

	@Override
	public Date getEnding() {
		return discountDAO.getEntita().getEnding();
	}

	@Override
	public void setFormula(String formula) {
		discountDAO.getEntita().setFormula(formula);
	}

	@Override
	public void setStarting(Date starting) {
		discountDAO.getEntita().setStarting(starting);
	}

	@Override
	public void setEnding(Date ending) {
		discountDAO.getEntita().setEnding(ending);
	}

	@Override
	public String toString() {
		return discountDAO.getEntita().toString();
	}

	@Override
	public DiscountEntity getEntitaPadre() {
		return discountDAO.getEntitaPadre();
	}

	@Override
	public DiscountEntity selectById(int id) {
		return discountDAO.selectById(id);
	}

	@Override
	public List<DiscountEntity> selectWhere(List<Clausola> clausole, String appentoToQuery) {
		return discountDAO.selectWhere(clausole, appentoToQuery);
	}

	@Override
	public List<DiscountEntity> selectAll() {
		return discountDAO.selectAll();
	}

	@Override
	public boolean insert(DiscountEntity oggettoEntita) {
		return discountDAO.insert(oggettoEntita);
	}

	@Override
	public boolean delete(int id) {
		return discountDAO.delete(id);
	}

	@Override
	public boolean update(DiscountEntity oggettoEntita) {
		return discountDAO.update(oggettoEntita);
	}

	@Override
	public boolean deleteAll() {
		return discountDAO.deleteAll();
	}

	@Override
	public Set<Product> getProducts() {
		return discountDAO.getEntita().getProducts();
	}

	@Override
	public void setProducts(Set<Product> products) {
		discountDAO.getEntita().setProducts(products);
	}
}
