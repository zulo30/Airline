
import java.util.*;
import java.io.*;
/**
 * 
 */
public class Person implements Serializable {

   

    protected String name;
    protected String correo;
    protected String idType;
    protected String id;
    protected int age;
    protected String address;
    protected String nationality;
    protected String gender;
    protected Date birthday;
    
    //getters & setters
    protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}

	protected String getCorreo() {
		return correo;
	}
	protected void setCorreo(String correo) {
		this.correo = correo;
	}
	
	protected String getIdType() {
		return idType;
	}
	protected void setIdType(String idType) {
		this.idType = idType;
	}
	
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	
	protected String getNationality() {
		return nationality;
	}
	protected void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	protected String getGender() {
		return gender;
	}
	protected void setGender(String gender) {
		this.gender = gender;
	}
	
	protected Date getBirthday() {
		return birthday;
	}
	protected void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	//constructors
	public Person(String name, String correo, String idType, String id,int age, String address, String nationality,
			String gender, Date birthday) {
		super();
		this.name = name;
		this.correo = correo;
		this.idType = idType;
		this.id =id;
		this.age = age;
		this.address = address;
		this.nationality = nationality;
		this.gender = gender;
		this.birthday = birthday;
	}
    
	@SuppressWarnings("deprecation")
	public Person(String name, String correo, String idType,  String id, int age, String address, String nationality,String gender, int year, int month, int day) {
		super();
		this.name = name;
		this.correo = correo;
		this.idType = idType;
		this.id = id;
		this.age = age;
		this.address = address;
		this.nationality = nationality;
		this.gender = gender;
		this.birthday = new Date(year,month,day);
	}
   
  
}