package com.SpringLearning.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDataAccessObject {
	@Autowired
	ComponentJdbcConnection jdbcConnection; // a proxy is autowirded in here

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
}
