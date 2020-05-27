package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.demo.dao.EmployeeDao;
import com.demo.service.EmployeeService;

@Configuration
@EnableTransactionManagement
@ComponentScans({
	@ComponentScan("com.demo.dao"),
	@ComponentScan("com.demo.service")

})
public class AppConfig {

//	<bean id="car" class="package-path-className"></bean>

	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();
		factory.setPersistenceUnitName("MySqlDemoPersistence");
		return factory;
	}
	
	@Bean
	public JpaTransactionManager getJpaTransactionManager() {
		JpaTransactionManager jtm = new JpaTransactionManager();
		jtm.setEntityManagerFactory(getLocalEntityManagerFactoryBean().getObject());
		return jtm;
	}
	
	@Bean
	public EmployeeDao employeeDao() {
		return new EmployeeDao();
	}

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
	
}
