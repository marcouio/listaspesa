package com.molinari.spesa.bean.wrapper;

import com.molinari.spesa.bean.entity.BrandEntity;
import com.molinari.spesa.bean.entity.IBrandEntity;
import com.molinari.utility.database.dao.GenericDAO;

public class WrapperBrand implements IBrandEntity {

	private GenericDAO<BrandEntity> brandDAO;
	
	public WrapperBrand(BrandEntity entity) {
		brandDAO = new GenericDAO<BrandEntity>(entity);
	}

	@Override
	public long getIdBrand() {
		return brandDAO.getEntita().getIdBrand();
	}

	@Override
	public void setIdBrand(long idBrand) {
		brandDAO.getEntita().setIdBrand(idBrand);
	}

	@Override
	public String getName() {
		return brandDAO.getEntita().getName();
	}

	@Override
	public void setName(String name) {
		brandDAO.getEntita().setName(name);
	}

	@Override
	public String getInfo() {
		return brandDAO.getEntita().getInfo();
	}

	@Override
	public void setInfo(String info) {
		brandDAO.getEntita().setInfo(info);
	}

}
