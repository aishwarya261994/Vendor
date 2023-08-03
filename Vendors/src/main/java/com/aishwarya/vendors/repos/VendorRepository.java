package com.aishwarya.vendors.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aishwarya.vendors.entities.Vendor;
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
