package com.molinari.spesa.bean.entity;

import java.util.Date;
import java.util.Set;

import com.molinari.spesa.bean.Discount;
import com.molinari.spesa.bean.Product;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class DiscountEntity implements AbstractOggettoEntita, IDiscountEntity, FakeEntity {

	private Discount discount;
	
	public DiscountEntity() {
		super();
		discount = new Discount();
	}

	public DiscountEntity(Discount discount) {
		super();
		this.discount = discount;
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#getIdDiscont()
	 */
	@Override
	public long getIdDiscount() {
		return discount.getIdDiscount();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#setIdDiscont(long)
	 */
	@Override
	public void setIdDiscount(long idDiscont) {
		discount.setIdDiscount(idDiscont);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#getName()
	 */
	@Override
	public String getName() {
		return discount.getName();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		discount.setName(name);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#getDescription()
	 */
	@Override
	public String getDescription() {
		return discount.getDescription();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		discount.setDescription(description);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#getFormula()
	 */
	@Override
	public String getFormula() {
		return discount.getFormula();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#setFormula(java.lang.String)
	 */
	@Override
	public void setFormula(String formula) {
		discount.setFormula(formula);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#getStarting()
	 */
	@Override
	public Date getStarting() {
		return discount.getStarting();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#setStarting(java.util.Date)
	 */
	@Override
	public void setStarting(Date starting) {
		discount.setStarting(starting);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#getEnding()
	 */
	@Override
	public Date getEnding() {
		return discount.getEnding();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IDiscountEntity#setEnding(java.util.Date)
	 */
	@Override
	public void setEnding(Date ending) {
		discount.setEnding(ending);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getIdDiscount());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdDiscount(Long.parseLong(idEntita));
	}

	@Override
	public String getNome() {
		return getName();
	}

	@Override
	public Object getRealEntity() {
		return discount;
	}

	@Override
	public Set<Product> getProducts() {
		return discount.getProducts();
	}

	@Override
	public void setProducts(Set<Product> products) {
		discount.setProducts(products);
	}

}
