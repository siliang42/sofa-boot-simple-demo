package com.jiayi.sofaboot;

import com.jiayi.sofaboot.service.HelloSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@SpringBootApplication
public class SofabootApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SofabootApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);

		HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
				.getBean("helloSyncServiceReference");

		System.out.println(helloSyncServiceReference.saySync("sync"));
	}
}
