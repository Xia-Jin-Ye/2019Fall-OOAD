
/*
* class: Object-Oriented Design and Analysis
* Professor : Orlando Montavo
* Assignment : HW1
* Student : Chandralekha(@01411928)
* @since 2019-09-15
* 
*/
package edu.fitchburgstate.csc7400.hw1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
*The Inventory class  to track all guitars
* and search to help him match customers 
* with guitars from his music store.
*/

public class Inventory {
  private List<Guitar> guitars;
/**
*The inventory stores a list of all the guitars 
* that Rick currently has available.
*/

  public Inventory() {
  //creating object of class linked list
    guitars = new LinkedList<Guitar>();
  }
/**
* the method addGuitar takes serialNumber, price, builder,model,type,backWood, topWood to add a guitar
* and  to create a new guitar instance
* and adds to Rick inventory.
*
*/
  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
/**
* getGuitar takes a guitar's serialNumber
* @return that guitar object
*
*/
  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  };
  
/**
*Search by Guitar using Guitar object with parameter(builder,model,type,backWood and topWood) 
  * the values must be first passed into guitar class and get the guitar object first
  * @param searchSpec
* @returns guitar from Rick's collection Inventory or ull 
*/ 
  public Guitar search(Guitar searchSpec) {
  List matchingGuitars = new LinkedList();
	//hasNext returns true if it has more guitars elements to iterate
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	 // It returns the next element of the list 
	 // @exception- if there is no next element in the list ,It throws ‘NoSuchElementException’ .
      Guitar guitar = (Guitar)i.next();
	  guitarSpec guitarSpec = guitar.getSpec();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
	  /**
	 * Returns the name of the manufacturer
	  and stores in the string builder
	 */
	  
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder())))////It compares  manufacturer name with no case sensitivity
        continue;
		
		
      String model = searchGuitar.getModel().toLowerCase();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel().toLowerCase())))//It compares model without case sensitivity
        continue;
		
		
		
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))//It compares the type without the case sensitivity
        continue;
		
		
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))//It compares the backwood ignoring  case
        continue;
		
		
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))//it compares the the topwood ignoring the case
        continue;
		matchingGuitars.add(guitar);
		
      return matchingGuitars;
    }
    return null;
  }
}
