package com.bridgelabz.oop.cliniqueUsingOOP;

public class Patient 
{
	private String patientName;
	 private int patientId;
	 private long patientMobileNo;
	 private int patientAge;	

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
	/**
	 * @return the patientMobileNo
	 */
	public long getPatientMobileNo() {
		return patientMobileNo;
	}
	/**
	 * @param patientMobileNo the patientMobileNo to set
	 */
	public void setPatientMobileNo(long patientMobileNo) {
		this.patientMobileNo = patientMobileNo;
	}
	/**
	 * @return the patientAge
	 */
	public int getPatientAge() {
		return patientAge;
	}
	/**
	 * @param patientAge the patientAge to set
	 */
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	
	 /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + ", patientMobileNo="
				+ patientMobileNo + ", patientAge=" + patientAge + "]";
	}

}
