/*
 * @author Ashwani K
 */
package com.example.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Hospital.
 */
@Entity
@Table(name = "HOSPITAL")
public class Hospital {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	/** The name. */
	@Column(name = "NAME")
	private String name;

	/** The city. */
	@Column(name = "CITY")
	private String city;

	/** The rating. */
	@Column(name = "RATING")
	private Double rating;

	/**
	 * Instantiates a new hospital.
	 *
	 * @param id     the id
	 * @param name   the name
	 * @param city   the city
	 * @param rating the rating
	 */
	public Hospital(Integer id, String name, String city, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.rating = rating;
	}

	/**
	 * Instantiates a new hospital.
	 */
	public Hospital() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the rating.
	 *
	 * @return the rating
	 */
	public Double getRating() {
		return rating;
	}

	/**
	 * Sets the rating.
	 *
	 * @param rating the new rating
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", city=" + city + ", rating=" + rating + "]";
	}

}
