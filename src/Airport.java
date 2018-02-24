
import java.util.*;
import java.io.*;

public class Airport implements Serializable {


    private String name;
    private String iata;
    private int[] gates;
    private String country;
    private String city;
    private boolean isAvailable;
    
    //constructors 
	public Airport(String name, String iata, int[] gates, String country, String city, boolean isAvailable) {
		super();
		this.name = name;
		this.iata = iata;
		this.gates = gates;
		this.country = country;
		this.city = city;
		this.isAvailable = isAvailable;
	}
	//getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}

	public int[] getGates() {
		return gates;
	}
	public void setGates(int[] gates) {
		this.gates = gates;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



}