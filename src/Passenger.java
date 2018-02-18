
import java.util.*;

public class Passenger extends Person {

    private BoardingPass[] boardingPass;
    
    //constructors 
	public Passenger(String name, String correo, String idType, String id, int age, String address, String nationality,
			String gender, Date birthday) {
		super(name, correo, idType,id, age, address, nationality, gender, birthday);
		// TODO Auto-generated constructor stub
		
	}

	public Passenger(String name, String correo, String idType, String id, int age, String address, String nationality,
			String gender, int year, int month, int day) {
		super(name, correo, idType, id,  age, address, nationality, gender, year, month, day);
		// TODO Auto-generated constructor stub
	}

	
    
    

}