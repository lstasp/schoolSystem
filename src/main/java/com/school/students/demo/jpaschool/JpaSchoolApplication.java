package com.school.students.demo.jpaschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:application-context.xml"})
public class JpaSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSchoolApplication.class, args);
	}

}
