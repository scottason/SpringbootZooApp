package dmacc.beans;

import javax.persistence.Embeddable;
@Embeddable
public class Location {
	private String country;
	private String zooName;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Location(String country, String zooName) {
		super();
		this.country = country;
		this.zooName = zooName;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZooName() {
		return zooName;
	}

	public void setZooName(String zooName) {
		this.zooName = zooName;
	}

	@Override
	public String toString() {
		return "Location [country=" + country + ", zooName=" + zooName + "]";
	}
	
}
