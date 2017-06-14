package com.molinari.spesa.bean.entity;

import java.util.Set;

import com.molinari.spesa.bean.Category;
import com.molinari.spesa.bean.Product;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class CategoryEntity implements AbstractOggettoEntita, ICategoryEntity, FakeEntity {

	private Category category;
	
	public CategoryEntity(Category category) {
		super();
		this.category = category;
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#getIdCategory()
	 */
	@Override
	public long getIdCategory() {
		return category.getIdCategory();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#setIdCategory(long)
	 */
	@Override
	public void setIdCategory(long idCategory) {
		category.setIdCategory(idCategory);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#getName()
	 */
	@Override
	public String getName() {
		return category.getName();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		category.setName(name);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#getDescription()
	 */
	@Override
	public String getDescription() {
		return category.getDescription();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		category.setDescription(description);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#getProducts()
	 */
	@Override
	public Set<Product> getProducts() {
		return category.getProducts();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.ICategoryEntity#setProducts(java.util.Set)
	 */
	@Override
	public void setProducts(Set<Product> products) {
		category.setProducts(products);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getIdCategory());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdCategory(Long.parseLong(idEntita));
	}

	@Override
	public String getNome() {
		return getName();
	}

	@Override
	public Object getRealEntity() {
		return category;
	}

}
