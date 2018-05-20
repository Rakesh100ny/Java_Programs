package com.bridgelabz.Implementation;


import java.sql.ResultSet;
import java.sql.SQLException;
import com.bridgelabz.Interface.preparedStatementInterface;
import com.bridgelabz.POJO.Student;
import com.bridgelabz.Utility.DatabaseUtill;
import com.bridgelabz.Utility.Utility;
import com.bridgelabz.databasesConnection.PreparedStatementUtil;





public class PreparedStatementImp extends PreparedStatementUtil implements preparedStatementInterface {

	int rowAffected=0;
	ResultSet resultSet=null;
	@Override
	public void insert() {
		System.out.println();
		System.out.println("\t\t\t\t\t       Student-Information");
		System.out.println("\t\t\t\t\t----------------------------------");
		System.out.print("\t\t\t\t\tEnter Student First Name : ");
		Student student = new Student();
		student.setStudFirstName(Utility.getInstance().inputString());

		System.out.print("\t\t\t\t\tEnter Student Last Name  : ");
		student.setStudLastName(Utility.getInstance().inputString());
		
		System.out.print("\t\t\t\t\tEnter Student Address    : ");
		student.setStudAddress(Utility.getInstance().inputString());
		
		System.out.print("\t\t\t\t\tEnter Student Depart     : ");
		student.setStudDepartment(Utility.getInstance().inputString());
		
		System.out.print("\t\t\t\t\tEnter Student Mobile No  : ");
		student.setStudMobileNo(Utility.getInstance().inputLong());
	    
		super.init();	    
     		
	    try {
			    insStud.setInt(1,studId);
			    insStud.setString(2,student.getStudFirstName());
			    insStud.setString(3,student.getStudLastName());
			    insStud.setString(4,student.getStudAddress());
			    insStud.setString(5,student.getStudDepartment());
			    insStud.setLong(6,student.getStudMobileNo());

			    rowAffected=insStud.executeUpdate();
			    
			    if(rowAffected>0)
			    {
			    	 System.out.println("\n\t\t\t\tInsert Operation is sucessfully done...!");	    }
			    else
			    {
			         System.out.println("\n\t\t\t\tInsert Operation is failed...!");	
			    }
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
		      
	         DatabaseUtill.close(insStud);
	     }
		
		
	}

