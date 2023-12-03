package com.pks.springresthospital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    private List<Hospital> hospitalLists = new ArrayList<Hospital>(List.of(new Hospital(1, "applo", "delhi", 3.4),
            new Hospital(2, "max", "UP", 4.0), new Hospital(3, "AIIMS", "Kerala", 5.0)));

    public List<Hospital> getHospitalLists() {
        return hospitalLists;
    }

    public Hospital getHospital(int id) {

        return hospitalLists.stream().filter(hospital -> hospital.getId() == id).findFirst().get();
    }

    public List<Hospital> getHospitalByIdAndRating(String location, double rating) {
        return hospitalLists.stream()
                .filter(hospital -> hospital.getLocation().equals(location) && hospital.getRating() > rating)
                .collect(Collectors.toList());
    }
}
