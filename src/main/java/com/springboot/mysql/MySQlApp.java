package com.springboot.mysql;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class MySQlApp implements CommandLineRunner {

	@Autowired
	StudentRepo studentRepo;

	List<Student> students;
	List<Student> fromJson = new ArrayList<>();

	Gson gson = new Gson();

	List<String> gsonAsList = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(MySQlApp.class, args);
		//new MysqlApplication().allStudents();
		System.out.println();
	}

	@Override
	public void run(String... args) throws Exception {
		students = studentRepo.findAll();
		for (Student s: students){
			gsonAsList.add(gson.toJson(s));
			System.err.println(s);
		}
		gsonAsList.forEach(gson-> System.err.println(gson));
	}

	public Student addStudent(){
		return new Student("Test","For","JPA");
	}

	public Student findById(Long id){
		return studentRepo.getById(id);
	}

}
