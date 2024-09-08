package com.supplyhouse.supplyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supplyhouse.supplyhouse.entity.OperatingHours;
import com.supplyhouse.supplyhouse.service.OperatingHoursService;

@RestController
@RequestMapping("/hours")
@CrossOrigin("*")
public class OperatingHoursController {

    @Autowired
    private OperatingHoursService operatingHoursService;

    @GetMapping("/operating")
    public List<OperatingHours> getAllOperatingHours() {
        return operatingHoursService.getAllOperatingHours();
    }

    @PostMapping("/operating")
    public OperatingHours addOperatingHours(@RequestBody OperatingHours operatingHours) {
        return operatingHoursService.addOperatingHours(operatingHours);
    }
}
