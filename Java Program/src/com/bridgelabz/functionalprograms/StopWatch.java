/******************************************************************************
 *  
 *  Purpose : Determine elapsed Time between startProgram and stopProgram using System class    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Press '1' to Start Time            : ");
		long start = utility.inputLong();
		start = Utility.start();
		System.out.println();
		System.out.println("Press '2' to Stop Time             : ");
		long stop = utility.inputLong();
		stop = Utility.stop();

		System.out.println("Start Time is                      : " + start);
		System.out.println("Stop  Time is                      : " + stop);

		long elapsedTime = Utility.getElapsedTime(stop, start);
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is : " + elapsedTime);
		System.out.println();

		System.out.println("Converting millisec to seconds     : " + (elapsedTime / 1000) + " sec");
	}
}
