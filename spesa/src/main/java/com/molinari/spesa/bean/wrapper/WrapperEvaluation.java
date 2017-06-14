package com.molinari.spesa.bean.wrapper;

import com.molinari.spesa.bean.Product;
import com.molinari.spesa.bean.User;
import com.molinari.spesa.bean.entity.EvaluationEntity;
import com.molinari.utility.database.dao.GenericDAO;

public class WrapperEvaluation {

	private GenericDAO<EvaluationEntity> evaluationDAO;
	
	public WrapperEvaluation(EvaluationEntity entity) {
		evaluationDAO = new GenericDAO<EvaluationEntity>(entity);
	}
	
	public long getIdEvaluation() {
		return evaluationDAO.getEntita().getIdEvaluation();
	}

	public void setIdEvaluation(long idEvaluation) {
		evaluationDAO.getEntita().setIdEvaluation(idEvaluation);
	}

	public int getRate() {
		return evaluationDAO.getEntita().getRate();
	}

	public void setRate(int rate) {
		evaluationDAO.getEntita().setRate(rate);
	}

	public Product getProduct() {
		return evaluationDAO.getEntita().getProduct();
	}

	public void setProduct(Product product) {
		evaluationDAO.getEntita().setProduct(product);
	}

	public User getUser() {
		return evaluationDAO.getEntita().getUser();
	}

	public void setUser(User user) {
		evaluationDAO.getEntita().setUser(user);
	}
}