	@Override
	public void update() 
	{		
		super.init();			

		try
		{
		 Student student=new Student();
		 System.out.print("\n\t\tEnter the id Which Student You want to Update Information : ");
		 student.setStudId(Utility.getInstance().inputInteger());

		    System.out.println();
			System.out.print("\t\t\t\t     Update Employee");
			System.out.print("\n\t\t\t\t-----------------------");
			System.out.print("\n\t\t\t\t First  Name : Enter 1");
			System.out.print("\n\t\t\t\t Last   Name : Enter 2");
			System.out.print("\n\t\t\t\t Address     : Enter 3");
			System.out.print("\n\t\t\t\t Depart      : Enter 4");
			System.out.print("\n\t\t\t\t Mobile No   : Enter 5");
			System.out.print("\n\t\t\t\t-----------------------\n");

			System.out.print("\n\t\t\t\tEnter Choice : ");
			int choice = Utility.getInstance().inputInteger();

			switch (choice) {
			case 1: 
				    System.out.print("\t\t\t\tEnter New First Name : ");
			        student.setStudFirstName(Utility.getInstance().inputString());
			        updfNameStud.setString(1,student.getStudFirstName());
					updfNameStud.setInt(2,student.getStudId());
					rowAffected = updfNameStud.executeUpdate();
				    if(rowAffected>0)
				    {
				    	 System.out.println("\n\t\t\t\tFirst Name is sucessfully Updated...!");	    }
				    else
				    {
				         System.out.println("\n\t\t\t\tUpdation is failed...!");	
				    }

				
				break;

			case 2:System.out.print("\t\t\t\tEnter New Last Name : ");
	        student.setStudLastName(Utility.getInstance().inputString());
	        updlNameStud.setString(1,student.getStudLastName());
			updlNameStud.setInt(2,student.getStudId());
			rowAffected = updlNameStud.executeUpdate();
		    if(rowAffected>0)
		    {
		    	 System.out.println("\n\t\t\t\tLast Name is sucessfully Updated...!");	    }
		    else
		    {
		         System.out.println("\n\t\t\t\tUpdation is failed...!");	
		    }
				
				break;

			case 3:System.out.println("\n\t\t\t\tEnter New Address   : ");
	        student.setStudAddress(Utility.getInstance().inputString());
	        updAddressStud.setString(1,student.getStudAddress());
			updAddressStud.setInt(2,student.getStudId());
			
	       rowAffected = updAddressStud.executeUpdate();
		    if(rowAffected>0)
		    {
		    	 System.out.print("\t\t\t\tAddress is sucessfully Updated...!");	    }
		    else
		    {
		         System.out.print("\t\t\t\tUpdation is failed...!");	
		    }	
				break;

			case 4:System.out.print("\t\t\t\tEnter New Depart    : ");
	        student.setStudDepartment(Utility.getInstance().inputString());
	        updDptStud.setString(1,student.getStudDepartment());
			updDptStud.setInt(2,student.getStudId());
			
			rowAffected = updDptStud.executeUpdate();
		    if(rowAffected>0)
		    {
		    	 System.out.println("\n\t\t\t\tDepartment is sucessfully Updated...!");	    }
		    else
		    {
		         System.out.println("\n\t\t\t\tUpdation is failed...!");	
		    }
				
				break;

			case 5:System.out.print("\t\t\t\tEnter New Mobile No : ");
	        student.setStudMobileNo(Utility.getInstance().inputLong());
	        updMobileNoStud.setLong(1,student.getStudMobileNo());
	    	updMobileNoStud.setInt(2,student.getStudId());
	    		   
			rowAffected = updMobileNoStud.executeUpdate();
		    if(rowAffected>0)
		    {
		    	 System.out.println("\n\t\t\t\tMobile No is sucessfully Updated...!");	    }
		    else
		    {
		         System.out.println("\n\t\t\t\tUpdation is failed...!");	
		    }
				
				break;

			default:
				System.out.print("\t\t\t\tInvalid Choice...!");
			}
			System.out.println();
				

	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
	      
        DatabaseUtill.close(updAddressStud);
        DatabaseUtill.close(updDptStud);
        DatabaseUtill.close(updfNameStud);
        DatabaseUtill.close(updlNameStud);
        DatabaseUtill.close(updMobileNoStud);
    }
	
	}

	@Override
	public void delete() {
		init();
		try
		{
         System.out.print("\n\t\t\tEnter the id Which You want to delete Details : ");
         Student student=new Student();
         student.setStudId(Utility.getInstance().inputInteger());
         
         delStud.setInt(1, student.getStudId());
        rowAffected=delStud.executeUpdate();
        if(rowAffected>0)
	    {
	    	 System.out.println("\n\t\t\t\t Employee Id "+student.getStudId()+" is sucessfully Deleted...!");	    }
	    else
	    {
	         System.out.println("\n\t\t\t\tUpdation is failed...!");	
	    }
	} catch (Exception e) {
		e.printStackTrace();
	}
	 finally {
	      
         DatabaseUtill.close(delStud);
         
     } 
	}

