/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In AdapterDesignPattern Class 
 *            and Using ClassAdapter.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/


package com.bridgelab.designpattern.structuralpatterns.adapterpattern;


public class AdapterDesignPatternUsingClassAdapter extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v= getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}