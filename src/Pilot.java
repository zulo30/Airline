
import java.util.*;
import java.io.*;
/**
 * 
 */
public class Pilot extends Employee implements Serializable {

    private double flightingHours;
    private String rank;
	
   
    //constructor 
    public Pilot(String name, String correo, String idType, String id, int age, String address, String nationality, String gender,
			Date birthday, double wage, String charge ) {
		super(name, correo, idType, id, age, address, nationality, gender, birthday, wage, charge);
		// TODO Auto-generated constructor stub
	}

}