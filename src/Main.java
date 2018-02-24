import java.util.*;
import java.io.*; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airline a  = new Airline("foobar");
		a.addAirport("Olaya Herrera", "MDE",new int[] {1,2,3}, "COLOMBIA","MEDELLIN", true);
		a.addAirport("El Dorado", "BOG",new int[] {1,2,3}, "COLOMBIA","BOGOTA", true);
		a.addAirplane("AV8880", 45, 10);
		a.addAirplane("AV8881", 20, 20);	
		Date f= new Date(2018, 02, 18);
		a.createFlight("680",f, 12,"MDE","BOG");
		
		try {
			a.writeFile("t.tmp");
		} catch (IOException e) {
			System.out.println("No se puede guardad la info.");
		}
	   
		Airline b= new Airline();
		try {
			b.readFile("t.tmp");
			System.out.println(b.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
