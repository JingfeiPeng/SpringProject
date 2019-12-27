package com.SpringLearning.Spring.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,
	proxyMode=ScopedProxyMode.TARGET_CLASS) // uses the proxy whenever this class is a dependency, so the dependency can be prototype instead of singleton
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection Created");
	}
}
