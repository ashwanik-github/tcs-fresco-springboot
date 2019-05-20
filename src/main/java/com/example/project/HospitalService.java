/*
 * @author Ashwani K
 */
package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class HospitalService.
 */
@Service
public class HospitalService {

	/** The hospital repository. */
	@Autowired
	private HospitalRepository hospitalRepository;

	/**
	 * Gets the all hospitals.
	 *
	 * @return the all hospitals
	 */
	public List<Hospital> getAllHospitals() {
		return hospitalRepository.findAll();
	}

	/**
	 * Gets the hospital.
	 *
	 * @param id the id
	 * @return the hospital
	 */
	public Hospital getHospital(int id) {

		return (hospitalRepository.findHospitalById(id));
	}

	/**
	 * Adds the hospital.
	 *
	 * @param hospital the hospital
	 */
	public void addHospital(Hospital hospital) {

	}

	/**
	 * Update hospital.
	 *
	 * @param hospital the hospital
	 */
	public void updateHospital(Hospital hospital) {

	}

	/**
	 * Delete hospital.
	 *
	 * @param hospital the hospital
	 */
	public void deleteHospital(Hospital hospital) {

	}
}
