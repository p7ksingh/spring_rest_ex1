package com.pks.springresthospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/hospitals")
    public List<Hospital> getHospitals() {

        return hospitalService.getHospitalLists();
    }

}
