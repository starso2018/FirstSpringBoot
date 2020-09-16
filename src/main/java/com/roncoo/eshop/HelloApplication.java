package com.roncoo.eshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan("com.roncoo.eshop.dao")
public class HelloApplication{

  public static void main(String[] args) {
	  //new SpringApplicationBuilder(HelloApplication.class).profiles("default").build().run(args);
	 try {
		  SpringApplication.run(HelloApplication.class, args);
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
  }

}
