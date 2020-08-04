package com.practise.DBconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages="com.practise")
@Configuration
@EnableTransactionManagement
public class Dbconfig {
	
	@Bean
	public SessionFactory sessionfactoury() {
		LocalSessionFactoryBuilder lsf =new LocalSessionFactoryBuilder(getDataSource());
		Properties hybernateproperties =new Properties();
		hybernateproperties.setProperty("hybernate.dialect", "org.hibernate.dialect.H2Dialect");
		hybernateproperties.setProperty("showsql", "true");
		hybernateproperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hybernateproperties.setProperty("connection.pool_size", "10");
		lsf.addProperties(hybernateproperties);
		return lsf.scanPackages("com.practise.model").buildSessionFactory();

		
	}
	@Bean
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/PRJCT-NEW");
	    dataSource.setUsername("HI");
	    dataSource.setPassword("");
	    return dataSource;
	}

	@Bean
	public HibernateTransactionManager hibTransManagement(){
		return new HibernateTransactionManager(sessionfactoury());
	}

}
