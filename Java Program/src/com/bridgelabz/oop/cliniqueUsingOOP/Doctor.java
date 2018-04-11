package com.bridgelabz.oop.cliniqueUsingOOP;

public class Doctor 
{
	private String doctorName;
	 private String doctorId;
	 private String doctorSpecialization;
	 private String doctorAvailability;	
 /**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the doctorId
	 */
	public String getDoctorId() {
		return doctorId;
	}
	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * @return the doctorSpecialization
	 */
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	/**
	 * @param doctorSpecialization the doctorSpecialization to set
	 */
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	/**
	 * @return the doctorAvailability
	 */
	public String getDoctorAvailability() {
		return doctorAvailability;
	}
	/**
	 * @param doctorAvailability the doctorAvailability to set
	 */
	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}
 
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", doctorSpecialization="
				+ doctorSpecialization + ", doctorAvailability=" + doctorAvailability + "]";
	}

  
}
