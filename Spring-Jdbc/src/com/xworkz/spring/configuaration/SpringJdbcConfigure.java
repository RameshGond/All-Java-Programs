package com.xworkz.spring.configuaration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")

public class SpringJdbcConfigure {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource source = new DriverManagerDataSource("jdbc:mysql://localhost:3306/Xworkz_BTM_March",
				"root", "Xworkzodc@123");
		return source;
	}
}
