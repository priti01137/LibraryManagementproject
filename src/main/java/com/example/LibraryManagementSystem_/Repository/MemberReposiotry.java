package com.example.LibraryManagementSystem_.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagementSystem_.entity.Member;

public interface MemberReposiotry extends JpaRepository<Member, Integer>{

}
