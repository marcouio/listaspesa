package com.molinari.spesa.bean.entity;

import java.util.Set;

import com.molinari.spesa.bean.Brand;
import com.molinari.spesa.bean.Category;
import com.molinari.spesa.bean.Discount;
import com.molinari.spesa.bean.List;
import com.molinari.spesa.bean.Product;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class ProductEntity implements AbstractOggettoEntita, IProductEntity, FakeEntity {
	
	private Product product;
	
	public ProductEntity() {
		this.product = new Product();
	}
	
	public ProductEntity(Product product) {
		this.product = product;
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getIdProduct()
	 */
	@Override
	public long getIdProduct() {
		return product.getIdProduct();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setIdProduct(long)
	 */
	@Override
	public void setIdProduct(long idProduct) {
		product.setIdProduct(idProduct);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getName()
	 */
	@Override
	public String getName() {
		return product.getName();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		product.setName(name);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getDescription()
	 */
	@Override
	public String getDescription() {
		return product.getDescription();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		product.setDescription(description);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getPrice()
	 */
	@Override
	public double getPrice() {
		return product.getPrice();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setPrice(double)
	 */
	@Override
	public void setPrice(double price) {
		product.setPrice(price);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getBrand()
	 */
	@Override
	public Brand getBrand() {
		return product.getBrand();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setBrand(com.molinari.spesa.bean.Brand)
	 */
	@Override
	public void setBrand(Brand brand) {
		product.setBrand(brand);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getCategory()
	 */
	@Override
	public Category getCategory() {
		return product.getCategory();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setCategory(com.molinari.spesa.bean.Category)
	 */
	@Override
	public void setCategory(Category category) {
		product.setCategory(category);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getLists()
	 */
	@Override
	public Set<List> getLists() {
		return product.getLists();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setLists(java.util.Set)
	 */
	@Override
	public void setLists(Set<List> lists) {
		product.setLists(lists);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#getDiscounts()
	 */
	@Override
	public Set<Discount> getDiscounts() {
		return product.getDiscounts();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IProductEntity#setDiscounts(java.util.Set)
	 */
	@Override
	public void setDiscounts(Set<Discount> discounts) {
		product.setDiscounts(discounts);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getIdProduct());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdProduct(Long.parseLong(idEntita));
	}

	@Override
	public String getNome() {
		return getName();
	}

	@Override
	public Object getRealEntity() {
		return product;
	}

}
