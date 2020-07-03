package com.techsteria.jpa.hibernate.JPAHibernateProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String num;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "passport")
	private Student student;
	
	
	protected Passport()
	{
		
	}

	public Passport( String number) {
		super();
		this.num = number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return num;
	}

	public void setNumber(String number) {
		this.num = number;
	}
	
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + num + "]";
	}
	
	
}
