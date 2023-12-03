package com.pks.springresthospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/hospitals")
    public List<Hospital> getHospitals() {

        return hospitalService.getHospitalLists();
    }

    @GetMapping("/hospitals/{id}")
    public Hospital getHospital(@PathVariable("id") int id) {

        return hospitalService.getHospital(id);
    }

    @GetMapping("/hospitals/{location}/{rating}")
    public List<Hospital> getHospitalList(@PathVariable("location") String location,
            @PathVariable("rating") double rating) {

        return hospitalService.getHospitalByIdAndRating(location, rating);
    }

}
