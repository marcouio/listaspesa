package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.Brand;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class BrandEntity implements AbstractOggettoEntita, IBrandEntity, FakeEntity {

	private Brand brand;
	
	public BrandEntity(Brand brand) {
		super();
		this.brand = brand;
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IBrandEntity#getIdBrand()
	 */
	@Override
	public long getIdBrand() {
		return brand.getIdBrand();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IBrandEntity#setIdBrand(long)
	 */
	@Override
	public void setIdBrand(long idBrand) {
		brand.setIdBrand(idBrand);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IBrandEntity#getName()
	 */
	@Override
	public String getName() {
		return brand.getName();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IBrandEntity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		brand.setName(name);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IBrandEntity#getInfo()
	 */
	@Override
	public String getInfo() {
		return brand.getInfo();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IBrandEntity#setInfo(java.lang.String)
	 */
	@Override
	public void setInfo(String info) {
		brand.setInfo(info);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getIdBrand());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdBrand(Long.parseLong(idEntita));
	}

	@Override
	public String getNome() {
		return brand.getName();
	}

	@Override
	public Object getRealEntity() {
		return brand;
	}

}
