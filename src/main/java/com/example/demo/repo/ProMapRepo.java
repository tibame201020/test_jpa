package com.example.demo.repo;

import com.example.demo.model.ProMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProMapRepo extends JpaRepository<ProMap, Long> {
}
