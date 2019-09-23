package edu.fitchburgstate.csc7400.hw1;
/**
 * @subject:OOAD
 * @author:orlando
 * @version:1.1
 * @01411928 chandralekha
 */


public class GuitarSpec
{
	private String model;
	
	private Manufacturer manufacturer; 
	private Type type;
	private Wood backwood;
	private Wood topwood;
	public GuitarSpec(Manufacturer manufacturer,String model, Type type,Wood backwood,Wood topwood)
	{
		this.manufacturer=manufacturer;
		this.type=type;
		this.backwood=backwood;
		this.topwood=topwood;
		this.model=model;
		
	}
	
	
	public Boolean Match(GuitarSpec spec)
	{
		if((manufacturer==spec.manufacturer)||(type==spec.type)||(backwood==spec.backwood)||(topwood==spec.topwood)||(model.toLowerCase().equals(spec.model.toLowerCase())))
		
		return true;
		else
		return false;
		
	}
	public Manufacturer getManufacturer()
	{
		return manufacturer;
		
	}
	public Type getType()
	{
		return type;
		
	}
	public Wood getbackwood()
	{
		return backwood;
		
	}
	public Wood getTopwood()
	{
		return topwood;
		
	}
	public String getModel()
	{
		return model;
		
	}

}
