package com.supplyhouse.supplyhouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supplyhouse.supplyhouse.entity.SpecialHours;

public interface SpecialHoursRepo extends JpaRepository<SpecialHours, Long> {
    
}
