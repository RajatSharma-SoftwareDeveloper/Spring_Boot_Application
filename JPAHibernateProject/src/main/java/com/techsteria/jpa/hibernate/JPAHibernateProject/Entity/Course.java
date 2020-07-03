package com.techsteria.jpa.hibernate.JPAHibernateProject.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue()
	private int id ;
	
	private String name;
	
	@OneToMany(mappedBy = "course")
	List<Review> reviews = new ArrayList<Review>();
	
	
	protected Course()
	{
		
	}
	
	public Course(String name) {
		super();
		this.name = name;
	}
	
	
	
	public List<Review> getReviews() {
		return reviews;
	}

	public void addReviews(Review review) {
		this.reviews.add(review);
	}
	
	public void removeReview(Review review)
	{
		this.reviews.remove(review);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
