package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.pattern;

import java.util.Optional;

public interface patternRepository extends JpaRepository<pattern, Long> {
    Optional<pattern> findByUserName(String userName);
}
