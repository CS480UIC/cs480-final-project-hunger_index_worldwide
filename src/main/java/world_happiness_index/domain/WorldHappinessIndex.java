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
	
	private Integer avg_income;
	private String country; 
	private String continent;
	/**
	 * @return the avg_income
	 */
	public Integer getAvg_income() {
		return avg_income;
	}
	/**
	 * @param avg_income the avg_income to set
	 */
	public void setAvg_income(Integer avg_income) {
		this.avg_income = avg_income;
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
