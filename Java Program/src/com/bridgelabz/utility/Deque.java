/******************************************************************************
 *  
 *  Purpose : Making DequeOfUserDefind and Performing PelindromeChecker.
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.utility;

public class Deque {
	private char array[] = new char[5];
	private int front = array.length, rear = -1;

	public static Deque deque() {
		Deque deque = new Deque();
		return deque;
	}

	public static void addFront(Deque deque, char data) {
		if (deque.front - 1 != deque.rear) {
			deque.array[--deque.front] = data;
		}
	}

	public static void addRear(Deque deque, char data) {
		if (deque.rear + 1 != deque.front) {
			deque.array[++deque.rear] = data;
		}
	}

	public static char removeFront(Deque deque) {
		if (deque.front != deque.size()) {
			char temp = deque.array[deque.size() - 1];
			int i = deque.size() - 1;

			while (i > deque.front) {
				deque.array[i] = deque.array[i - 1];
				i = i - 1;
			}

			deque.front = deque.front + 1;
			return temp;
		}
		return ' ';
	}

	public static char removeRear(Deque deque) {
		if (deque.rear != -1) {
			char temp = deque.array[0];
			int i = 1;

			while (i <= deque.rear) {
				deque.array[i - 1] = deque.array[i];
				i = i + 1;
			}

			deque.rear = deque.rear - 1;
			return temp;
		}
		return ' ';
	}

	public int size() {
		Deque deque = Deque.deque();

		int size = deque.array.length;

		if (size == 0) {
			System.out.println("Deque is Empty...!");
		}

		return size;
	}

	public static boolean checkDeque(Deque deque) {
		if (deque.rear == deque.size() - 1 || deque.front == deque.rear + 1) {
			deque.rear = 0;
			deque.front = deque.size() - 1;
			int d = 0;

			for (int i = deque.rear, j = deque.front; i <= j; i++, j--) {
				char temp1, temp2;
				temp1 = deque.array[i];
				temp2 = deque.array[j];

				if (temp1 >= 'a' && temp1 <= 'Z') {
					temp1 = (char) (temp1 - 32);
				}

				if (temp2 >= 'a' && temp2 <= 'Z') {
					temp2 = (char) (temp1 - 32);
				}

				d = (temp1 - temp2);
			}

			if (d == 0)
				return true;

		}
		return false;
	}
}
