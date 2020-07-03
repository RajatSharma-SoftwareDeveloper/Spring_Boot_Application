package com.techsteria.jpa.hibernate.JPAHibernateProject;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techsteria.jpa.hibernate.JPAHibernateProject.Entity.Review;
import com.techsteria.jpa.hibernate.JPAHibernateProject.repository.CourseManger;
import com.techsteria.jpa.hibernate.JPAHibernateProject.repository.StudentRepository;

@SpringBootApplication
public class JpaHibernateProjectApplication implements CommandLineRunner{
	
	@Autowired
	private CourseManger courseManager;
	@Autowired
	private StudentRepository student_repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		//courseManager.getCourseById(1001);
		//courseManager.deleteById(1001);
//		courseManager.saveCourse(new Course("MicroServices"));
//		courseManager.saveCourse(new Course("JPA"));
//		courseManager.saveCourse(new Course("Hibernate"));
//		courseManager.saveCourse(new Course("Spring Cloud"));
		
		//student_repository.save_student_with_passport();
		
		ArrayList<Review> reviews = new ArrayList();
		Review review1 = new Review("Great","3.9=star");
		Review review2 = new Review("Wonderful","4.9=star");
		reviews.add(review1);
		reviews.add(review2);
		
		courseManager.addReviewToCourse(1001, reviews);
		
	}

}
