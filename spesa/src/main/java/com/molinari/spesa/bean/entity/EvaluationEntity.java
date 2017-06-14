package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.Evaluation;
import com.molinari.spesa.bean.Product;
import com.molinari.spesa.bean.User;
import com.molinari.utility.commands.beancommands.AbstractOggettoEntita;
import com.molinari.utility.database.dao.FakeEntity;

public class EvaluationEntity implements AbstractOggettoEntita, IEvaluationEntity, FakeEntity {

	private Evaluation evaluation;
	
	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#getIdEvaluation()
	 */
	@Override
	public long getIdEvaluation() {
		return evaluation.getIdEvaluation();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#setIdEvaluation(long)
	 */
	@Override
	public void setIdEvaluation(long idEvaluation) {
		evaluation.setIdEvaluation(idEvaluation);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#getRate()
	 */
	@Override
	public int getRate() {
		return evaluation.getRate();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#setRate(int)
	 */
	@Override
	public void setRate(int rate) {
		evaluation.setRate(rate);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#getProduct()
	 */
	@Override
	public Product getProduct() {
		return evaluation.getProduct();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#setProduct(com.molinari.spesa.bean.Product)
	 */
	@Override
	public void setProduct(Product product) {
		evaluation.setProduct(product);
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#getUser()
	 */
	@Override
	public User getUser() {
		return evaluation.getUser();
	}

	/* (non-Javadoc)
	 * @see com.molinari.spesa.bean.entity.IEvaluationEntity#setUser(com.molinari.spesa.bean.User)
	 */
	@Override
	public void setUser(User user) {
		evaluation.setUser(user);
	}

	@Override
	public String getIdEntita() {
		return Long.toString(getIdEvaluation());
	}

	@Override
	public void setIdEntita(String idEntita) {
		setIdEvaluation(Long.parseLong(idEntita));
	}

	@Override
	public String getNome() {
		return evaluation.getNote();
	}

	@Override
	public Object getRealEntity() {
		return evaluation;
	}

}
