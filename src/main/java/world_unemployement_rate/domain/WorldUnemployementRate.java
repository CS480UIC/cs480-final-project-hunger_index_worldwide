package world_unemployement_rate.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class WorldUnemployementRate {
	/*
	 * Correspond to the user table
	 */
	
	private Float unemployment_rate;
	/**
	 * @return the unemployment_rate
	 */
	public Float getUnemployment_rate() {
		return unemployment_rate;
	}
	/**
	 * @param unemployment_rate the unemployment_rate to set
	 */
	public void setUnemployment_rate(Float unemployment_rate) {
		this.unemployment_rate = unemployment_rate;
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
	private String country; 
	private String continent;
	
	
}
