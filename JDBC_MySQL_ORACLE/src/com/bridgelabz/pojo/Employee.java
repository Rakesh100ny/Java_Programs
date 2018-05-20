package com.bridgelabz.pojo;

public class Employee
{
 private int empId;	
 private String empFirstName,empLastName,empAddress;
 private long empMobile;
 private double empSalary;
/**
 * @return the empId
 */
public int getEmpId() {
	return empId;
}
/**
 * @param empId the empId to set
 */
public void setEmpId(int empId) {
	this.empId = empId;
}
/**
 * @return the empFirstName
 */
public String getEmpFirstName() {
	return empFirstName;
}
/**
 * @param empFirstName the empFirstName to set
 */
public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}
/**
 * @return the empLastName
 */
public String getEmpLastName() {
	return empLastName;
}
/**
 * @param empLastName the empLastName to set
 */
public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}
/**
 * @return the empAddress
 */
public String getEmpAddress() {
	return empAddress;
}
/**
 * @param empAddress the empAddress to set
 */
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
/**
 * @return the empMobile
 */
public long getEmpMobile() {
	return empMobile;
}
/**
 * @param empMobile the empMobile to set
 */
public void setEmpMobile(long empMobile) {
	this.empMobile = empMobile;
}
/**
 * @return the empSalary
 */
public double getEmpSalary() {
	return empSalary;
}
/**
 * @param empSalary the empSalary to set
 */
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
			+ ", empAddress=" + empAddress + ", empMobile=" + empMobile + ", empSalary=" + empSalary + "]";
}
 
 
}
