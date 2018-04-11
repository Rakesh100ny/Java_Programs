package com.bridgelabz.oop.cliniqueUsingOOP;

public class Patient 
{
	private String patientName;
	 private String patientId;
	 private String patientMobileNo;
	 private String patientAge;	

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
	public String getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the patientMobileNo
	 */
	public String getPatientMobileNo() {
		return patientMobileNo;
	}
	/**
	 * @param patientMobileNo the patientMobileNo to set
	 */
	public void setPatientMobileNo(String patientMobileNo) {
		this.patientMobileNo = patientMobileNo;
	}
	/**
	 * @return the patientAge
	 */
	public String getPatientAge() {
		return patientAge;
	}
	/**
	 * @param patientAge the patientAge to set
	 */
	public void setPatientAge(String patientAge) {
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
