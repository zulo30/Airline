
import java.util.*;

/**
 * 
 */
public class Luggage {

    

    private double volume;
    private double weight;
    private String id;
    private boolean isLost;
    
    
    
    //constructors 
    public Luggage() {
    }

	public Luggage(double volume, double weight, String id) {
		super();
		this.volume = volume;
		this.weight = weight;
		this.id = id;
		isLost = false;
	}
	
	//getters & setters
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public boolean isLost() {
		return isLost;
	}
	public void setLost(boolean isLost) {
		this.isLost = isLost;
	}

	
}