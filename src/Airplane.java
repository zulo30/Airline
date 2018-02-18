
import java.util.*;

public class Airplane {

	private String plate;
    private int capacity;
    private boolean isAvailable;
    private int flightHours;

    //constructor 
    public Airplane(String plate, int capacity,int flightHours) {
		super();
		this.plate = plate;
		this.capacity = capacity;
		this.flightHours = flightHours;
		isAvailable = true;
	}
    
    //getters & setters
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