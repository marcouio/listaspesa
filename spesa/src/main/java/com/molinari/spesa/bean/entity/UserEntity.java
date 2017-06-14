package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.User;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class UserEntity implements AbstractOggettoEntita, IUserEntity, FakeEntity {

	private User user;
	
	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#getIdUser()
	 */
	@Override
	public long getIdUser() {
		return user.getIdUser();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#setIdUser(long)
	 */
	@Override
	public void setIdUser(long idUser) {
		user.setIdUser(idUser);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#getName()
	 */
	@Override
	public String getName() {
		return user.getName();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		user.setName(name);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#getSurname()
	 */
	@Override
	public String getSurname() {
		return user.getSurname();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#setSurname(java.lang.String)
	 */
	@Override
	public void setSurname(String surname) {
		user.setSurname(surname);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#getUsername()
	 */
	@Override
	public String getUsername() {
		return user.getUsername();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#setUsername(java.lang.String)
	 */
	@Override
	public void setUsername(String username) {
		user.setUsername(username);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#getPassword()
	 */
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IUserEntity#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		user.setPassword(password);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getIdUser());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdUser(Integer.parseInt(idEntita));
	}

	@Override
	public String getNome() {
		return getName();
	}

	@Override
	public Object getRealEntity() {
		return user;
	}

}
