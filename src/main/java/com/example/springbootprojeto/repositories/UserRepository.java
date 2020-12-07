package com.example.springbootprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootprojeto.entities.User;

//UserRepository não pode ser uma classe e sim uma interface porque JpaRepository também é uma interface.
public interface UserRepository extends JpaRepository<User, Long> {

}



