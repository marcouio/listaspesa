package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.Address;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class AddressEntity implements AbstractOggettoEntita, IAddressEntity, FakeEntity {

	private Address address;
	
	public AddressEntity(Address address) {
		super();
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#getIdAddress()
	 */
	@Override
	public long getIdAddress() {
		return address.getIdAddress();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#setIdAddress(long)
	 */
	@Override
	public void setIdAddress(long idAddress) {
		address.setIdAddress(idAddress);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#getAddress()
	 */
	@Override
	public String getAddress() {
		return address.getAddress();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#setAddress(java.lang.String)
	 */
	@Override
	public void setAddress(String address) {
		this.address.setAddress(address);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#getTown()
	 */
	@Override
	public String getTown() {
		return address.getTown();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#setTown(java.lang.String)
	 */
	@Override
	public void setTown(String town) {
		address.setTown(town);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#getProvince()
	 */
	@Override
	public String getProvince() {
		return address.getProvince();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#setProvince(java.lang.String)
	 */
	@Override
	public void setProvince(String province) {
		address.setProvince(province);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#getRegion()
	 */
	@Override
	public String getRegion() {
		return address.getRegion();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#setRegion(java.lang.String)
	 */
	@Override
	public void setRegion(String region) {
		address.setRegion(region);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getAddressEntity().getIdAddress());
	}

	@Override
	public void setIdEntita(String idEntita) {
		long id = Long.parseLong(idEntita);
		getAddressEntity().setIdAddress(id);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IAddressEntity#getNome()
	 */
	@Override
	public String getNome() {
		return getAddressEntity().getAddress();
	}

	public Address getAddressEntity() {
		return address;
	}

	public void setAddressEntity(Address address) {
		this.address = address;
	}

	@Override
	public Object getRealEntity() {
		return address;
	}

}
