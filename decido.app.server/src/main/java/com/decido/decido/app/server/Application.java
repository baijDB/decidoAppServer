package com.decido.decido.app.server;

import com.decido.decido.app.server.controller.Controller;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.ldap.Control;

@SpringBootApplication
@MapperScan(basePackages = {"com.decido.decido.app.server.mapper"})
@ComponentScan(basePackageClasses = Controller.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
}
