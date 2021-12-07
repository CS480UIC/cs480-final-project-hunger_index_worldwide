package world_vaccination_info.domain;

/**
 * User object
 * 
 * @author Akash Sunda
 * 
 */
public class WorldVaccinationInfo {
	/*
	 * Correspond to the user table
	 */
	
	private Float vaccination_rate;
	private String country; 
	private String continent;
	/**
	 * @return the vaccination_rate
	 */
	public Float getVaccination_rate() {
		return vaccination_rate;
	}
	/**
	 * @param vaccination_rate the vaccination_rate to set
	 */
	public void setVaccination_rate(Float vaccination_rate) {
		this.vaccination_rate = vaccination_rate;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	

}
