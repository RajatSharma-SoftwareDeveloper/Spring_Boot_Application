package com.techsteria.jpa.hibernate.JPAHibernateProject.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techsteria.jpa.hibernate.JPAHibernateProject.Entity.Course;
import com.techsteria.jpa.hibernate.JPAHibernateProject.Entity.Review;

@Repository
@Transactional
public class CourseManger {

	@Autowired
	EntityManager em ;
	
	public Course getCourseById(int id)
	{
		return em.find(Course.class, id);
		
	}
	
	public void addReviewToCourse(int id ,List<Review> reviews)
	{
		Course course = getCourseById(id); 
		
		for(Review review:reviews)
		{
			
			course.addReviews(review);
			review.setCourse(course);
			em.persist(review);
			
		}
		
	}
	
	
	public void saveCourse(Course course)
	{	
	em.persist(course);
	}
	
	public void deleteById(int id)
	{
		Course course = getCourseById(id);
		em.remove(course);
		
	}
	 
	
}
