package com.samchenyu.MySQLStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySqlStarterApplication {

	public static void main(String[] args) {

		SpringApplication.run(MySqlStarterApplication.class, args);
		System.out.println("Server Running");
	}

}
