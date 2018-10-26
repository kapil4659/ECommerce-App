package com.niit.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.niit.models.Category;
import com.niit.models.Product;

@Configuration
public class DBConfiguration {
	public DBConfiguration() {
		System.out.println("DB");
	}

	@Bean
	public DataSource getDataSource() {
		System.out.println("DB");
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/kapil");
		datasource.setUsername("sa");
		datasource.setPassword("sa");
		System.out.println("datasource" + datasource);
		return datasource;
	}

	@Bean(name = "sessionFactory")
	@Autowired
	public SessionFactory getSessionFactory() {

		LocalSessionFactoryBuilder lsf = new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernate = new Properties();
		hibernate.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernate.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernate.setProperty("hibernate.show_sql", "true");
		lsf.addProperties(hibernate);
		Class classes[] = new Class[] { Product.class, Category.class };
		System.out.println("Session Factory " + lsf);
		System.out.println("SessionFactory Bean is created");
		return lsf.addAnnotatedClasses(classes).buildSessionFactory();

	}

	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		return new HibernateTransactionManager(getSessionFactory());
	}

}
