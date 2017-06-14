package com.molinari.spesa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Evaluation {
	
	@Id
	@Column(nullable=false)
	private long idEvaluation;
	
	@ManyToOne(targetEntity=Product.class)
	@JoinColumn(name="IDPRODUCT")
	private Product product;
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="IDUSER")
	private User user;
	
	@Column
	private String note;
	
	@Column(nullable=false)
	private int rate;
	
	public long getIdEvaluation() {
		return idEvaluation;
	}
	public void setIdEvaluation(long idEvaluation) {
		this.idEvaluation = idEvaluation;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
