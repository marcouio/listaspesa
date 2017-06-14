package com.molinari.spesa.database;

import org.sqlite.JDBC;

import com.molinari.utility.database.ConnectionPool;

public class Connection extends ConnectionPool{

	@Override
	protected String getPassword() {
		return null;
	}

	@Override
	protected String getUser() {
		return "";
	}

	@Override
	protected String getDriver() {
		return JDBC.class.getName();
	}

	@Override
	protected String getDbUrl() {
		return "jdbc:sqlite:C:/Users/molinaris/listaspesa.sqlite";
	}

	@Override
	protected int getNumeroConnessioniDisponibili() {
		return 5;
	}

}
