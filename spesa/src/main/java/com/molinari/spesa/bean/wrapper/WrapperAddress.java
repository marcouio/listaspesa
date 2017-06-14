package com.molinari.spesa.bean.wrapper;

import com.molinari.spesa.bean.entity.AddressEntity;
import com.molinari.spesa.bean.entity.IAddressEntity;
import com.molinari.utility.database.dao.GenericDAO;

public class WrapperAddress implements IAddressEntity {

	private GenericDAO<AddressEntity> addressDAO;
	
	public WrapperAddress(AddressEntity entita) {
		this.addressDAO = new GenericDAO<AddressEntity>(entita);
	}

	@Override
	public long getIdAddress() {
		return addressDAO.getEntita().getIdAddress();
	}

	@Override
	public void setIdAddress(long idAddress) {
		addressDAO.getEntita().setIdAddress(idAddress);
	}

	@Override
	public String getAddress() {
		return addressDAO.getEntita().getAddress();
	}

	@Override
	public void setAddress(String address) {
		this.addressDAO.getEntita().setAddress(address);;
	}

	@Override
	public String getTown() {
		return addressDAO.getEntita().getTown();
	}

	@Override
	public void setTown(String town) {
		addressDAO.getEntita().setTown(town);
	}

	@Override
	public String getProvince() {
		return addressDAO.getEntita().getProvince();
	}

	@Override
	public void setProvince(String province) {
		addressDAO.getEntita().setProvince(province);
	}

	@Override
	public String getRegion() {
		return addressDAO.getEntita().getRegion();
	}

	@Override
	public void setRegion(String region) {
		addressDAO.getEntita().setRegion(region);
	}
}
