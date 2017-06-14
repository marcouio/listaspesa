package com.molinari.spesa.bean.wrapper;

import com.molinari.spesa.bean.entity.IUserEntity;
import com.molinari.spesa.bean.entity.UserEntity;
import com.molinari.utility.database.dao.GenericDAO;

public class WrapperUser implements IUserEntity{

	private GenericDAO<UserEntity> userDAO;
	
	public WrapperUser(UserEntity entity){
		userDAO = new GenericDAO<UserEntity>(entity);
	}

	@Override
	public void setSurname(String surname) {
		userDAO.getEntita().setSurname(surname);
	}

	@Override
	public String getUsername() {
		return userDAO.getEntita().getUsername();
	}

	@Override
	public void setUsername(String username) {
		userDAO.getEntita().setUsername(username);
	}

	@Override
	public String getPassword() {
		return userDAO.getEntita().getPassword();
	}

	@Override
	public void setPassword(String password) {
		userDAO.getEntita().setPassword(password);
	}

	@Override
	public long getIdUser() {
		return userDAO.getEntita().getIdUser();
	}

	@Override
	public void setIdUser(long idUser) {
		userDAO.getEntita().setIdUser(idUser);
	}

	@Override
	public String getName() {
		return userDAO.getEntita().getName();
	}

	@Override
	public void setName(String name) {
		userDAO.getEntita().setName(name);
	}

	@Override
	public String getSurname() {
		return userDAO.getEntita().getSurname();
	}
}
