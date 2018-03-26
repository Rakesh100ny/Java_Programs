/******************************************************************************
 *  
 *  Purpose : To Take User input string and replace in the pattern using regexAPI.   
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.oop;

import org.json.simple.parser.ParseException;

import com.bridgelab.utility.UserDetails;
import com.bridgelab.utility.Utility;

public class RegularExpression {
	public static void main(String[] args) throws ParseException {
		Utility utility = new Utility();
		char input=' ';
		UserDetails information = new UserDetails();
		information=Utility.userDetails();
		String string[] = utility.readListOfRegexWords();
		String string2 = "";
		for (int i = 0; i < string.length; i++) {
			string2 += string[i] + " ";
		}

		boolean isCorrectName = Utility.checkName(information.getFirstName(),information.getLastName());
		boolean isCorrectMobileNo = Utility.checkMobile(information.getMobileNo());
		boolean isCoorectDate = Utility.checkDate(information.getDate());
     
		
		if (isCoorectDate && isCorrectMobileNo && isCorrectName) {
			Utility.regularExpressionApply(information, string2);
		}

	}
}
