package com.capstone.Facility.Repositories;

import com.capstone.Facility.Entities.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityRepository extends JpaRepository<Facilities, Long> {
    @Query("SELECT new com.capstone.Facility.Entities.Facilities(fa.facility_name, fa.facility_type, fa.facility_image) FROM Facilities fa")
    List<Facilities> listAllFacility();
}
