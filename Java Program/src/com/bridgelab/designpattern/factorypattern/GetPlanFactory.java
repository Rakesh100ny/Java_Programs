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
