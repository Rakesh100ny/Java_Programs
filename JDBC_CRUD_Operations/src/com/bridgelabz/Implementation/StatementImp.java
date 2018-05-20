package com.bridgelabz.Implementation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bridgelabz.Interface.statementInterface;
import com.bridgelabz.Utility.DatabaseUtill;
import com.bridgelabz.Utility.Utility;
import com.bridgelabz.databasesConnection.DBConnectionManager;
import com.bridgelabz.databasesConnection.StatementUtil;
import com.bridgelabz.POJO.Employee;

public class StatementImp implements statementInterface
{    
	Connection connection = null;
	ResultSet resultSet=null;
	int rowAffected=0;
	Statement insEmp,updEmp,delEmp,schEmp,disEmp;

	@Override
	public void insert(String dbVendor)
	{
	 try {
		connection=DBConnectionManager.getConnection(dbVendor);
		insEmp = connection.createStatement();
		System.out.println();
		System.out.println("\t\t\t\t\t       Employee-Information");
		System.out.println("\t\t\t\t\t----------------------------------");
		System.out.print("\t\t\t\t\tEnter Employee First Name : ");
		Employee employee = new Employee();
		employee.setEmpFirstName(Utility.getInstance().inputString());

		System.out.print("\t\t\t\t\tEnter Employee Last Name  : ");
		employee.setEmpLastName(Utility.getInstance().inputString());
		
		System.out.print("\t\t\t\t\tEnter Employee Address    : ");
		employee.setEmpAddress(Utility.getInstance().inputString());
		
		System.out.print("\t\t\t\t\tEnter Employee Salary     : ");
		employee.setEmpSalary(Utility.getInstance().inputDouble());
		
		System.out.print("\t\t\t\t\tEnter Employee Mobile No  : ");
		employee.setEmpMobile(Utility.getInstance().inputLong());
		
		
	    rowAffected=insEmp.executeUpdate(StatementUtil.getQuery("insert",employee));
	    
	    if(rowAffected>0)
	    {
	    	 System.out.println("\n\t\t\t\tInsert Operation is sucessfully done...!");	    }
	    else
	    {
	         System.out.println("\n\t\t\t\tInsert Operation is failed...!");	
	    }
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
      
         DatabaseUtill.close(insEmp);
         DatabaseUtill.close(connection);
     }
	}

