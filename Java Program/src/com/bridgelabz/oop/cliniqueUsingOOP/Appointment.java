package com.bridgelabz.oop.cliniqueUsingOOP;

public class Appointment 
{
	private String doctorName;
	 private String patientName;
	 private String date;
	 private String doctorAvailability;
	 private int doctorId;
	 private int patientId;
	
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
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}
	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
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
	/**
	 * @return the doctorId
	 */
	public int getDoctorId() {
		return doctorId;
	}
	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	 /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Appointment [doctorName=" + doctorName + ", patientName=" + patientName + ", date=" + date
				+ ", doctorAvailability=" + doctorAvailability + ", doctorId=" + doctorId + ", patientId=" + patientId
				+ "]";
	}

}
