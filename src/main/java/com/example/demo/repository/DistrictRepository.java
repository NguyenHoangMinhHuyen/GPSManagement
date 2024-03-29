package com.example.demo.repository;

import com.example.demo.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District, Integer> {

    District findByCode(String code);
}
