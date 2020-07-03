package com.techsteria.jpa.hibernate.JPAHibernateProject.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techsteria.jpa.hibernate.JPAHibernateProject.Entity.Passport;
import com.techsteria.jpa.hibernate.JPAHibernateProject.Entity.Student;

@Repository
@Transactional
public class StudentRepository {

	
	@Autowired
	EntityManager em;
	
	
	public void save_student_with_passport()
	{
		Passport passport = new Passport("Q1234");
		em.persist(passport);
		Student student = new Student("Priya");
		student.setPassport(passport);
		em.persist(student);
	}
	
}
