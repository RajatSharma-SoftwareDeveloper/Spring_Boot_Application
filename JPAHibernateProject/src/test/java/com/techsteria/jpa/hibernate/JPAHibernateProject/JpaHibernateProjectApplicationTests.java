package com.techsteria.jpa.hibernate.JPAHibernateProject;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.techsteria.jpa.hibernate.JPAHibernateProject.Entity.Passport;
import com.techsteria.jpa.hibernate.JPAHibernateProject.Entity.Student;
import com.techsteria.jpa.hibernate.JPAHibernateProject.repository.StudentRepository;

@SpringBootTest
class JpaHibernateProjectApplicationTests {

	@Autowired
	EntityManager em;
	
	@Autowired
	StudentRepository sr;
	
	@Test
	@Transactional
	void fetch_student_details() {
		
		Student student = em.find(Student.class,3001);
		
		System.out.print("passport_details" +student.getPassport());
		
		
	}
	
	
	@Test
	@Transactional
	void fetch_passport_details() {
		
		Passport passport = em.find(Passport.class,2001);
		
		System.out.print("passport_details" +passport);
		
		
	}
	
	
	
}
