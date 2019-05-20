/*
 * @author Ashwani K
 */
package com.example.project;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class HospitalController.
 */
@RestController
@RequestMapping("/test/")
public class HospitalController {

	/** The hospital service. */
	@Autowired
	private HospitalService hospitalService;

	/**
	 * Gets the hospital.
	 *
	 * @param id the id
	 * @return the hospital
	 * @throws Exception the exception
	 */
	@GetMapping("/{id}")
	public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {
		return (hospitalService.getHospital(id));
	}

	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 * @throws Exception the exception
	 */
	@GetMapping("/all")
	public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		return (hospitalService.getAllHospitals());
	}

	/**
	 * Adds the hospital.
	 *
	 * @param hospital the hospital
	 * @return the response entity
	 */
	@RequestMapping(value = "/add-hospital", method = RequestMethod.POST)
	public ResponseEntity<String> addHospital(@RequestBody Hospital hospital) {
		URI location = " ";
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setLocation(location);
		responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<String>("add-hospital", responseHeaders, HttpStatus.CREATED);
	}

	/**
	 * Update hospital.
	 *
	 * @param hospital the hospital
	 * @return the response entity
	 */
	public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {

		return null;
	}

	/**
	 * Delete hospital.
	 *
	 * @param hospital the hospital
	 * @return the response entity
	 */
	public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {

		return null;
	}

}
