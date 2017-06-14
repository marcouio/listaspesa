package com.molinari.spesa.bean.wrapper;

import com.molinari.spesa.bean.Address;
import com.molinari.spesa.bean.entity.ShopEntity;
import com.molinari.utility.database.dao.GenericDAO;

public class WrapperShop {

	private GenericDAO<ShopEntity> shopDAO;
	
	public WrapperShop(ShopEntity entity) {
		this.shopDAO = new GenericDAO<ShopEntity>(entity);
	}
	
	public long getIdShop() {
		return shopDAO.getEntita().getIdShop();
	}

	public void setIdShop(long idShop) {
		shopDAO.getEntita().setIdShop(idShop);
	}

	public String getName() {
		return shopDAO.getEntita().getName();
	}

	public void setName(String name) {
		shopDAO.getEntita().setName(name);
	}

	public Address getAddress() {
		return shopDAO.getEntita().getAddress();
	}

	public void setAddress(Address address) {
		shopDAO.getEntita().setAddress(address);
	}

}
