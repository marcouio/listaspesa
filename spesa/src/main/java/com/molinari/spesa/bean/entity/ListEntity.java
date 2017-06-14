package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.List;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class ListEntity implements AbstractOggettoEntita, IListEntity, FakeEntity {
	
	private List list;

	public ListEntity(List list) {
		super();
		this.list = list;
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IListEntity#getIdList()
	 */
	@Override
	public long getIdList() {
		return list.getIdList();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IListEntity#setIdList(long)
	 */
	@Override
	public void setIdList(long idList) {
		list.setIdList(idList);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IListEntity#getName()
	 */
	@Override
	public String getName() {
		return list.getName();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IListEntity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		list.setName(name);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IListEntity#getDescription()
	 */
	@Override
	public String getDescription() {
		return list.getDescription();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IListEntity#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		list.setDescription(description);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getIdList());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdList(Long.parseLong(idEntita));
	}

	@Override
	public String getNome() {
		return getName();
	}

	@Override
	public Object getRealEntity() {
		return list;
	}

}
