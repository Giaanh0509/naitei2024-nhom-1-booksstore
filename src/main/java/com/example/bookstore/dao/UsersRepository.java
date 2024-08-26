package com.example.bookstore.dao;

import com.example.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
