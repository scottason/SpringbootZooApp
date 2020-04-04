package dmacc.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Animals {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private String species;
	private String amount;
	@Autowired
	private Location location;
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animals(String species, String amount) {
		this.species = species;
		this.amount = amount;
	}

	public Animals(String species, String amount, Location newLocation) {
		this.species = species;
		this.amount = amount;
		this.location = newLocation;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Animals [id=" + id + ", species=" + species + ", amount=" + amount + ", location=" + location + "]";
	}


}
