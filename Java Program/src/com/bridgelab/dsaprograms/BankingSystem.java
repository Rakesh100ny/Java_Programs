package com.bridgelab.dsaprograms;

import com.bridgelab.utility.Queue;
import com.bridgelab.utility.Utility;

public class BankingSystem {
	static long BankBalance = 100000;
	public static void main(String[] args) {
    Utility utility=new Utility();
    System.out.print("Enter No. of People :  ");
    int number=utility.inputInteger();
    char input=' '; 
    
     Queue queue=new Queue();
     for(int i=0;i<number;i++)
     {
      queue.insert(i);	
     }
     
    do
    {

    	System.out.print("\n\n\n\n\t\t\t\t           B A N K-S Y S T E M ");
    	System.out.print("\n\t\t\t\t-----------------------------------------\n");

    	System.out.print("\n\t\t\t\tDeposit Amount                 : Enter 1");
    	System.out.print("\n\t\t\t\tWithdraw Amount                : Enter 2");
    	System.out.print("\n\t\t\t\tCheck Current Balance          : Enter 3");
    	System.out.print("\n\t\t\t\tNo of People in the Queue      : Enter 4");
    	System.out.print("\n\t\t\t\tDecrese the Size of the Queue  : Enter 5");
    	System.out.print("\n\t\t\t\tIncrease the Size of the Queue : Enter 6");

    	System.out.print("\n\t\t\t\t-----------------------------------------\n");

    	
    	System.out.print("\n\n\n\t\t\t\tEnter Choice : ");
        int choice=utility.inputInteger();

     switch (choice)
     {
	  case 1 : System.out.print("\n\t\t\t\tEnter Deposite Money : ");
	     	   long money = utility.inputLong();
		       BankBalance=BankBalance+money;
               System.out.println("\n\t\t\t\tBankBalance is       :"+BankBalance);
               break;
               
	  case 2 : System.out.print("\n\t\t\t\tEnter Withdraw Money : ");
			   long withdraw = utility.inputLong();
			   if(withdraw>BankBalance)
			   {
				System.out.println("\n\t\t\t\tSorry Insufficient Balance in the Bank");
			   }
			   else 
			   {
				BankBalance =BankBalance-withdraw;
				System.out.println("\n\t\t\t\tBankBalance is      :"+BankBalance);
               }
		       break;
		  
	  case 3 : System.out.println("\n\t\t\t\tCurrent Balance is   : "+BankBalance);
	           break;
	  case 4 : int NumOfPeople=queue.size();
	           System.out.println("\n\t\t\t\tNum of people in queue "+NumOfPeople);
	           break;

	  case 5 : queue.delete();
		       int value=queue.size();
               System.out.println("\n\t\t\t\tNum of person remaining in queue "+value);
               break;
               
	  case 6 : System.out.print("\n\t\t\t\tHow Many Size Increased : ");
	           int increaseSize=utility.inputInteger(); 
		       for(int i=0;i<increaseSize;i++)
		       {
	            queue.insert(increaseSize);
		       }
		       int num=queue.size();
		       System.out.println("\n\t\t\t\tNum of person remaining in queue "+num);
		       break;
     default : System.out.println("\n\t\t\t\tInvalid Choice...!");		       
	}
    System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
    input=utility.inputCharacter();
    }while(input=='Y' || input=='y');
	}

}
