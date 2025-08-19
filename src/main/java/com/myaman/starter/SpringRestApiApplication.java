package com.myaman.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.myaman") //component ile işaretli yada extend edilmişi bul ve beani oluştur dedmek.
@SpringBootApplication
public class SpringRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
	}

}
