package com.supplyhouse.supplyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supplyhouse.supplyhouse.entity.SpecialHours;
import com.supplyhouse.supplyhouse.service.SpecialHoursService;

@RestController
@RequestMapping("/hours")
public class SpecialHoursController {

    @Autowired  
    private SpecialHoursService specialHoursService;

    @GetMapping("/special")
    public List<SpecialHours> getAllSpecialHours() {
        return specialHoursService.getAllSpecialHours();
    }

    @PostMapping("/special")
    public SpecialHours addSpecialHours(@RequestBody SpecialHours specialHours) {
        return specialHoursService.addSpecialHours(specialHours);
    }
}
