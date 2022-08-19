package com.example.demo.repo;

import com.example.demo.model.ProUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProUserRepo extends JpaRepository<ProUser, Long> {
}
