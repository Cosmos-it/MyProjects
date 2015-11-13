package Lab5;

public class City implements Comparable<City>{
	
	private String countryName;
	private String provinceName;
	private String cityName;
	private int population;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public int compareTo(City o) {
		return this.cityName.compareTo(o.cityName);
	}
	@Override
	public String toString() {
		return "City [countryName=" + countryName + ", provinceName="
				+ provinceName + ", cityName=" + cityName + ", population="
				+ population + "]";
	}

}
