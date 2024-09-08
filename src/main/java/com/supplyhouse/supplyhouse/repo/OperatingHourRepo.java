package com.supplyhouse.supplyhouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supplyhouse.supplyhouse.entity.OperatingHours;

public interface OperatingHourRepo extends JpaRepository<OperatingHours, Long> {
    
}
