package com.molinari.spesa.bean.entity;

import com.molinari.spesa.bean.Product;
import com.molinari.spesa.bean.User;

public interface IEvaluationEntity {

	long getIdEvaluation();

	void setIdEvaluation(long idEvaluation);

	int getRate();

	void setRate(int rate);

	Product getProduct();

	void setProduct(Product product);

	User getUser();

	void setUser(User user);

}