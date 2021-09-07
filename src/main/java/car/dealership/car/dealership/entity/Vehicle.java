package car.dealership.car.dealership.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity means it's a JPA entity
@Entity
@Table(name = "Vehicle")
public class Vehicle {
	
//	//@ID is assigning the primary key
//	@Id
//	//The generated value will auto increment
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "manufacturer")
	private String make;
	
	@Column(name= "build")
	private String build;
	
	@Column(name = "year")
	private String year;
	
	@Column(name="color")
	private String color;
	
	@Column(name="price")
	private double price;
	
	@Column(name="description")
	private String description;
	
	@Column(name="mileage")
	private int mileage;
	
	@Column(name="buyerId")
	private int buyerId;
	
	//0=false || 1=True
	@Column(name="Used")
	private String used;
	
	//0=false || 1=True
	@Column(name="Sold")
	private String sold;
	
	//YYYY-MM-DD
	@Column(name="invDate")
	private String invDate;
	
	@Id
	@Column(name = "vin")
	private String vin;
	
	//	Above is tester
//  private String color;
//  private String buildType;
//  private int price;
//  //Date; to be implemented later, calculate time on lot
//  private boolean is121=false;
//  private boolean isSold=false;
//  private boolean isNew= true;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public String getSold() {
		return sold;
	}

	public void setSold(String sold) {
		this.sold = sold;
	}

	public String getInvDate() {
		return invDate;
	}

	public void setInvDate(String invDate) {
		this.invDate = invDate;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}
