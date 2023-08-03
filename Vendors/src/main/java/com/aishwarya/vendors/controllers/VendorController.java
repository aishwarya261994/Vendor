package com.aishwarya.vendors.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aishwarya.vendors.entities.Vendor;
import com.aishwarya.vendors.services.VendorService;

@Controller
public class VendorController {
	@Autowired
	VendorService vs;
@RequestMapping("/showVendors")
	public String showVendors() {
		return "createVendors";
	}
@RequestMapping("/saveVendor")
public String createVendor(@ModelAttribute("vendor")Vendor vendor,ModelMap modelmap) {
	Vendor v=vs.saveVendor(vendor);
	String msg="The Vendor is stored "+v.getId();
	modelmap.addAttribute("msg", msg);
	return "createVendors";
}
@RequestMapping("/displayVendor")
public String displayVendors(ModelMap modelmap){
	List<Vendor> vendors=vs.getAllVendors();
	modelmap.addAttribute("vendors", vendors);
	return "displayVendor";
}
@RequestMapping("/showVendorData")
public String editVendor(@RequestParam("id") int id ,ModelMap modelmap) {
	Vendor vendor=vs.getVendorById(id);
	modelmap.addAttribute("vendor",vendor);
	return "editVendor";
}

@RequestMapping("/updateVendor")
public String updateVendor(@ModelAttribute("vendor") Vendor vendor,ModelMap modelmap) {
	vs.updateVendor(vendor);
	List<Vendor> vendors=vs.getAllVendors();
	modelmap.addAttribute("vendors", vendors);
	return "displayVendor";
}
@RequestMapping("/deleteVendor")
public String deleteVendor(@RequestParam("id") int id ,ModelMap modelmap) {
	Vendor v=vs.getVendorById(id);
	vs.deleteVendor(v);
	List<Vendor> vendors=vs.getAllVendors();
	modelmap.addAttribute("vendors", vendors);
	return "displayVendor";
	
	
}
}


