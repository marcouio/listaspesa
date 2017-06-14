package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.Address;

public interface IShopEntity {

	long getIdShop();

	void setIdShop(long idShop);

	String getName();

	void setName(String name);

	Address getAddress();

	void setAddress(Address address);

}