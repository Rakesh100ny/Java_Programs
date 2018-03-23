/******************************************************************************
 *  
 *  Purpose : Maintain Stock Account System And Simply Print Report of Stock().
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.oop;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.utility.Utility;

public class StockReport {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Utility.stockReport();
	}
}
