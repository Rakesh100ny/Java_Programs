/******************************************************************************
 *  
 *  Purpose : In the Utility Package All Logic and Methods are available .     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static java.lang.Math.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.awt.Toolkit;

public class Utility {
	private final static String REGEX_NAME = "<<name>>";
	private final static String REGEX_FULLNAME = "<<full name>> ";
	private final static String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final static String REGEX_DATE = "<<date>>";
	private static Scanner scanner;
	private static Queue queue = new Queue();

	public Utility() {
		scanner = new Scanner(System.in);
	}

	/**
	 * @return string input given by the user
	 */
	public String inputString() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	public String inputString2() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * @return float input given by the user
	 */
	public float inputFloat() {
		try {
			return scanner.nextFloat();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0f;
	}

	/**
	 * @return long input given by the user
	 */
	public long inputLong() {
		try {
			return scanner.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return character input given by the user
	 */
	public char inputCharacter() {
		try {
			return scanner.next().charAt(0);
		} catch (Exception e) {
			System.out.println(e);
		}
		return ' ';
	}

	/**
	 * @return integer value given by the user
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return double value given by the user
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	/**
	 * @return boolean value given by the user
	 */
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	/**
	 * @param userName
	 * @return to check pattern and return true or false value
	 */
	public static boolean checkPattern(String userName) {
		if (userName.matches("[A-z]{3,10}"))
			return true;
		else
			return false;
	}

	/**
	 * @param string
	 * @param userName
	 */
	public static void replaceWithUserName(String string, String userName) {
		String string2 = string.replaceAll("<<UserName>>", userName);
		System.out.println(string2);
	}

	/**
	 * @param number
	 * @return calculate headPercentage and return float headPercentage value
	 */
	public static void calculatePercentage(int number) {
		double head = 0, tail = 0;

		for (int i = 0; i < number; i++) {
			double $float = (Math.random() * 1);
			if ($float > 0.5 && $float < 1) {
				head++;
			} else if ($float > 0 && $float < 0.5) {
				tail++;
			}
		}
		System.out.println("Percentage of Head " + head + "% " + "vs " + "Tails " + tail + "%");

	}

	/**
	 * @param year
	 * @return ensure that input is correct or not and return true or false value
	 */
	public static boolean isYear(String year) {
		if (year.matches("[0-9]{4}"))
			return true;
		else
			return false;
	}

	/**
	 * @param year
	 * @return check leap year and return true or false value
	 */
	public static boolean checkLeapYear(String year) {
		int year2 = Integer.parseInt(year);

		if (((year2 % 4 == 0) && (year2 % 100 != 0)) || (year2 % 400 == 0))
			return true;
		else
			return false;
	}

	/**
	 * @param number
	 * @return calculate powerof2 with help of Math.pow function and return double
	 *         array
	 */
	public static double[] powerOf(int number) {
		double array[] = new double[number];

		for (int i = 0; i < number; i++) {
			double power = pow(2, i);
			array[i] = power;
		}
		return array;
	}

	/**
	 * @param number
	 * @return calculate harmonicValue and return flaotValue
	 */
	public static float harmonicValue(float number) {
		float value = 0.0f;

		for (int i = 1; i <= number; i++) {
			value = value + (1.0f / i);
		}

		return value;
	}

	/**
	 * @param array
	 * @return take input for integer array and return integer array
	 */
	public static int[] takeInput(int[] array) {
		Utility utility = new Utility();

		for (int i = 0; i < array.length; i++) {
			System.out.print("# Item " + (i + 1));
			array[i] = utility.inputInteger();
		}

		return array;
	}

	/**
	 * @param array
	 * @param length
	 */
	public static void findTriples(int[] array, int length) {
		int i, j, k, count = 0;

		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				for (k = j + 1; k < length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println(" [ " + array[i] + " " + array[j] + " " + array[k] + " ]");
						count++;
					}
				}
			}
		}
		System.out.println("Total Number of Triples : " + count);
	}

	/**
	 * @param array1
	 * @param array2
	 * @param array3
	 * @param row
	 * @param colum
	 */
	public static void showOutput(Integer[][] array1, Double[][] array2, String[][] array3, int row, int colum) {
		PrintWriter pw = new PrintWriter(System.out, true);
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colum; j++) {
				pw.print("\t" + array1[i][j] + " ");
			}
			pw.println("\t");
		}

		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colum; j++) {
				pw.print("\t" + array2[i][j] + " ");
			}
			pw.println("\t");
		}

		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colum; j++) {
				pw.print("\t" + array3[i][j] + " ");
			}
			pw.println("\t");
		}
	}
	
	/**
	 * @param arr
	 */
	public static void display(char[][] arr) {
		for (char[] row : arr) {
			System.out.print("\t\t\t      |_" +row[0] + "_|_" +row[1]+  "_|_" + row[2] +"_|");
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	/**
	 * @param arr
	 * @param xo
	 * @return
	 */
	public static boolean checkCol(char[][] arr,char xo){
		for(int i=0;i<3;i++){
			if(arr[0][i] == xo && arr[1][i] == xo && arr[2][i]==xo){
				return true;
			}
		}
		return false;
	}
	/**
	 * @param arr
	 * @param xo
	 * @return
	 */
	public static boolean checkRows(char[][] arr,char xo){
		for(int i=0;i<3;i++){
			if(arr[i][0] == xo && arr[i][1] == xo && arr[i][2]==xo){
				return true;
			}
		}
		return false;
	}
	/**
	 * @param arr
	 * @param xo
	 * @return
	 */
	public static boolean checkDiag(char[][] arr,char xo){
		if((arr[0][0] == xo && arr[1][1] == xo && arr[2][2]== xo) || (arr[0][2]== xo && arr[1][1] == xo && arr[2][0]==xo)){
			return true;
		}else{
			return false;		
		}
	}

	/**
	 * @param pointX
	 * @param pointY
	 */
	public static void calculateDistance(int pointX, int pointY) {
		double distance = sqrt(pointX * pointX + pointY * pointY);
		System.out
				.println("Distance Between Origin(0,0) to Arguments" + "(" + pointX + "," + pointY + ") : " + distance);
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return calculate delta value and return delta value
	 */
	public static float findDelta(float a, float b, float c) {
		float delta = b * b - 4 * a * c;
		return delta;
	}

	/**
	 * @param a
	 * @param b
	 * @param delta
	 */
	public static void findRoots(float a, float b, float delta) {
		double root1 = 0.0f;
		double root2 = 0.0f;

		if (delta > 0) {
			root1 = ((-b + sqrt(delta)) / (2 * a));
			root2 = ((-b - sqrt(delta)) / (2 * a));

			System.out.println("The First Root is " + root1 + " and " + "Second Root is " + root2);
		}
	}

	/**
	 * @param temperature
	 * @param speed
	 * @return calculateWindChill Using given formula return value
	 */
	public static double calculateWindChill(double temperature, double speed) {
		double wind = 0.0;
		if (temperature < 50 && (speed >= 3 && speed < 120)) {
			wind = (35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * pow(speed, 0.16));
		}
		return wind;
	}

	/**
	 * @param $stack
	 * @param $goal
	 * @param noOfTimes
	 */
	public static void calculateGamblerWinLoss(int $stack, int $goal, int noOfTimes) {
		int wins = 0;
		int cash = 0;
		for (int i = 0; i < noOfTimes; i++) {
			cash = $stack;

			while (cash > 0 && cash < $goal) {
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}

			if (cash == $goal)
				wins++;
		}

		int head_percentage = 0;

		head_percentage = 100 * wins / noOfTimes;

		System.out.println();
		System.out.println(wins + " Wins of " + noOfTimes);
		System.out.println("Percentage of Games Won  : " + head_percentage);
		System.out.println("Percentage of Games loss : " + (100 - head_percentage));
	}

	/**
	 * @return calcualteTime inMillis and return the value
	 */
	public static long start() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		tk.beep();
		long startTimer = System.currentTimeMillis();
		return startTimer;
	}

	/**
	 * @return calcualteTime inMillis and return the value
	 */
	public static long stop() {
		long stopTimer = System.currentTimeMillis();
		Toolkit tk = Toolkit.getDefaultToolkit();
		tk.beep();
		return stopTimer;
	}

	/**
	 * @param stopTimer
	 * @param startTimer
	 * @return calculate elapsedTime and return value
	 */
	public static long getElapsedTime(long stopTimer, long startTimer) {
		long elapsed = stopTimer - startTimer;
		return elapsed;
	}

	/**
	 * @param string
	 */
	/*
	 * public static void permutateString(String string) { permutateString("",
	 * string); }
	 */

	/**
	 * @param string
	 * @param string2
	 */
	public static void permutateString(String string, String string2) {
		if (string2.length() <= 1)
			System.out.println(string + string2);
		else {
			for (int i = 0; i < string2.length(); i++) {
				String string3 = string2.substring(0, i) + string2.substring(i + 1);
				permutateString(string + string2.charAt(i), string3);
			}
		}
	}

	/**
	 * @param row
	 * @param colum
	 * @return to take input depentsUpon choice and return the array
	 */
	public static <T> T[][] takeInput(int row, int colum) {
		Utility utility = new Utility();
		PrintWriter pw = new PrintWriter(System.out);
		Integer array1[][] = new Integer[row][colum];
		Double array2[][] = new Double[row][colum];
		String array3[][] = new String[row][colum];

		System.out.println("---------------------------------");
		System.out.println();
		System.out.println(" Input For Integer : Enter 1 ");
		System.out.println();
		System.out.println(" Input For Double  : Enter 2 ");
		System.out.println();
		System.out.println(" Input For Boolean : Enter 3 ");
		System.out.println();
		System.out.println("---------------------------------");

		System.out.print("Enter The Choice : ");
		int choice = utility.inputInteger();

		switch (choice) {
		case 1:
			System.out.println();
			pw.println("Integer Array");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array1[i][j] = utility.inputInteger();
				}
			}
			break;

		case 2:
			System.out.println();
			pw.println("Double Array");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array2[i][j] = utility.inputDouble();
				}
			}
			break;

		case 3:
			System.out.println();
			pw.println("Boolean Array");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array3[i][j] = utility.inputString();
				}
			}
			break;

		default:
			System.out.println("Invalid Choice Input...!");
			System.exit(0);

		}

		if (choice == 1)
			return (T[][]) array1;
		else if (choice == 2)
			return (T[][]) array2;
		else if (choice == 3)
			return (T[][]) array3;
		else
			return null;

	}

	/**
	 * @param string1
	 * @param string2
	 * @return checkAnagram between to string and return true or false
	 */
	public static boolean checkAnagram(String string1, String string2) {
		boolean result = true;
		char charArray1[] = string1.toLowerCase().toCharArray();
		char charArray2[] = string2.toLowerCase().toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		result = Arrays.equals(charArray1, charArray2);

		if (result)
			return true;
		else
			return false;
	}

	/**
	 * @param lower
	 * @param high
	 */
	public static int[] printPrimeNumber(int lower, int high) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = lower; i < high; i++) {
			int d = 0;
			double root = 0.0;
			for (d = 2, root = sqrt(i); d <= root && i % d != 0; d++)
				;
			if (lower <= 1) {
				lower++;
			} else {
				if (d > root) {
					arrayList.add(i);
				}
			}
		}

		int array[] = new int[arrayList.size()];
		Iterator<Integer> iterator = arrayList.iterator();
		for (int i = 0; i < array.length; i++) {
			array[i] = iterator.next();
		}

		return array;

	}

	/**
	 * @param lower
	 * @param high
	 */
	/*
	 * public static int[] printAnagramNumber(int array[]) { ArrayList arrayList=new
	 * ArrayList();
	 * 
	 * 
	 * for(int i=0;i<array.length;i++) { for (int j=i+1; j < array.length; j++) {
	 * if(checkAnagram(array[i]+"", array[j]+"")==true) {
	 * //System.out.println(array[i]+"-->"+array[j]); arrayList.add(array[j]); } } }
	 * 
	 * int array1[] = new int[arrayList.size()]; Iterator<Integer> iterator =
	 * arrayList.iterator(); for (int i = 0; i < array1.length; i++) { array1[i] =
	 * iterator.next(); }
	 * 
	 * return array1;
	 * 
	 * 
	 * }
	 */

	public static Integer[][] printAnagramNumber(int array[]) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (checkAnagram(array[i] + "", array[j] + "") == true) {
					map.put(array[i], array[j]);
				}
			}
		}

		Integer pairValue[][] = new Integer[61][2];

		Integer[] key = map.keySet().toArray(new Integer[0]);

		Integer[] value = map.values().toArray(new Integer[0]);

		for (int i = 0; i < pairValue.length; i++) {
			for (int j = 0; j < pairValue[i].length; j++) {
				if (j == 0) {
					pairValue[i][j] = key[i];
				} else {
					pairValue[i][j] = value[i];
				}
			}
		}

		return pairValue;

	}

	/**
	 * @param lower
	 * @param high
	 */

	public static boolean isPalindrome(int number) {
		int digit = number;
		int remainder, reverse = 0;

		while (digit != 0) {
			remainder = digit % 10;
			reverse = reverse * 10 + remainder;
			digit = digit / 10;
		}

		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}

	public static void printPalindromeNumber(int array[]) {
		System.out.print("\nPalindrome Number in this Range : [ ");

		for (int x : array) {

			if (isPalindrome(x)) {
				System.out.print(x + " ");
			}
		}

		System.out.print(" ]");

	}

	/**
	 * @param lower
	 * @param high
	 * @return calculate userGuessing Number and return value
	 */
	public static int findGuessingNumber(int lower, int high) {

		if (lower > high)
			return -1;

		if (high == lower)
			return lower;

		int mid = (lower + high) / 2;

		System.out.println("Is it Between " + lower + " to " + mid + " ?");
		Utility utility = new Utility();
		boolean flag = true;
		if (flag != utility.inputBoolean()) {
			lower = mid + 1;
		} else {
			high = mid;
		}

		return findGuessingNumber(lower, high);
	}

	/**
	 * @return to take input and return Integer array
	 */
	public static Integer[] takeInputInteger() {
		Utility utility = new Utility();
		System.out.print("\n\t\t\t\tEnter  Item in the Array  : ");
		int number = utility.inputInteger();
		Integer array[] = new Integer[number];
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t\t\t\t# " + (i + 1) + " Item --> ");
			array[i] = utility.inputInteger();
		}

		return array;
	}

	/**
	 * @return to take input and return String array
	 */
	public static String[] takeInputString() {
		Utility utility = new Utility();
		System.out.print("\n\t\t\t\tEnter  Item in the Array  : ");
		int number = utility.inputInteger();
		String array[] = new String[number];
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t\t\t\t# " + (i + 1) + " Item -->  ");
			array[i] = utility.inputString2();
		}
		return array;
	}

	/**
	 * @param array
	 * @param key
	 * @return implement binarySearch then after return generic type array
	 */
	public static <T extends Comparable<T>> T[] binarySearch(T[] array, T key) {
		int lower, high, mid, count = 0;
		lower = 0;
		high = array.length - 1;

		Arrays.sort(array);

		while (lower <= high) {
			mid = (lower + high) / 2;
			if (key.compareTo(array[mid]) == 0) {
				count++;
				System.out.println();
				System.out.println("\n\t\t\t\t" + key + " Key is Found at Position " + mid);

			}

			if (key.compareTo(array[mid]) < 0) {
				high = mid - 1;
			} else {
				lower = mid + 1;
			}

		}

		if (count == 0) {
			System.out.println(key + " Key is Not Found...!");
		}
		return array;
	}

	/**
	 * @param array
	 */
	public static <T> void print(T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * @param array
	 */
	public static <T> void printSort(T[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * @param array
	 * @return implement inserationSort and return generic array
	 */
	public static <T extends Comparable<T>> T[] inserationSort(T[] array) {
		int i, j;
		T tmp;

		for (i = 1; i < array.length; i++) {
			if (array[i].compareTo(array[i - 1]) < 0) {
				tmp = array[i];
				for (j = i - 1; j >= 0 && array[j].compareTo(tmp) > 0; j--) {
					array[j + 1] = array[j];
				}
				array[j + 1] = tmp;
			}
		}

		System.out.print("[ ");
		for (int p = 0; p < array.length; p++) {
			System.out.print(array[p] + " ");
		}
		System.out.print(" ]");
		return array;
	}

	/**
	 * @param array
	 * @return implement bubbleSort and return generic array
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
		int i, j;
		T tmp;

		for (i = 1; i < array.length; i++) {
			for (j = 0; j < (array.length - i); j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		/*
		 * System.out.print("[ "); for (T value : array) { System.out.print(value +
		 * " "); } System.out.print(" ]");
		 */
		return array;
	}

	/**
	 * @return read the data in the file then after return string array
	 */
	public static String[] readListOfWords() {
		String string[] = null;
		try {
			FileReader fr = new FileReader("/home/brideit/string.txt");
			BufferedReader br = new BufferedReader(fr);

			String string2 = "";

			while (true) {
				string2 = br.readLine();
				if (string2 == null)
					break;
				else
					string = string2.split(" ");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return string;
	}

	
	/**
	 * @return read the data in the file then after return string array
	 */
	public static String[] readHashingValue() {
		String string[] = null;
		try {
			FileReader fr = new FileReader("/home/brideit/hashing.txt");
			BufferedReader br = new BufferedReader(fr);

			String string2 = "";

			while (true) {
				string2 = br.readLine();
				if (string2 == null)
					break;
				else
					string = string2.split(" ");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return string;
	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public static void calculateDayOfWeek(int day, int month, int year) {
		int d, y, x, m;
		y = year - (14 - month) / 12;
		x = y + y / 4 - y / 100 + y / 400;
		m = month + 12 * ((14 - month) / 12) - 2;
		d = (day + x + (31 * m) / 12) % 7;

		switch (d) {
		case 0:
			System.out.println("0");
			System.out.println(day + "/" + month + "/" + year + " Sunday");
			break;

		case 1:
			System.out.println("1 ");
			System.out.println(day + "/" + month + "/" + year + " Monday");
			break;

		case 2:
			System.out.println("2 ");
			System.out.println(day + "/" + month + "/" + year + " Tuesday");
			break;

		case 3:
			System.out.println("3 ");
			System.out.println(day + "/" + month + "/" + year + " Wednesday");
			break;

		case 4:
			System.out.println("4 ");
			System.out.println(day + "/" + month + "/" + year + " Thrusday");
			break;

		case 5:
			System.out.println("5 ");
			System.out.println(day + "/" + month + "/" + year + " Friday");
			break;

		case 6:
			System.out.println("6 ");
			System.out.println(day + "/" + month + "/" + year + " Saturday");
			break;

		}

	}

	/**
	 * @param fahrenheit
	 * @return convert fahrenheitToCelsius and return value
	 */
	public static int FTC(int fahrenheit) {
		int celsius = (fahrenheit - 32) * (5 / 9);
		return celsius;
	}

	/**
	 * @param celsius
	 * @return convert CelsiusTofahrenheit and return value
	 */
	public static int CTF(int celsius) {
		int fahrenheit = (celsius * (9 / 5)) + 32;
		return fahrenheit;
	}

	/**
	 * @param principal
	 * @param year
	 * @param rate
	 * @return findmonthlyPayment and return double value
	 */
	public static double findMonthlyPayment(double principal, double year, double rate) {
		double r = rate / (12 * 100);
		double n = 12 * year;

		double payment = (principal * r) / (1 - pow((1 + r), (-n)));
		return payment;
	}

	/**
	 * @param decimal
	 * @return convert decimal to binary and return string
	 */
	public static String toBinary(int decimal) {
		int digit = decimal;
		int remindar;
		String string = "";
		while (digit != 0) {
			remindar = digit % 2;
			string = string + remindar;
			digit = digit / 2;
		}
		return string;
	}

	/**
	 * @param number
	 * @return findsqureRoot and return double value
	 */
	public static double findSqrt(double number) {
		double t = abs(number);
		System.out.println("T  : " + t);
		double e = 1E-15;

		while (Math.abs(t - (abs(number) / t)) > (e * t)) {
			t = ((abs(number) / t) + t) / 2.0;
		}

		return t;
	}

	/**
	 * @param value
	 */
	public static void findNotes(int value) {
		int count = 0;
		int total = 0;
		int digit = value;

		while (digit != 0) {
			if (digit >= 1000) {
				count = digit / 1000;
				digit = digit % 1000;
				total = total + count;
				System.out.println("No. of 1000  Notes   : " + count);
			} else if (digit >= 500) {
				count = 0;
				count = digit / 500;
				digit = digit % 500;
				total = total + count;
				System.out.println("No. of 500  Notes    : " + count);
			} else if (digit >= 100) {
				count = 0;
				count = digit / 100;
				digit = digit % 100;
				total = total + count;
				System.out.println("No. of 100  Notes    : " + count);
			} else if (digit >= 50) {
				count = 0;
				count = digit / 50;
				digit = digit % 50;
				total = total + count;
				System.out.println("No. of 50  Notes     : " + count);
			} else if (digit >= 20) {
				count = 0;
				count = digit / 20;
				digit = digit % 20;
				total = total + count;
				System.out.println("No. of 20  Notes     : " + count);
			} else if (digit >= 10) {
				count = 0;
				count = digit / 10;
				digit = digit % 10;
				total = total + count;
				System.out.println("No. of 10  Notes     : " + count);
			} else if (digit >= 5) {
				count = 0;
				count = digit / 5;
				digit = digit % 5;
				total = total + count;
				System.out.println("No. of 5  Notes      : " + count);
			} else if (digit >= 2) {
				count = 0;
				count = digit / 2;
				digit = digit % 2;
				total = total + count;
				System.out.println("No. of 2  Notes      : " + count);
			} else if (digit >= 1) {
				count = 0;
				count = digit / 1;
				digit = digit % 1;
				total = total + count;
				System.out.println("No. of 1  Notes      : " + count);
			}
		}

		System.out.println("Total Number of Count  : " + total);
	}

	/**
	 * @param array
	 * @return divide array and generate new number
	 */
	public static int[] divideAndNewNumber(int[] array) {
		int mid = array.length / 2;

		int i, j = 0;
		int array1[] = new int[mid];
		int array2[] = new int[mid];
		System.out.println();
		System.out.print("First  4 Bit Digit : ");
		for (i = 0; i < mid; i++) {
			array1[i] = array[i];
		}
		for (int value : array1) {
			System.out.print(value + " ");
		}
		int p;
		System.out.println();
		System.out.print("second 4 Bit Digit : ");
		for (p = i, j = 0; p < array.length && j <= array2.length; p++, j++) {
			array2[j] = array[p];
		}
		for (int value : array2) {
			System.out.print(value + " ");
		}

		int r, q, tmp;
		for (r = 0, q = 0; r < array1.length && q < array2.length; r++, q++) {
			tmp = array1[r];
			array1[r] = array2[q];
			array2[q] = tmp;
		}

		for (int m = 0, a = 0, b = 0; m < array.length; m++) {
			if (a < array1.length) {
				array[m] = array1[a];
				a++;
			} else {
				array[m] = array2[b];
				b++;
			}
		}
		return array;
	}

	/**
	 * @param array
	 * @return check powerOf2 and return double value
	 */
	public static double checkPowerOf2(int[] array) {
		double array2[] = new double[array.length];
		double value = 0.0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				value = value + pow(2, ((array.length - 1) - i));
			}
		}

		array2 = powerOf(array.length);

		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == value)
				return value;
		}

		return 0;
	}

	public static int calculateDistinctCoupon(int number) {
		boolean[] isCollected = new boolean[number];
		int count = 0;
		int distinct = 0;
		String string = "";

		while (distinct < number) {
			int value = getCoupon(number);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
				string += value + " ";

			}
		}
		System.out.println("Distinct Number  : " + string);
		return count;
	}

	private static int getCoupon(int number) {
		/*
		 * Random random=new Random(); int value=random.nextInt(10);
		 */
		return (int) (Math.random() * number);

	}

	public static void fileUpdate(UnorderList list, int choice) {

		switch (choice) {
		case 1:
			try {
				String string = list.toString();

				FileWriter fw = new FileWriter("/home/brideit/string.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(string);
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 2:
			try {
				String string = list.toString();

				FileWriter fw = new FileWriter("/home/brideit/int.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(string);
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("Invalid Choice...!");

		}
	}

	public static void fileUpdate(OrderList list, int choice) {

		switch (choice) {
		case 1:
			try {
				String string = list.toString();

				FileWriter fw = new FileWriter("/home/brideit/string.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(string);
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 2:
			try {
				String string = list.toString();

				FileWriter fw = new FileWriter("/home/brideit/int.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(string);
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("Invalid Choice...!");

		}
	}

	/**
	 * @return read the data in the file then after return string array
	 */
	public static String[] readListOfWords(int choice) {
		String string1[] = null, string3[] = null;
		switch (choice) {
		case 1:
			try {
				FileReader fr = new FileReader("/home/brideit/string.txt");
				BufferedReader br = new BufferedReader(fr);

				String string2 = "";

				while (true) {
					string2 = br.readLine();
					if (string2 == null)
						break;
					else
						string1 = string2.split(" ");
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 2:
			try {
				FileReader fr = new FileReader("/home/brideit/int.txt");
				BufferedReader br = new BufferedReader(fr);
				String string4 = "";
				while (true) {
					string4 = br.readLine();
					if (string4 == null)
						break;
					else
						string3 = string4.split(" ");
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("Invalid Choice...!");

		}

		if (choice == 1)
			return string1;
		else if (choice == 2)
			return string3;
		else
			return null;
	}

	public static void findNumberOfBinarySearchTree(int[] array) throws ArithmeticException {

		for (int i = 0; i < array.length; i++) {
			long a = fact((2) * (array[i]));
			long b = fact((array[i] + 1));
			long c = fact(array[i]);
			long count = 0;
			try {
				count = a / (b * c);
			} catch (ArithmeticException e) {
				count = 0;
				// System.out.println(e.getMessage());
			}
			System.out.println(count);
		}
	}

	private static long fact(int i) {
		long fact = 1;
		while (i > 1) {
			fact = fact * i;
			i--;
		}
		return fact;
	}

	public static void printCalender(Date date) {
		int days;

		int start = date.getDay();
		int month = date.getMonth();
		int year = date.getYear() + 1900;

		boolean isPrime = checkLeapYear(year + "");

		String result = "";
		switch (month) {
		case 0:
			String mon0 = "Jaunary";
			result = mon0;
			break;
		case 1:
			String mon1 = "february";
			result = mon1;
			break;
		case 2:
			String mon2 = "March";
			result = mon2;
			break;

		case 3:
			String mon3 = "April";
			result = mon3;
			break;

		case 4:
			String mon4 = "May";
			result = mon4;
			break;

		case 5:
			String mon5 = "June";
			result = mon5;
			break;

		case 6:
			String mon6 = "July";
			result = mon6;
			break;

		case 7:
			String mon7 = "August";
			result = mon7;
			break;

		case 8:
			String mon8 = "September";
			result = mon8;
			break;

		case 9:
			String mon9 = "October";
			result = mon9;
			break;

		case 10:
			String mon10 = "November";
			result = mon10;
			break;

		case 11:
			String mon11 = "December";
			result = mon11;
			break;

		default:
			System.out.println("Invalid Month");

		}

		System.out.println("******* " + result + " " + year + " ********");
		System.out.println("SUN MON TUE WED THU FRI SAT");
		if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
			days = 31;
		} else if (month == 1) {
			if (isPrime)
				days = 29;
			else
				days = 28;
		} else {
			days = 30;
		}

		int j;
		for (j = 1; j <= start; j++)
			System.out.print("    ");
		for (int i = 1, startPoint = j; i <= days; i++, startPoint++) {
			if (startPoint == 7) {
				System.out.printf("%3d ", i);
				System.out.println();
				startPoint = 0;
			} else
				System.out.printf("%3d ", i);
		}
		System.out.println("\n");
	}

	public static void fileUpdate(OrderList list) {
		try {
			String string = list.toString();

			FileWriter fw = new FileWriter("/home/brideit/integer.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(string);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int[][] print2DArrayPrime(int lower, int high) {
		int start = 0, count = 0, end = 100;

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = lower; i < high; i++) {
			int d = 0;
			double root = 0.0;
			for (d = 2, root = sqrt(i); d <= root && i % d != 0; d++)
				;
			if (lower <= 1) {
				lower++;
			} else {
				if (d > root) {
					arrayList.add(i);
				}
			}
		}

		int array[][] = new int[10][];

		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= high; j++) {
				count = isPrime(start, end);
			}
			start += 100;
			end += 100;
			array[i] = new int[count];
		}

		Iterator<Integer> iterator = arrayList.iterator();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = iterator.next();
			}
		}

		return array;
	}

	public static int isPrime(int lower, int high) {
		int count = 0;
		for (int i = lower; i < high; i++) {
			int d = 0;
			double root = 0.0;
			for (d = 2, root = sqrt(i); d <= root && i % d != 0; d++)
				;
			if (lower <= 1) {
				lower++;
			} else {
				if (d > root) {
					count++;
				}
			}
		}
		return count;
	}

	public static void print2DAnagramNumber(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (checkAnagram(array[i][j] + "", array[i][j + 1] + "")) {
					System.out.println(array[i][j] + "-->" + array[i][j + 1]);
				}
			}
		}
	}

	public static void findPrimeFactor(int number) {
		String string = "";

		for (int i = 2; i * i <= number;) {
			while (number != 1) {
				if (number % i == 0) {
					number = number / i;
					string += i + " ";
				} else {
					i++;
					if (number % i == 0) {
						number = number / i;
						string += i + " ";
					}
				}
			}
		}
		System.out.println(string);
	}

	public static void fileUpdate(HashMap<Integer, OrderList> map) {
		try {
			System.out.println("HASHMAp : "+map);
			String string = map.toString();
			System.out.println(string);
			FileWriter fw = new FileWriter("/home/brideit/fileupdate.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(string);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void toSearchElem(int data, HashMap<Integer, OrderList> map) {
		int rem = data / 11;

		if (map.get(rem).search(data)) {
			map.get(rem).remove(data);

			System.out.println("Element remove");
			// Utility.fileUpdate(map);
		} else {
			map.get(rem).insert(data);
			System.out.println("Element add");
			// Utility.fileUpdate(map);
		}
	}

	public static void hashingFunction(String[] string) {
		Utility utility = new Utility();
		HashMap<Integer, OrderList> map = new HashMap<Integer, OrderList>();
		int rem = -1;
		for (int i = 0; i < string.length; i++) {
			rem = Integer.parseInt(string[i]) % 11;
			if (map.containsKey(rem)) {
				OrderList list = map.get(rem);
				list.insert(Integer.parseInt(string[i]));
			} else {
				map.put(rem, new OrderList());
				OrderList list = map.get(rem);
				list.insert(Integer.parseInt(string[i]));
			}
		}

		System.out.println(map);
		System.out.print("Elements persent in the File  : ");
		for (String str : string) {
			System.out.print(str + " ");
		}
		System.out.println();

		System.out.print("Enter the Key Which you want  : ");
		int key = utility.inputInteger();
		// int index = 0;
		rem = key % 11;

		if (map.containsKey(rem)) {
			OrderList list = map.get(rem);

			if (list.search(key)) {
				list.remove(key);
				System.out.println(key + " Found and removed from the list...!");
				fileUpdate(map);
				System.out.println("File is Update...!");
			} else {
				list.add(key);
				System.out.println(key + " Not Found and added from the list...!");
				fileUpdate(map);
				System.out.println("File is Update...!");
			}
		} else {
			map.put(rem, new OrderList());
			OrderList list = map.get(rem);
			if (!list.search(key)) {
				list.add(key);
				System.out.println(key + " Not Found and added from the list...!");
				fileUpdate(map);
				System.out.println("File is Update...!");
			}
		}
	}

	public static void regularExpressionApply(UserDetails information, String string2) {
		Pattern pattern = Pattern.compile(REGEX_NAME);
		Matcher matcher = pattern.matcher(string2);
		string2 = matcher.replaceAll(information.getFirstName());

		pattern = Pattern.compile(REGEX_FULLNAME);
		matcher = pattern.matcher(string2);
		string2 = matcher.replaceAll(information.getFirstName() + " " + information.getLastName() + " ");

		pattern = Pattern.compile(REGEX_MOBILE_NO);
		matcher = pattern.matcher(string2);
		string2 = matcher.replaceAll(information.getMobileNo());

		pattern = Pattern.compile(REGEX_DATE);
		matcher = pattern.matcher(string2);
		string2 = matcher.replaceAll(information.getDate());

		System.out.println();
		System.out.println("\n\t\t\tFinally Replace String : " + string2);

	}

	public static String[] initializeCards() {

		String suit[] = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

		System.out.println("After Sort rank Array : ");
		System.out.println();
		Arrays.sort(rank);
		for (String s : rank) {
			System.out.println(s);
		}
		String deckOfCards[] = new String[52];
		int position = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (suit[i].length() == 5) {
					deckOfCards[position++] = suit[i] + "    --> " + rank[j];
				} else if (suit[i].length() == 6) {
					deckOfCards[position++] = suit[i] + "   --> " + rank[j];
				} else if (suit[i].length() == 8) {
					deckOfCards[position++] = suit[i] + " --> " + rank[j];
				}

			}
		}
		System.out.print("Before Shuffle The Cards : ");
		System.out.printf("[ %s ]", deckOfCards[0]);
		System.out.println();
		for (int i = 1; i < deckOfCards.length; i++) {
			System.out.printf("\t\t\t   [ %s ]", deckOfCards[i]);
			System.out.println();
		}
		return deckOfCards;
	}

	public static String[] shuffleCards(String[] initialize) {
		for (int i = 0; i < initialize.length; i++) {
			int random = (int) (Math.random() * (52));
			String temp = initialize[i];
			initialize[i] = initialize[random];
			initialize[random] = temp;
		}

		System.out.print("After Shuffle The Cards : ");
		System.out.printf(" [ %s ]", initialize[0]);
		System.out.println();
		for (int i = 1; i < initialize.length; i++) {
			System.out.printf("\t\t\t   [ %s ]", initialize[i]);
			System.out.println();
		}
		return initialize;
	}

	public static String[][] distributeCards(String[] shuffle, int noOfCards, int noOfPlayers) {
		String printCards[][] = new String[noOfPlayers][noOfCards];
		int position = 0;
		for (int i = 0; i < noOfPlayers; i++) {
			for (int j = 0; j < noOfCards; j++) {
				printCards[i][j] = shuffle[position++];
			}
		}

		System.out.println(" After Distribute Cards : ");
		int count = 1;
		for (int i = 0; i < noOfPlayers; i++) {
			System.out.println("\t\t\t    " + (count++) + " Player Cards");
			System.out.println("\t\t\t  ------------------");
			for (int j = 0; j < noOfCards; j++) {
				System.out.println("\t\t\t    " + printCards[i][j]);
			}
			System.out.println("");
		}
		return printCards;
	}

	public static void printSortedUsingQueue(String[][] distribute, int noOfCards, int noOfPlayers) {

		String array[] = new String[noOfCards];
		for (int i = 0; i < noOfPlayers; i++) {
			for (int j = 0; j < noOfCards; j++) {
				array[j] = distribute[i][j];
			}
			queue.insert(i + 1 + "");
			sort(array);
		}

		printSortedCards(queue);
	}

	private static void sort(String[] array) {
		char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < array.length; j++) {
				String item = array[j];
				char itemRank = item.charAt(item.length() - 1);
				if (itemRank == rank[i])
					queue.insert(item);
			}
		}
	}

	private static void printSortedCards(Queue queue) {
		System.out.println("After Sorting the Cards : ");
		for (int i = 0; i < 40; i++) {
			String item = (String) queue.delete();
			if (item.equals(1 + "")) {
				System.out.println("\t\t\t    " + item + " Player Cards");
				System.out.println("\t\t\t  ------------------");

			} else if (item.equals(2 + "")) {
				System.out.println();
				System.out.println("\t\t\t    " + item + " Player Cards");
				System.out.println("\t\t\t  ------------------");
			} else if (item.equals(3 + "")) {
				System.out.println();
				System.out.println("\t\t\t    " + item + " Player Cards");
				System.out.println("\t\t\t  ------------------");
			} else if (item.equals(4 + "")) {
				System.out.println();
				System.out.println("\t\t\t    " + item + " Player Cards");
				System.out.println("\t\t\t  ------------------");
			} else {
				System.out.println("\t\t\t    " + item);
			}

		}
		System.out.println();
	}

	public static void writeInventory() {
		Utility utility = new Utility();
		JSONObject finalObj = new JSONObject();
		JSONObject outer = new JSONObject();

		System.out.print("\n\t\t\tEnter the Number that you are want to store Inventory :");
		int number = utility.inputInteger();
		String array[] = new String[number];

		for (int i = 0; i < array.length; i++) {
			System.out.print("\t\t\t" + (i + 1) + ".Enter the Inventory    : ");
			array[i] = utility.inputString2();
		}

		for (String name : array) {
			System.out.print("\t\t\tEnter the types of " + name + "  : ");
			int count = utility.inputInteger();
			JSONArray jsonArray = new JSONArray();
			for (int p = 0; p < count; p++) {
				JSONObject jsonObject = new JSONObject();
				System.out.print("\t\t\tEnter Name of " + name + "       : ");
				String value = utility.inputString2();
				jsonObject.put("name", value);
				System.out.print("\t\t\tEnter Weight of " + name + "     : ");
				double weight = utility.inputDouble();
				jsonObject.put("weight", weight);
				System.out.print("\t\t\tEnter Price of " + name + "      : ");
				double price = utility.inputDouble();
				jsonObject.put("price", price);
				jsonObject.put("total", weight * price);
				jsonArray.add(jsonObject);
			}
			finalObj.put(name, jsonArray);
		}

		outer.put("data", finalObj);

		PrintWriter printWriter = null;

		try {
			printWriter = new PrintWriter("/home/brideit/info.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		printWriter.write(((Object) outer).toString());
		printWriter.close();

	}

	public static void calculateValueOfInventory() throws FileNotFoundException, IOException, ParseException {

		double totalAmount = 0;
		JSONParser parser = new JSONParser();
		Object outer = parser.parse(new FileReader("/home/brideit/info.json"));
		JSONObject outerobject = (JSONObject) outer;
		JSONObject jsonObj = (JSONObject) outerobject.get("data");

		JSONArray arr = (JSONArray) jsonObj.get("Rice");
		JSONObject inner = null;

		System.out.println();
		System.out.println("\t\t\t\t            R I C E");
		System.out.println("\t\t\t\t------------------------------");
		double riceTotal = 0;

		for (int i = 0; i < arr.size(); i++) {
			inner = (JSONObject) arr.get(i);
			riceTotal = (double) inner.get("total");
			totalAmount += riceTotal;
			System.out.println("\t\t\t\tRice Inventory Name   : " + inner.get("name"));
			System.out.println("\t\t\t\tRice Inventory Price  : " + inner.get("price"));
			System.out.println("\t\t\t\tRice Inventory Weight : " + inner.get("weight"));
			System.out.println("\t\t\t\tRice Total Price      : " + riceTotal);
		}
		System.out.println();
		System.out.println("\t\t\t\t            P U L S E ");
		System.out.println("\t\t\t\t-------------------------------");
		JSONArray arr2 = (JSONArray) jsonObj.get("Pulse");
		JSONObject inner2 = null;
		double pulseTotal = 0;
		for (int i = 0; i < arr2.size(); i++) {
			inner2 = (JSONObject) arr2.get(i);
			pulseTotal = (double) inner2.get("total");
			totalAmount += pulseTotal;
			System.out.println("\t\t\t\tPulse Inventory Name   : " + inner2.get("name"));
			System.out.println("\t\t\t\tPulse Inventory Price  : " + inner2.get("price"));
			System.out.println("\t\t\t\tPulse Inventory Weight : " + inner2.get("weight"));
			System.out.println("\t\t\t\tPulse Total Price      : " + pulseTotal);
		}

		JSONArray arr3 = (JSONArray) jsonObj.get("Wheat");
		JSONObject inner3 = null;
		System.out.println();
		System.out.println("\t\t\t\t            W H E A T ");
		System.out.println("\t\t\t\t-------------------------------");
		double wheatTotal = 0;
		for (int i = 0; i < arr3.size(); i++) {
			inner3 = (JSONObject) arr3.get(i);
			wheatTotal = (double) inner3.get("total");
			totalAmount += wheatTotal;
			System.out.println("\t\t\t\tWheat Inventory Name   : " + inner3.get("name"));
			System.out.println("\t\t\t\tWheat Inventory Price  : " + inner3.get("price"));
			System.out.println("\t\t\t\tWheat Inventory Weight : " + inner3.get("weight"));
			System.out.println("\t\t\t\tWheat Total Price      : " + wheatTotal);
		}

		System.out.println("\n\t\t\t\tTotal Amount in the Inventory  : " + totalAmount);

	}

	public static void stockReport() throws FileNotFoundException, IOException, ParseException {
		JSONArray jsonArray = new JSONArray();
		Utility utility = new Utility();
		System.out.print("\n\t\t\t\t          S T O C K-R E P O R T ");
		System.out.println("\n\t\t\t\t---------------------------------------");

		System.out.print("\n\t\t\t\tEnter Number of Company    : ");
		int number = utility.inputInteger();
		String[] array = new String[number];
		int share[] = new int[number];
		int amount[] = new int[number];
		int total[] = new int[number];
		int totalStock = 0;

		for (int i = 0; i < number; i++) {
			System.out.print("\t\t\t\t" + (i + 1) + ".Enter the Company Name    : ");
			array[i] = utility.inputString2();
		}

		for (int i = 0; i < number; i++) {
			System.out.print("\n\t\t\t\tEnter No of Share " + array[i] + "     : ");
			share[i] = utility.inputInteger();
			System.out.print("\n\t\t\t\tEnter Amount of Share " + array[i] + " : ");
			amount[i] = utility.inputInteger();
			total[i] = share[i] * amount[i];
		}

		System.out.println();
		System.out.println("\n\t\t\t\t           STOCK-REPORT");
		System.out.println("\t\t\t\t-------------------------------------");
		System.out.printf("\t\t\t\tCompanyName | Shares | Price | Total");
		System.out.println();
		PrintWriter printWriter = null;
		printWriter = new PrintWriter("/home/brideit/stock.json");

		for (int i = 0; i < number; i++) {
			System.out.printf("\t\t\t\t%11s | %6d | %5d | %4d ", array[i], share[i], amount[i], total[i]);
			System.out.println();
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Company_Name", array[i]);
			jsonObject.put("Share_Name", share[i]);
			jsonObject.put("Share_Price", amount[i]);
			jsonObject.put("Share_Total", total[i]);
			jsonArray.add(jsonObject);
		}

		printWriter.write(jsonArray.toJSONString());
		printWriter.flush();
		printWriter.close();
		System.out.println();
		for (int i = 0; i < number; i++) {
			totalStock += share[i] * amount[i];
		}
		System.out.println("\n\t\t\t\tTotal Amount Stock is : " + totalStock + " /-");
	}

	public static boolean checkName(String firstName, String lastName) {
		if (firstName.matches("[A-z]{3,10}") && lastName.matches("[A-z]{3,10}")) {
			return true;
		} else {
			System.out.println("\n\t\t\tInvalid First-Name & Last-Name...Please Enter Correct Information");
			return false;
		}

	}

	public static boolean checkMobile(String mobileNo) {
		if (mobileNo.matches("\\d{10}")) {
			return true;
		} else {
			System.out.println("\n\t\t\tInvalid Mobile Number...Please Enter Correct Information");
			return false;
		}

	}

	public static boolean checkDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-y");
		Date rightdate = null;
		try {
			rightdate = sdf.parse(date);
			return true;
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("\n\t\t\tInvalid Date Format...Please Enter Correct Information");
			return false;
		}

	}

	public char[][] fill(char[][] arr)
	{

		for (char[] row : arr)
		{	
			Arrays.fill(row, '_');
		}
		
		return arr;
	}

	public static String[] mergeSort(String[] list) 
	{
		String [] sorted = new String[list.length];
        if (list.length == 1) {
            sorted = list;
        } else {
            int mid = list.length/2;
            String[] left = null; 
            String[] right = null;
            if ((list.length % 2) == 0) {
                left = new String[list.length/2];
                right = new String[list.length/2];
            } else { 
                left = new String[list.length/2];
                right = new String[(list.length/2)+1];
            }
            int x=0;
            int y=0;
            for ( ; x < mid; x++) {
                left[x] = list[x];
            }
            for ( ; x < list.length; x++) {
                right[y++] = list[x];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            sorted = mergeArray(left,right);
        }

        return sorted;
 	
		
	}

	private static String[] mergeArray(String[] left, String[] right)
	{
		   String[] merged = new String[left.length+right.length];
	        int lIndex = 0;
	        int rIndex = 0;
	        int mIndex = 0;
	        int comp = 0;
	        while (lIndex < left.length || rIndex < right.length) {
	            if (lIndex == left.length) {
	                merged[mIndex++] = right[rIndex++];
	            } else if (rIndex == right.length) {
	                merged[mIndex++] = left[lIndex++];
	            } else {  
	                comp = left[lIndex].compareTo(right[rIndex]);
	                if (comp > 0) {
	                    merged[mIndex++] = right[rIndex++];
	                } else if (comp < 0) {
	                    merged[mIndex++] = left[lIndex++];
	                } else { 
	                    merged[mIndex++] = left[lIndex++];
	                }
	            }   
	        }
	        return merged;

	}
}
