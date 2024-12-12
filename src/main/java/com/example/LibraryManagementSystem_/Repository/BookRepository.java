package com.example.LibraryManagementSystem_.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSystem_.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
