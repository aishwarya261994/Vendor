package com.aishwarya.vendors.services;

import java.util.List;

import com.aishwarya.vendors.entities.Vendor;

public interface VendorService {
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(Vendor vendor);
	Vendor getVendorById(int id);
	List<Vendor> getAllVendors();

}
