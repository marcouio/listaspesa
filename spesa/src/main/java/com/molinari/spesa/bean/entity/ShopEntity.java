package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.Address;
import com.molinari.spesa.bean.Shop;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class ShopEntity implements AbstractOggettoEntita, IShopEntity, FakeEntity {

	private Shop shop;
	
	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IShopEntity#getIdShop()
	 */
	@Override
	public long getIdShop() {
		return shop.getIdShop();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IShopEntity#setIdShop(long)
	 */
	@Override
	public void setIdShop(long idShop) {
		shop.setIdShop(idShop);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IShopEntity#getName()
	 */
	@Override
	public String getName() {
		return shop.getName();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IShopEntity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		shop.setName(name);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IShopEntity#getAddress()
	 */
	@Override
	public Address getAddress() {
		return shop.getAddress();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IShopEntity#setAddress(com.molinari.spesa.bean.Address)
	 */
	@Override
	public void setAddress(Address address) {
		shop.setAddress(address);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(shop.getIdShop());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdShop(Long.parseLong(idEntita));
	}

	@Override
	public String getNome() {
		return getName();
	}

	@Override
	public Object getRealEntity() {
		return shop;
	}

}
