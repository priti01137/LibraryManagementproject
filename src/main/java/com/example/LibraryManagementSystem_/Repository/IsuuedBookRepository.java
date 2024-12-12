package com.example.LibraryManagementSystem_.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSystem_.entity.IssuedBook;

public interface IsuuedBookRepository extends JpaRepository<IssuedBook, Integer>{

}
