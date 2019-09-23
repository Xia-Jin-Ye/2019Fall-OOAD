/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: hw1
 * 
 * Date: 2019-09-23
 */

package edu.fitchburgstate.csc7400.hw1;

/**
 * @subject:OOAD
 * @author:Orlando Montavo
 * @version:1.1
 * @01411928 Chandralekha
 */

public class Guitar {
	private GuitarSpec spec;
	/**
	 * Full constructor
	 * 
	 * @param serialNumber manufacturer serial number
	 * @param price store price
	 * @param Guitarspec 
	 */
	public Guitar(String serialNumber, double price, 
			GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec=spec;
		/*this.manufacturer= manufacturer;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;*/
	}

	/**
	 * Returns the manufacturer serial number
	 * 
	 * NB: Gets and sets do not need @params or @returns because they do one thing which
	 * is already in the comment
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Returns store price of guitar
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the store price of the guitar
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	/**
	 * Returns the name of the manufacturer
	 */
	public String getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * Returns the manufacturer model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the guitar type
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * Returns the type of wood used in the body
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * Returns the type of wood used in the face
	 * @return
	 */
	public String getTopWood() {
		return topWood;
	}

	/**
	 * The guitars manufacturer serial number
	 */
	private String serialNumber;

	/**
	 * The name of the manufacturer
	 */
	private String manufacturer;

	/**
	 * The manufacturer model number
	 */
	private String model;

	/**
	 * The guitar type (electric/acoustic)
	 */
	private String type;

	/**
	 * The wood used for the back of the guitar
	 */
	private String backWood;

	/**
	 * The wood used for the face of the guitar
	 */
	private String topWood;

	/**
	 * Rick's price for the guitar
	 */
	private double price;
	public GuitarSpec getGuitarSpec()//return the guitarspec
	{
		return spec;
		
	}
	
}
