
import java.util.*;
import java.io.*;


public class BoardingPass implements Serializable{


    private Passenger passenger;
    private Flight flight;
    private double price;
    private Date date;
    private String id;
    private String type;

    //constructors
    public BoardingPass(Passenger passenger, Flight flight, double price, Date date, String id, String type) {
		super();
		this.passenger = passenger;
		this.flight = flight;
		this.price = price;
		this.date = date;
		this.id = id;
		this.type = type;
	}
    



}