package com.example.demo.repo;

import com.example.demo.model.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseUserRepo extends JpaRepository<BaseUser, Long> {
}
