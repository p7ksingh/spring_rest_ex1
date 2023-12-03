package com.pks.springresthospital;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    private List<Hospital> hospitalLists = new ArrayList<Hospital>(List.of(new Hospital(1, "applo", "delhi", 3.4),
            new Hospital(2, "max", "UP", 4.0), new Hospital(3, "AIIMS", "Kerala", 5.0)));

    public List<Hospital> getHospitalLists() {
        return hospitalLists;
    }
}
