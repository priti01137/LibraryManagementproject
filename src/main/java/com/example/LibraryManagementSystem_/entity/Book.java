package com.example.LibraryManagementSystem_.entity;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false,unique = true)
//	@GeneratedValue(strategy = GenerationType.UUID)
	private String isbn;//	isbn= International Standard Book Number
	
	@Column(nullable = false)
	private int quentity;
	
	


}
