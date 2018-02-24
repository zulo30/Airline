
import java.util.*;
import java.io.*;
public class Flight implements Serializable {

    
    private Airplane airplane;
    private String flightNumber;
    private Employee[] crew;
    private String[] BoardingpassID;
    private Date departureTime;
    private double duration;
    private Airport destination;
    private Airport origin;
    private Date arrivalTime;
    
    //constructor 
	public Flight(Airplane a, String flightNumber, Date departureTime, double duration, Airport destination, Airport origin) {
		super();
		this.airplane = a;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
		this.duration = duration;
		this.destination = destination;
	}
	
	public Flight(Airplane airplane, String flightNumber, Employee[] crew, String[] boardingpassID, Date departureTime,
			double duration, Airport destination, Airport origin, Date arrivalTime) {
		super();
		this.airplane = airplane;
		this.flightNumber = flightNumber;
		this.crew = crew;
		BoardingpassID = boardingpassID;
		this.departureTime = departureTime;
		this.duration = duration;
		this.destination = destination;
		this.origin = origin;
		this.arrivalTime = arrivalTime;
	}
	//methods 
	
	//getters & setters 

	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public Employee[] getCrew() {
		return crew;
	}
	public void setCrew(Employee[] crew) {
		this.crew = crew;
	}
	
	public String[] getBoardingpassID() {
		return BoardingpassID;
	}
	public void setBoardingpassID(String[] boardingpassID) {
		BoardingpassID = boardingpassID;
	}
	
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	
	public Airport getOrigin() {
		return origin;
	}
	public void setOrigin(Airport origin) {
		this.origin = origin;
	}
	
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

   

}