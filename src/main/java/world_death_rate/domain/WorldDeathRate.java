package world_death_rate.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class WorldDeathRate {
	/*
	 * Correspond to the user table
	 */
	
	private Float death_rate;
	private String country; 
	private String continent;
	/**
	 * @return the death_rate
	 */
	public Float getDeath_rate() {
		return death_rate;
	}
	/**
	 * @param death_rate the death_rate to set
	 */
	public void setDeath_rate(Float death_rate) {
		this.death_rate = death_rate;
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
