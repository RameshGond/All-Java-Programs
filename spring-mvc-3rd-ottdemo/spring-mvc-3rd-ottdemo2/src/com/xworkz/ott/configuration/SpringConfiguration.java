package com.xworkz.ott.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.ott.configuration")
@EnableWebMvc
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Springconfiguration Created...");
	}
	
	@Bean 
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/xworkz_jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		return dataSource;


		// jdbc:mysql://localhost:3306/xworkz_jdbc
	}

	
	

}
