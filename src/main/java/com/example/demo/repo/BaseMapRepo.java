package com.example.demo.repo;

import com.example.demo.model.BaseMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseMapRepo extends JpaRepository<BaseMap, Long> {
}
