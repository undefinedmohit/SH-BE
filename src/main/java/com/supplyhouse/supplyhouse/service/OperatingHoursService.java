package com.supplyhouse.supplyhouse.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplyhouse.supplyhouse.entity.OperatingHours;
import com.supplyhouse.supplyhouse.repo.OperatingHourRepo;

@Service
public class OperatingHoursService {
    @Autowired
    OperatingHourRepo operatingHourRepo;

    public List<OperatingHours> getAllOperatingHours() {
        return Optional.ofNullable(operatingHourRepo.findAll()).orElse(Collections.emptyList());
    }

    public OperatingHours addOperatingHours(OperatingHours operatingHours) {
        return Optional.ofNullable(operatingHours).map(operatingHourRepo::save).orElseThrow(() -> new IllegalArgumentException("OperatingHours cannot be null"));
    }
}
