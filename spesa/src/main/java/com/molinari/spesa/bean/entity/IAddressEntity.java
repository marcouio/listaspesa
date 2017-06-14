package com.molinari.spesa.bean.entity;

public interface IAddressEntity {

	long getIdAddress();

	void setIdAddress(long idAddress);

	String getAddress();

	void setAddress(String address);

	String getTown();

	void setTown(String town);

	String getProvince();

	void setProvince(String province);

	String getRegion();

	void setRegion(String region);

}