package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private StudentTest student;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	//@RequestMapping("/test")
	public void run(String... args) throws Exception {
		
//		this.student.createtable();
		this.student.insertdata();
		this.student.update();
	}

}
