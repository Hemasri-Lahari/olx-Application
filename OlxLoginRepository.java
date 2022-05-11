package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.User;

public interface OlxLoginRepository extends JpaRepository<User, Long>{

}
