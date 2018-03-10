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
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.Math.*;

import java.io.*;
import java.awt.Toolkit;

public class Utility {
	public static Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	/**
	 * @return string input given by the user
	 */
	public String inputString() {
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
	public static float calculateHeadPercentage(int number) {
		float head = 0.0f;
		Random random = new Random();
		for (int i = 0; i < number; i++) {
			float $float = random.nextInt(1);
			if ($float > 0.5 && $float < 1) {
				head++;
			}
		}
		return head;
	}

	/**
	 * @param number
	 * @return calculate tailPercentage and return float tailPercentage value
	 */
	public static float calculateTailPercentage(int number) {
		float tail = 0.0f;
		Random random = new Random();
		for (int i = 0; i < number; i++) {
			float $float = random.nextInt(1);
			if ($float > 0 && $float < 0.5) {
				tail++;
			}
		}
		return tail;
	}

	/**
	 * @param year
	 * @return ensure that input is correct or not and return true or false value
	 */
	public static boolean ensureInput(String year) {
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

		for (int i = 1; i <= number; i++) {
			double power = pow(2, i);
			array[i - 1] = power;
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
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("# Item " + (i + 1));
			array[i] = scanner.nextInt();
		}
		scanner.close();

		return array;
	}

	/**
	 * @param array
	 * @param length
	 */
	public static void findTriples(int[] array, int length) {
		int i, j, k, count = 0;

		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length - 1; j++) {
				for (k = j + 1; k < length - 2; k++) {
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
		if (temperature > 50 && (speed > 3 && speed < 120)) {
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
	public static void permutateString(String string) {
		permutateString("", string);
	}

	/**
	 * @param string
	 * @param string2
	 */
	private static void permutateString(String string, String string2) {
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
		Scanner scanner = new Scanner(System.in);
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
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println();
			pw.println("Integer Array");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array1[i][j] = scanner.nextInt();
				}
			}
			break;

		case 2:
			System.out.println();
			pw.println("Double Array");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array2[i][j] = scanner.nextDouble();
				}
			}
			break;

		case 3:
			System.out.println();
			pw.println("Boolean Array");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < colum; j++) {
					array3[i][j] = scanner.next();
				}
			}
			break;

		default:
			System.out.println("Invalid Choice Input...!");
			System.exit(0);

		}
		scanner.close();

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

		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		if (flag != scanner.nextBoolean()) {
			lower = mid + 1;
		} else {
			high = mid;
		}
		scanner.close();

		return findGuessingNumber(lower, high);
	}

	/**
	 * @return to take input and return Integer array
	 */
	public static Integer[] takeInputInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter  Item in the Array  : ");
		int number = scanner.nextInt();
		Integer array[] = new Integer[number];
		for (int i = 0; i < array.length; i++) {
			System.out.print("# " + (i + 1) + " Item ");
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}

	/**
	 * @return to take input and return String array
	 */
	public static String[] takeInputString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter  Item in the Array  : ");
		int number = scanner.nextInt();
		String array[] = new String[number];
		for (int i = 0; i < array.length; i++) {
			System.out.print("# " + (i + 1) + " Item ");
			array[i] = scanner.next();
		}
		scanner.close();
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
				System.out.println(key + " Key is Found at Position " + mid);

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
		System.out.print("[ ");
		for (T value : array) {
			System.out.print(value + " ");
		}
		System.out.print(" ]");

		return array;
	}

	/**
	 * @return read the data in the file then after return string array
	 */
	public static String[] readListOfWords() {
		String string[] = null;
		try {
			FileReader fr = new FileReader("/home/brideit/doc.txt");
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
		m = (month + 12 * ((14 - month) / 12) - 2);
		d = (day + x + 31) * (m / 12) % 7;

		switch (d) {
		case 0:
			System.out.println("0");
			System.out.println(day + " /" + month + " /" + year + " Sunday");
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
		double t = number;
		double e = 1E-15;

		while (Math.abs(t - (number / t)) > (e * t)) {
			t = ((number / t) + t) / 2.0;
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

		for (i = 0; i < mid; i++) {
			array1[i] = array[i];
		}
		int p;
		for (p = i, j = 0; p < array.length && j <= array2.length; p++, j++) {
			array2[j] = array[p];
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

		System.out.println("Value : " + value);

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
	        int distinct  = 0;                   

	        
	        while (distinct < number)
	        {
	            int value = getCoupon(number);  
	            count++;                       
	            if (!isCollected[value]) {     
	                distinct++;
	                isCollected[value] = true;
	                System.out.print(distinct+" ");
	            }
	        }
	        return count;
	}

	private static int getCoupon(int number) 
	{
	 /*Random random=new Random();
	 int value=random.nextInt(10);*/
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
		new Date();

		int start = date.getDay();
		int month = date.getMonth();
		int year = date.getYear() + 1900;

		System.out.println("Start : " + start);
		System.out.println("Start : " + month);
		System.out.println("Start : " + year);
		boolean isPrime = checkLeapYear(year + "");

		System.out.println("****** " + month + " " + year + " ********");
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

}
