package com.supplyhouse.supplyhouse.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplyhouse.supplyhouse.entity.SpecialHours;
import com.supplyhouse.supplyhouse.repo.SpecialHoursRepo;

@Service
public class SpecialHoursService {
    @Autowired
    SpecialHoursRepo specialHoursRepo;

    public List<SpecialHours> getAllSpecialHours() {
        return Optional.ofNullable(specialHoursRepo.findAll()).orElse(Collections.emptyList());
    }

    public SpecialHours addSpecialHours(SpecialHours specialHours) {
        return Optional.ofNullable(specialHours).map(specialHoursRepo::save).orElseThrow(() -> new IllegalArgumentException("Special Hours cannot be null"));
    }
}
