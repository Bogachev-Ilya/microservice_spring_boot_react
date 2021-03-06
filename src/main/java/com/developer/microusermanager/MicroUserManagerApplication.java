package com.developer.microusermanager;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableEncryptableProperties
@EnableDiscoveryClient
public class MicroUserManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroUserManagerApplication.class, args);
	}

}
