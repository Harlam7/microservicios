package com.usuario.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class UsuarioServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UsuarioServiceApplication.class, args);
		System.out.println("probando probando 1 2 3");
	}

}
