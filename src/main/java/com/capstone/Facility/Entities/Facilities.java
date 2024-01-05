package com.capstone.Facility.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Facilities {
    @Id
    private Integer facility_id;
    @Column(name = "facility_name")
    private String facility_name;
    @Column(name = "facility_type")
    private String facility_type;

    @Column(name = "facility_image")
    private String facility_image;

    public Facilities() {
    }

    public Facilities(String facility_name, String facility_type, String facility_image) {
        this.facility_name = facility_name;
        this.facility_type = facility_type;
        this.facility_image = facility_image;
    }

    public String getFacility_name() {
        return facility_name;
    }

    public void setFacility_name(String facility_name) {
        this.facility_name = facility_name;
    }

    public String getFacility_type() {
        return facility_type;
    }

    public void setFacility_type(String facility_type) {
        this.facility_type = facility_type;
    }

    public String getfacility_image() {
        return facility_image;
    }

    public void setfacility_image(String facility_image) {
        this.facility_image = facility_image;
    }
}
