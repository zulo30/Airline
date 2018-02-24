
import java.util.*;
import java.io.*;
/**
 * 
 */
public class Employee extends Person implements Serializable{

   
	protected double wage;
    protected String charge;
    
    
    //constructor 
    public Employee(String name, String correo, String idType, String id, int age, String address, String nationality,
			String gender, Date birthday, double wage, String charge) {
		super(name, correo, idType,id,  age, address, nationality, gender, birthday);
		// TODO Auto-generated constructor stub
		this.wage = wage;
		this.charge = charge;
	}
   
}