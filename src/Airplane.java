
import java.util.*;
import java.io.*;


public class Airplane implements Serializable{

	private String plate;
    private int capacity;
    private boolean isAvailable;
    private int state; 
    private int flightHours;

    //constructor 
    public Airplane(String plate, int capacity,int flightHours) {
		super();
		this.plate = plate;
		this.capacity = capacity;
		this.flightHours = flightHours;
		state= 0;
		isAvailable = true;
	}
    
    

	//getters & setters
    public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getFlightHours() {
		return flightHours;
	}
	public void setFlightHours(int flightHours) {
		this.flightHours = flightHours;
	}


}