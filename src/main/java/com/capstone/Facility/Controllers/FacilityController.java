package com.capstone.Facility.Controllers;

import com.capstone.Facility.DTOs.ResponseFacility;
import com.capstone.Facility.Services.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/facility")
public class FacilityController {
    private FacilityService facilityService;
    @Autowired
    public FacilityController(FacilityService facilityService) {
        this.facilityService = facilityService;
    }

    @GetMapping("/list-all")
    public ResponseFacility ListFacilities(){
        return facilityService.getAllFacilities();
    }
}
