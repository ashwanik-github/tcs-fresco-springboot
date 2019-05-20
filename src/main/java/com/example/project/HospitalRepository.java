/*
 * @author Ashwani K
 */
package com.example.project;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface HospitalRepository.
 */
@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {

	/**
	 * Find hospital by id.
	 *
	 * @param id the id
	 * @return the hospital
	 */
	public Hospital findHospitalById(Integer id);

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@Override
	public List<Hospital> findAll();

}
