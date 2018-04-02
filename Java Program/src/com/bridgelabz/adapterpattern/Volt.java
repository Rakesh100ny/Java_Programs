/***************************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In AdapterDesignPattern It is 
 *            Volt Class in this set Volt and also return the volt using setter and geter     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***************************************************************************************/

package com.bridgelabz.adapterpattern;

public class Volt {

	private int volts;
	
	public Volt(int v){
		this.volts=v;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
	
}
