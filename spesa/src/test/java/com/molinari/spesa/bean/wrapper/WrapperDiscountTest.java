package com.molinari.spesa.bean.wrapper;

import org.junit.Test;

import com.molinari.spesa.bean.Brand;
import com.molinari.spesa.bean.entity.ProductEntity;
import com.molinari.spesa.database.Connection;
import com.molinari.utility.controller.ControlloreBase;

public class WrapperDiscountTest {

	@Test
	public void testGetMapColumn(){
		
		ControlloreBase.getSingleton().setConnectionClassName(Connection.class.getName());
		ProductEntity entity = new ProductEntity();
		WrapperProdoct wrap = new WrapperProdoct(entity);
		ProductEntity selectById = wrap.selectById(1);
		Brand brand = selectById.getBrand();
		System.out.println(brand.getName());
		
	}
}
