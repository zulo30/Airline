
import java.util.*;


public class Airport {


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



}