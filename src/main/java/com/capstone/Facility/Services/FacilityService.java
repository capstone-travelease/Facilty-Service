package com.capstone.Facility.Services;

import com.capstone.Facility.DTOs.ResponseFacility;
import com.capstone.Facility.Entities.Facilities;
import com.capstone.Facility.Repositories.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService {
    private FacilityRepository facilityRepository;
    @Autowired
    public FacilityService(FacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }

    public ResponseFacility getAllFacilities(){
        List<Facilities> facilityList = facilityRepository.listAllFacility();

        return new ResponseFacility(
                200,
                facilityList,
                "Successful"
        );
    }
}
