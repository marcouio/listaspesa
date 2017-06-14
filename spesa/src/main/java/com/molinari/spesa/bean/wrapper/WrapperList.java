package com.molinari.spesa.bean.wrapper;

import com.molinari.spesa.bean.entity.IListEntity;
import com.molinari.spesa.bean.entity.ListEntity;
import com.molinari.utility.database.dao.GenericDAO;

public class WrapperList implements IListEntity{

	private GenericDAO<ListEntity> listDAO;
	
	public WrapperList(ListEntity entity) {
		listDAO = new GenericDAO<ListEntity>(entity);
	}

	@Override
	public long getIdList() {
		return listDAO.getEntita().getIdList();
	}

	@Override
	public void setIdList(long idList) {
		listDAO.getEntita().setIdList(idList);
	}

	@Override
	public String getName() {
		return listDAO.getEntita().getName();
	}

	@Override
	public void setName(String name) {
		listDAO.getEntita().setName(name);
	}

	@Override
	public String getDescription() {
		return listDAO.getEntita().getDescription();
	}

	@Override
	public void setDescription(String description) {
		listDAO.getEntita().setDescription(description);
	}
}
