package world_happiness_index.domain;

/**
 * User object
 * 
 * @author Akash Sunda
 * 
 */
public class WorldHappinessIndex {
	/*
	 * Correspond to the user table
	 */
	
	private Float happiness_index;
	private String country; 
	private String continent;
	/**
	 * @return the happiness_index
	 */
	public Float getHappiness_index() {
		return happiness_index;
	}
	/**
	 * @param happiness_index the happiness_index to set
	 */
	public void setHappiness_index(Float happiness_index) {
		this.happiness_index = happiness_index;
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
