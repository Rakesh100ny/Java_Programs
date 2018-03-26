/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and it is Get Plan Factory.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.factorypattern;

public class GetPlanFactory {
	public Plan getPlan(String planType) {
		switch (planType) {
		case "DOMESTICPLAN":
			if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
				return new DomesticPlan();
			}
			break;

		case "COMMERCIALPLAN":
			if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
				return new CommercialPlan();
			}
			break;

		case "INSTITUTIONALPLAN":
			if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
				return new InstitutionalPlan();
			}
			break;
		default:
			return null;

		}
		return null;
	}
}
