import java.io.*;
import java.util.*;
import java.util.stream.Stream;


public class MainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airline a  = new Airline("foobar");
		a.addAirport("Jose Maria Cordova", "MDE",new int[] {1,2,3}, "COLOMBIA","MEDELLIN", true);
		a.addAirport("Olaya Herrera", "EOH",new int[] {1,2}, "COLOMBIA","MEDELLIN", true);
		a.addAirport("El Dorado", "BOG",new int[] {1,2,3}, "COLOMBIA","BOGOTA", true);
		a.addAirport("La Aurora", "GUA",new int[] {1}, "GAUATEMALA","GUATAMALA CITY", true);
		a.addAirport("Fort Lauderdale", "FLL",new int[] {1,2,3}, "EEUU","FLORIDA", true);
		a.addAirport("Charles de Gaulle", "CDG",new int[] {1,2,3}, "FRANCIA","PARIS", true);
		a.addAirport("John F. Kennedy", "JFK",new int[] {1,2,3}, "EEUU","NEW YORK", true);
		a.addAirport("NARITA", "NRT",new int[] {1,2,3}, "JAPON","TOKYO", true);
		a.addAirport("Oliver Reginald Tambo", "JNB",new int[] {1,2,3}, "SUDAFRICA","JOHANNESBURGO", true);
		a.addAirport("L.A. International Airport", "LAX",new int[] {1,2,3}, "EEUU","LOS ANGELES", true);
		
		Date f= new Date(2018, 02, 18);

		Airport[ ] apt = a.getAirport();
		
		  File file = new File ("file.txt");
		  PrintWriter printWriter;
		try {
			printWriter = new PrintWriter (file.getAbsolutePath());
			addEverything(printWriter,apt);
			printWriter.close();
		 
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsolutePath()));
			FileWriter fstream = new FileWriter("file.out");
			BufferedWriter out = new BufferedWriter(fstream);

			Object[] objs=  in.lines().toArray();
			String[] strs =objectArrayToStringArray(objs);

			out.write(""+a);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		    
		

	}
	public static void addEverything(  PrintWriter pw ,Airport[] apt) {
		for (Airport a : apt) {
			pw.println(a.getName());
			pw.println(a.getIata());
			pw.println(a.getGates().length);
			pw.println(a.getCountry());
			pw.println(a.getCity());
			pw.println(a.isAvailable());
			pw.println();
		}
		
	}
	private static String[] objectArrayToStringArray(Object[] o) {
		String[] strs = new String[o.length];
		for (int i = 0; i < o.length; i++) {
			if(i%7!=0) {
				strs[i]=o[i]+"";
			}
		}
		return strs;
	}

}
