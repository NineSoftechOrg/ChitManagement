package com.example.chit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chit.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
