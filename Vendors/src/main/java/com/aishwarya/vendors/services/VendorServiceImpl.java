package com.aishwarya.vendors.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aishwarya.vendors.entities.Vendor;
import com.aishwarya.vendors.repos.VendorRepository;
@Service
public class VendorServiceImpl implements VendorService {
	@Autowired
	VendorRepository vr;

	@Override
	public Vendor saveVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return vr.save(vendor);
	}


	@Override
	public Vendor updateVendor(Vendor vendor) {
		
		// TODO Auto-generated method stub
		return vr.save(vendor);
	}


	@Override
	public void deleteVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vr.delete(vendor);
		
	}


	@Override
	public Vendor getVendorById(int id) {
		
		// TODO Auto-generated method stub
		return vr.findById(id).get();
	}


	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}

}