	@Override
	public void serach() {
    init();
		try {
	    	 Student student=new Student();
			
		    
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
				        student.setStudId(Utility.getInstance().inputInteger());
				        schIdStud.setInt(1, student.getStudId());  
				        resultSet=schIdStud.executeQuery();
				        while(resultSet.next())
				        {
//				         student.setStudId(resultSet.getInt("stud_id")); 	
//				         student.setStudFirstName(resultSet.getString("stud_fName"));
//				         student.setStudLastName(resultSet.getString("stud_lName"));
//				         student.setStudAddress(resultSet.getString("stud_Address"));
//				         student.setStudDepartment(resultSet.getString("stud_dept"));
//				         student.setStudMobileNo(resultSet.getLong("stud_mNo"));
				         
				         System.out.println();
				         System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
				         System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
				         System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
				         System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
				         System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
				         System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
				        }
					
					break;
				case 2:System.out.print("\n\t\t\t\tEnter the First Name : ");
		        student.setStudFirstName(Utility.getInstance().inputString());
		        schfNameStud.setString(1, student.getStudFirstName());
		        resultSet=schfNameStud.executeQuery();
		        while(resultSet.next())
		        {
	//		         student.setStudId(resultSet.getInt("stud_id")); 	
//			         student.setStudFirstName(resultSet.getString("stud_fName"));
//			         student.setStudLastName(resultSet.getString("stud_lName"));
//			         student.setStudAddress(resultSet.getString("stud_Address"));
//			         student.setStudDepartment(resultSet.getString("stud_dept"));
//			         student.setStudMobileNo(resultSet.getLong("stud_mNo"));
			         
			         System.out.println();
			         System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
			         System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
			         System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
			         System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
			         System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
			         System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
		    }
					
					break;
				case 3:System.out.print("\n\t\t\t\tEnter the Last Name : ");
		        student.setStudLastName(Utility.getInstance().inputString());
		        schlNameStud.setString(1, student.getStudLastName());
		        resultSet=schlNameStud.executeQuery();
		        while(resultSet.next())
		        {
//			         student.setStudId(resultSet.getInt("stud_id")); 	
//			         student.setStudFirstName(resultSet.getString("stud_fName"));
//			         student.setStudLastName(resultSet.getString("stud_lName"));
//			         student.setStudAddress(resultSet.getString("stud_Address"));
//			         student.setStudDepartment(resultSet.getString("stud_dept"));
//			         student.setStudMobileNo(resultSet.getLong("stud_mNo"));
			         
			         System.out.println();
			         System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
			         System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
			         System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
			         System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
			         System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
			         System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
				        }
			
					break;
				case 4:System.out.print("\n\t\t\t\tEnter the Department : ");
		        student.setStudDepartment(Utility.getInstance().inputString());
		        schDptStud.setString(1, student.getStudDepartment());
		        resultSet=schDptStud.executeQuery();
		        while(resultSet.next())
		        {
//			         student.setStudId(resultSet.getInt("stud_id")); 	
//			         student.setStudFirstName(resultSet.getString("stud_fName"));
//			         student.setStudLastName(resultSet.getString("stud_lName"));
//			         student.setStudAddress(resultSet.getString("stud_Address"));
//			         student.setStudDepartment(resultSet.getString("stud_dept"));
//			         student.setStudMobileNo(resultSet.getLong("stud_mNo"));
			         
			         System.out.println();
			         System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
			         System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
			         System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
			         System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
			         System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
			         System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
				        }
			
					break;
				case 5:System.out.print("\n\t\t\t\tEnter the Mobile NO : ");
		        student.setStudMobileNo(Utility.getInstance().inputLong());
		        schMobileNoStud.setLong(1, student.getStudMobileNo());
		        resultSet=schMobileNoStud.executeQuery();
		        while(resultSet.next())
		        {
//			         student.setStudId(resultSet.getInt("stud_id")); 	
//			         student.setStudFirstName(resultSet.getString("stud_fName"));
//			         student.setStudLastName(resultSet.getString("stud_lName"));
//			         student.setStudAddress(resultSet.getString("stud_Address"));
//			         student.setStudDepartment(resultSet.getString("stud_dept"));
//			         student.setStudMobileNo(resultSet.getLong("stud_mNo"));
			         
			         System.out.println();
			         System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
			         System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
			         System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
			         System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
			         System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
			         System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
		
		        }
			
					break;
				default:System.out.println("\n\t\t\t\tInvalid Choice...!");
					
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	     finally {
	         
	         DatabaseUtill.close(schDptStud);
	         DatabaseUtill.close(schfNameStud);
	         DatabaseUtill.close(schIdStud);
	         DatabaseUtill.close(schlNameStud);
	         DatabaseUtill.close(schMobileNoStud);
	         DatabaseUtill.close(resultSet);
	         
	     }

	}

	@Override
	public void display() {
		init();
		 try {
			 Student student=new Student();
			
			
	        resultSet=disStud.executeQuery();
	        while(resultSet.next())
	        {
//		         student.setStudId(resultSet.getInt("stud_id")); 	
//		         student.setStudFirstName(resultSet.getString("stud_fName"));
//		         student.setStudLastName(resultSet.getString("stud_lName"));
//		         student.setStudAddress(resultSet.getString("stud_Address"));
//		         student.setStudDepartment(resultSet.getString("stud_dept"));
//		         student.setStudMobileNo(resultSet.getLong("stud_mNo"));
		         
		         System.out.println();
		         System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
		         System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
		         System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
		         System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
		         System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
		         System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
		           	
	        }
	        	
		} catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
	         
	         DatabaseUtill.close(disStud);
	         DatabaseUtill.close(resultSet);
	         
	     } 

	}

	@Override
	public void exit() {
      System.exit(0);		
	}

}