	@Override
	public void update(String dbVendor)
	{
		
		try {
			connection=DBConnectionManager.getConnection(dbVendor);
			updEmp = connection.createStatement();

			 Employee employee=new Employee();	
			 System.out.print("\n\t\tEnter the id Which Employee You want to Update Information : ");
			 employee.setEmpId(Utility.getInstance().inputInteger());

			    System.out.println();
				System.out.print("\t\t\t\t     Update Employee");
				System.out.print("\n\t\t\t\t-----------------------");
				System.out.print("\n\t\t\t\t First  Name : Enter 1");
				System.out.print("\n\t\t\t\t Last   Name : Enter 2");
				System.out.print("\n\t\t\t\t Address     : Enter 3");
				System.out.print("\n\t\t\t\t Salary      : Enter 4");
				System.out.print("\n\t\t\t\t Mobile No   : Enter 5");
				System.out.print("\n\t\t\t\t-----------------------\n");

				System.out.print("\n\t\t\t\tEnter Choice : ");
				int choice = Utility.getInstance().inputInteger();

				switch (choice) {
				case 1: System.out.println("\n\t\t\t\tEnter New First Name : ");
				        employee.setEmpFirstName(Utility.getInstance().inputString());
						rowAffected = updEmp.executeUpdate(StatementUtil.getQuery("updatefName",employee));
					    if(rowAffected>0)
					    {
					    	 System.out.println("\n\t\t\t\tFirst Name is sucessfully Updated...!");	    }
					    else
					    {
					         System.out.println("\n\t\t\t\tUpdation is failed...!");	
					    }

					
					break;

				case 2:System.out.println("\n\t\t\t\tEnter New Last Name : ");
		        employee.setEmpLastName(Utility.getInstance().inputString());
				
				rowAffected = updEmp.executeUpdate(StatementUtil.getQuery("updatelName",employee));
			    if(rowAffected>0)
			    {
			    	 System.out.println("\n\t\t\t\tLast Name is sucessfully Updated...!");	    }
			    else
			    {
			         System.out.println("\n\t\t\t\tUpdation is failed...!");	
			    }
					
					break;

				case 3:System.out.println("\n\t\t\t\tEnter New Address   : ");
		        employee.setEmpAddress(Utility.getInstance().inputString());
		       rowAffected = updEmp.executeUpdate(StatementUtil.getQuery("updateAddress",employee));
			    if(rowAffected>0)
			    {
			    	 System.out.println("\n\t\t\t\tAddress is sucessfully Updated...!");	    }
			    else
			    {
			         System.out.println("\n\t\t\t\tUpdation is failed...!");	
			    }	
					break;

				case 4:System.out.println("\n\t\t\t\tEnter New Salary    : ");
		        employee.setEmpSalary(Utility.getInstance().inputDouble());
		       
				rowAffected = updEmp.executeUpdate(StatementUtil.getQuery("updateSalary",employee));
			    if(rowAffected>0)
			    {
			    	 System.out.println("\n\t\t\t\tSalary is sucessfully Updated...!");	    }
			    else
			    {
			         System.out.println("\n\t\t\t\tUpdation is failed...!");	
			    }
					
					break;

				case 5:System.out.println("\n\t\t\t\tEnter New Mobile No : ");
		        employee.setEmpMobile(Utility.getInstance().inputLong());
		       
				rowAffected = updEmp.executeUpdate(StatementUtil.getQuery("updateMobileNo",employee));
			    if(rowAffected>0)
			    {
			    	 System.out.println("\n\t\t\t\tMobile No is sucessfully Updated...!");	    }
			    else
			    {
			         System.out.println("\n\t\t\t\tUpdation is failed...!");	
			    }
					
					break;
	 
				default:
					System.out.println("\n\t\t\t\tInvalid Choice...!");
				}
				System.out.println();
				

			

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		      
	         DatabaseUtill.close(updEmp);
	         DatabaseUtill.close(connection);
	     }
		
	}


	@Override
	public void delete(String dbVendor) 
	{
	 try {
		connection=DBConnectionManager.getConnection(dbVendor);
        delEmp=connection.createStatement();
        System.out.print("\n\t\t\tEnter the id Which You want to delete Details : ");
        Employee employee=new Employee();
        employee.setEmpId(Utility.getInstance().inputInteger());
        
        rowAffected=delEmp.executeUpdate(StatementUtil.getQuery("delete",employee));
        if(rowAffected>0)
	    {
	    	 System.out.println("\n\t\t\t\t Employee Id "+employee.getEmpId()+" is sucessfully Deleted...!");	    }
	    else
	    {
	         System.out.println("\n\t\t\t\tUpdation is failed...!");	
	    }
	} catch (Exception e) {
		e.printStackTrace();
	}
	 finally {
	      
         DatabaseUtill.close(delEmp);
         DatabaseUtill.close(connection);
     } 
	 
	}

