
import java.util.*;


public class Airline {

  

	private String name;
    private Passenger[] passenger;
    private Airplane[] airplane;
    private Flight[] flight;
    private Employee[] employee;
    private BoardingPass[] boardingPass;
    private Airport[] airport;
    private Luggage[] luggage;
    
    //constructor
    public Airline() {
    }


   

    //methods
    public Flight findFlight( String flightNumber) {
		int i = 0;
		while ( i < flight.length && flight[i].getFlightNumber().compareTo(flightNumber) != 0) {i++;}
		if(i == (flight.length)) {return null;}else{return flight[i];}
    }
    public int findFlightPosition( String flightNumber) {
		int i = 0;
		while ( i < flight.length && flight[i].getFlightNumber().compareTo(flightNumber) != 0) {i++;}
		if(i == (flight.length)) {return -1;}else{return i;}
    }

    public Passenger findPassenger(String id ) {
	    	int i = 0;
	    	while ( i < passenger.length && passenger[i].getId().compareTo(id) != 0) {i++;}
	    	if(i == (passenger.length)) {return null;}else{return passenger[i];}
    }
    public int findPassengerPosition(String id ) {
	    	int i = 0;
	    	while ( i < passenger.length && passenger[i].getId().compareTo(id) != 0) {i++;}
	    	if(i == (passenger.length)) {return -1;}else{return i;}
	}
    
    public Luggage findLuggage(String id) {
	    	int i = 0;
	    	while ( i < luggage.length && luggage[i].getId().compareTo(id) != 0) {i++;}
	    	if(i == (luggage.length)) {return null;}else{return luggage[i];}
    }
    public int findLuggagePosition(String id) {
	    	int i = 0;
	    	while ( i < luggage.length && luggage[i].getId().compareTo(id) != 0) {i++;}
	    	if(i == (luggage.length)) {return -1;}else{return i;}
	}
    public Airplane findAirplane(String id) {
	    	int i = 0;
	    	while ( i < airplane.length && airplane[i].getPlate().compareTo(id) != 0) {i++;}
	    	if(i == (airplane.length)) {return null;}else{return airplane[i];}
    }
    public void findStatusOfFlight(String flightNumber) {
    	 	Flight f = findFlight(flightNumber);
        
    }
    public boolean checkAirplaneAvaibility(String plate) {
        Airplane a = findAirplane(plate);
        return a.isAvailable();
    }

  
    
    public void addPassenger(String name,String correo,String idType, String id,int age,String address,String nationality,String gender,Date birthday) {
    		Passenger p = new Passenger(name,correo,idType,id, age,address, nationality,gender, birthday);
	    	if( passenger == null) {
	    		passenger = new Passenger[1];
				}
		else{
				passenger =Arrays.copyOf(passenger, passenger.length+1);
				}
				passenger[ passenger.length-1]= p ;
				
    }
    @SuppressWarnings("deprecation")
	public void addPassenger(String name, String correo, String idType, String id, int age, String address, String nationality,String gender,int year,int month,int day) {
    		Date birthday = new Date(year,month,day);
		Passenger p = new Passenger(name,correo,idType,id,age,address, nationality,gender, birthday);
		if( passenger == null) {
			passenger = new Passenger[1];
		}
		else{
			passenger =Arrays.copyOf(passenger, passenger.length+1);
		}
		passenger[ passenger.length-1]= p ;
			
    }
   
    public void addAirplane(String plate, int capacity,int flightHours){
	    Airplane a = new Airplane(plate,capacity,flightHours);
	    	if( airplane == null) {
	    		airplane = new Airplane[1];
	    	}
	    	else{
	    		airplane =Arrays.copyOf(airplane, airplane.length+1);
	    	}
	    	airplane[ airplane.length-1]= a;
    }
    
    public void addFlight(Airplane airplane, String flightNumber, Employee[] crew, String[] boardingpassID, Date departureTime,double duration, Airport destination, Airport origin, Date arrivalTime) {
	    	Flight f = new Flight(airplane,flightNumber,crew,boardingpassID,departureTime,duration,destination,origin,arrivalTime);
	    	if( flight == null) {
	    		flight = new Flight[1];
	    	}
	    	else{
	    		flight =Arrays.copyOf(flight, flight.length+1);
	    	}
	    	flight[ flight.length-1]= f;
    }

    public void addEmployee(String name, String correo, String idType, String id, int age, String address, String nationality,String gender, Date birthday, double wage, String charge){
     	Employee e = new Employee(name, correo, idType, id, age, address, nationality, gender,birthday,wage,charge);
	    	if( employee == null) {
	    		employee = new Employee[1];
	    	}
	    	else{
	    		employee =Arrays.copyOf(employee, employee.length+1);
	    	}
	    	employee[ employee.length-1]= e;
    }
   
    public void addBoardingPass(Passenger passenger, Flight flight, double price, Date date, String id, String type) {
    		BoardingPass b = new BoardingPass(passenger,flight,price,date,id,type);
		    	if( boardingPass == null) {
		    		boardingPass = new BoardingPass[1];
		    	}
		    	else{
		    		boardingPass =Arrays.copyOf(boardingPass, boardingPass.length+1);
		    	}
		    	boardingPass[ boardingPass.length-1]= b;
 
    }
    
    public void addAirport(String name, String iata, int[] gates, String country, String city, boolean isAvailable){
		Airport a = new Airport(name,iata,gates,country,city,isAvailable);
		    	if( airport == null) {
		    		airport = new Airport[1];
		    	}
		    	else{
		    		airport =Arrays.copyOf(airport, airport.length+1);
		    	}
		    	airport[ airport.length-1]= a;

    }
    
    public void addLuggage(double volume, double weight, String id){
	    	Luggage l = new Luggage(volume,weight,id);
		    	if( luggage == null) {
		    		luggage = new Luggage[1];
		    	}
		    	else{
		    		luggage =Arrays.copyOf(luggage, luggage.length+1);
		    	}
		luggage[ luggage.length-1]= l;

    }
    
    //getters & setters
    public String getName() {
		return name;
	}
    
    
}