	@Override
	public void serach(String dbVendor) 
	{
     try {
    	 Employee employee=new Employee();
		connection=DBConnectionManager.getConnection(dbVendor);
	    schEmp=connection.createStatement();
		    System.out.println();
			System.out.print("\t\t\t\t     Search Employee");
			System.out.print("\n\t\t\t\t-----------------------");
			System.out.print("\n\t\t\t\t Employee ID : Enter 1");
			System.out.print("\n\t\t\t\t First  Name : Enter 2");
			System.out.print("\n\t\t\t\t Last   Name : Enter 3");
			System.out.print("\n\t\t\t\t Salary      : Enter 4");
			System.out.print("\n\t\t\t\t Mobile No   : Enter 5");
			System.out.print("\n\t\t\t\t-----------------------\n");

			System.out.print("\n\t\t\t\tEnter Choice : ");
			int choice = Utility.getInstance().inputInteger();

       
			switch (choice) {
			case 1: System.out.print("\n\t\t\t\tEnter the id : ");
			        employee.setEmpId(Utility.getInstance().inputInteger());
			        
			        resultSet=schEmp.executeQuery(StatementUtil.getQuery("searchId",employee));
			        while(resultSet.next())
			        {
			         employee.setEmpId(resultSet.getInt("emp_id")); 	
			         employee.setEmpFirstName(resultSet.getString("emp_fName"));
			         employee.setEmpLastName(resultSet.getString("emp_lName"));
			         employee.setEmpAddress(resultSet.getString("emp_Address"));
			         employee.setEmpSalary(resultSet.getDouble("emp_salary"));
			         employee.setEmpMobile(resultSet.getLong("emp_mNo"));
			         
			         System.out.println();
//			         System.out.println("\t\t\t\tID         : " + employee.getEmpId());
			         System.out.println("\t\t\t\tFirst Name : " + employee.getEmpFirstName());
			         System.out.println("\t\t\t\tLast Name  : " + employee.getEmpLastName());
			         System.out.println("\t\t\t\tAddress    : " + employee.getEmpAddress());
			         System.out.println("\t\t\t\tSalary     : " + employee.getEmpSalary());
			         System.out.println("\t\t\t\tMobile     : " + employee.getEmpMobile());
			        }
				
				break;
			case 2:System.out.print("\n\t\t\t\tEnter the First Name : ");
	        employee.setEmpFirstName(Utility.getInstance().inputString());
	        resultSet=schEmp.executeQuery(StatementUtil.getQuery("searchfName",employee));
	        while(resultSet.next())
	        {
	         employee.setEmpId(resultSet.getInt("emp_id")); 	
	         employee.setEmpFirstName(resultSet.getString("emp_fName"));
	         employee.setEmpLastName(resultSet.getString("emp_lName"));
	         employee.setEmpAddress(resultSet.getString("emp_Address"));
	         employee.setEmpSalary(resultSet.getDouble("emp_salary"));
	         employee.setEmpMobile(resultSet.getLong("emp_mNo"));
	         
	         System.out.println();
	         System.out.println("\t\t\t\tID         : " + employee.getEmpId());
	         System.out.println("\t\t\t\tFirst Name : " + employee.getEmpFirstName());
	         System.out.println("\t\t\t\tLast Name  : " + employee.getEmpLastName());
	         System.out.println("\t\t\t\tAddress    : " + employee.getEmpAddress());
	         System.out.println("\t\t\t\tSalary     : " + employee.getEmpSalary());
	         System.out.println("\t\t\t\tMobile     : " + employee.getEmpMobile());
	        }
				
				break;
			case 3:System.out.print("\n\t\t\t\tEnter the Last Name : ");
	        employee.setEmpLastName(Utility.getInstance().inputString());
	        
	        resultSet=schEmp.executeQuery(StatementUtil.getQuery("searchlName",employee));
	        while(resultSet.next())
	        {
	         employee.setEmpId(resultSet.getInt("emp_id")); 	
	         employee.setEmpFirstName(resultSet.getString("emp_fName"));
	         employee.setEmpLastName(resultSet.getString("emp_lName"));
	         employee.setEmpAddress(resultSet.getString("emp_Address"));
	         employee.setEmpSalary(resultSet.getDouble("emp_salary"));
	         employee.setEmpMobile(resultSet.getLong("emp_mNo"));
	         
	         System.out.println();
	         System.out.println("\t\t\t\tID         : " + employee.getEmpId());
	         System.out.println("\t\t\t\tFirst Name : " + employee.getEmpFirstName());
	         System.out.println("\t\t\t\tLast Name  : " + employee.getEmpLastName());
	         System.out.println("\t\t\t\tAddress    : " + employee.getEmpAddress());
	         System.out.println("\t\t\t\tSalary     : " + employee.getEmpSalary());
	         System.out.println("\t\t\t\tMobile     : " + employee.getEmpMobile());
	        }
		
				break;
			case 4:System.out.print("\n\t\t\t\tEnter the Salary : ");
	        employee.setEmpSalary(Utility.getInstance().inputDouble());
	        resultSet=schEmp.executeQuery(StatementUtil.getQuery("searchSalary",employee));
	        while(resultSet.next())
	        {
	         employee.setEmpId(resultSet.getInt("emp_id")); 	
	         employee.setEmpFirstName(resultSet.getString("emp_fName"));
	         employee.setEmpLastName(resultSet.getString("emp_lName"));
	         employee.setEmpAddress(resultSet.getString("emp_Address"));
	         employee.setEmpSalary(resultSet.getDouble("emp_salary"));
	         employee.setEmpMobile(resultSet.getLong("emp_mNo"));
	         
	         System.out.println();
	         System.out.println("\t\t\t\tID         : " + employee.getEmpId());
	         System.out.println("\t\t\t\tFirst Name : " + employee.getEmpFirstName());
	         System.out.println("\t\t\t\tLast Name  : " + employee.getEmpLastName());
	         System.out.println("\t\t\t\tAddress    : " + employee.getEmpAddress());
	         System.out.println("\t\t\t\tSalary     : " + employee.getEmpSalary());
	         System.out.println("\t\t\t\tMobile     : " + employee.getEmpMobile());
	        }
		
				break;
			case 5:System.out.print("\n\t\t\t\tEnter the Mobile NO : ");
	        employee.setEmpMobile(Utility.getInstance().inputLong());
	        resultSet=schEmp.executeQuery(StatementUtil.getQuery("searchMobileNo",employee));
	        while(resultSet.next())
	        {
	         employee.setEmpId(resultSet.getInt("emp_id")); 	
	         employee.setEmpFirstName(resultSet.getString("emp_fName"));
	         employee.setEmpLastName(resultSet.getString("emp_lName"));
	         employee.setEmpAddress(resultSet.getString("emp_Address"));
	         employee.setEmpSalary(resultSet.getDouble("emp_salary"));
	         employee.setEmpMobile(resultSet.getLong("emp_mNo"));
	         
	         System.out.println();
	         System.out.println("\t\t\t\tID         : " + employee.getEmpId());
	         System.out.println("\t\t\t\tFirst Name : " + employee.getEmpFirstName());
	         System.out.println("\t\t\t\tLast Name  : " + employee.getEmpLastName());
	         System.out.println("\t\t\t\tAddress    : " + employee.getEmpAddress());
	         System.out.println("\t\t\t\tSalary     : " + employee.getEmpSalary());
	         System.out.println("\t\t\t\tMobile     : " + employee.getEmpMobile());
	        }
		
				break;
			default:System.out.println("\n\t\t\t\tInvalid Choice...!");
				
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
     finally {
         
         DatabaseUtill.close(schEmp);
         DatabaseUtill.close(resultSet);
         DatabaseUtill.close(connection);
     }
     
	}

	@Override
	public void display(String dbVendor) {
	 try {
		 Employee employee=new Employee();
		connection=DBConnectionManager.getConnection(dbVendor);
		disEmp=connection.createStatement();
        resultSet=disEmp.executeQuery(StatementUtil.getQuery("display",employee));
        while(resultSet.next())
        {
	         employee.setEmpId(resultSet.getInt("emp_id")); 	
	         employee.setEmpFirstName(resultSet.getString("emp_fName"));
	         employee.setEmpLastName(resultSet.getString("emp_lName"));
	         employee.setEmpAddress(resultSet.getString("emp_Address"));
	         employee.setEmpSalary(resultSet.getDouble("emp_salary"));
	         employee.setEmpMobile(resultSet.getLong("emp_mNo"));
	         
	         System.out.println();
	         System.out.println("\t\t\t\tID         : " + employee.getEmpId());
	         System.out.println("\t\t\t\tFirst Name : " + employee.getEmpFirstName());
	         System.out.println("\t\t\t\tLast Name  : " + employee.getEmpLastName());
	         System.out.println("\t\t\t\tAddress    : " + employee.getEmpAddress());
	         System.out.println("\t\t\t\tSalary     : " + employee.getEmpSalary());
	         System.out.println("\t\t\t\tMobile     : " + employee.getEmpMobile());
	           	
        }
        	
	} catch (Exception e) {
		e.printStackTrace();
	}
	 finally {
         
         DatabaseUtill.close(disEmp);
         DatabaseUtill.close(resultSet);
         DatabaseUtill.close(connection);
     } 
	}

	@Override
	public void exit() {
		System.exit(0);
	}
 
}
