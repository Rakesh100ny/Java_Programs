/******************************************************************************
 *  
 *  Purpose : Making OrderLinkedListOfUserDefind and Performing 
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.utility;

import java.lang.Comparable;

import com.bridgelabz.utility.Node;

public class OrderList<T> {
	Node<T> start, last;
	private int count;

	public static Node list() {
		Node node = new Node();
		return node;
	}

	public <T extends Comparable<T>> void add(T data) {
		Node forword, previous;
		Node node = OrderList.list();
		node.setData(data);

		for (previous = null, forword = start; forword != null
				&& data.compareTo((T) forword.data) > 0; previous = forword, forword = forword.next)
			;
		if (forword == null) {
			if (start == null) {
				start = last = node;
			} else {
				last = last.next = node;
			}
		} else {
			node.next = forword;
			if (forword == start) {
				start = node;
			} else {
				previous.next = node;
			}
		}
		count++;
	}

	public String getElement(T position) {
		Node forword = start, previous;
		String str = "";
		if (forword == null) {
			System.out.println("List is Empty...!");
		}

		for (forword = start, previous = null; forword.data != position
				&& forword.next != null; previous = forword, forword = forword.next)
			;
		str = str + forword.data + " ";
		return str;
	}

	public T remove(T data) {
		Node forword = start, previous;

		if (forword == null) {
			System.out.println("List is Empty...!");
		}
		T str = null;
		for (forword = start, previous = null; forword.data != data
				&& forword.next != null; previous = forword, forword = forword.next)
			;

		if (forword == start) {
			str = (T) start.data;
			start = start.next;
			if (start == null)
				last = null;
		} else {
			str = (T) forword.data;
			previous.next = forword.next;
			if (forword == last)
				last = previous;
		}
		count--;
		return str;
	}

	public void remove2(T data) {
		Node forword = start, previous;

		if (forword == null) {
			System.out.println("List is Empty...!");
		}

		for (forword = start, previous = null; forword.data != data
				&& forword != null; previous = forword, forword = forword.next)
			;

		if (forword == start) {

			start = start.next;
			if (start == null)
				last = null;
		} else {

			previous.next = forword.next;
			if (forword == last)
				last = previous;
		}
		count--;

	}

	public void print() {
		Node forword = start;
		while (forword != null) {
			// System.out.println(forword.data);
			forword = forword.next;
		}
	}

	public boolean search(T data) {
		Node temp = start;

		while (temp != null && !data.equals(temp.data))
			temp = temp.next;

		return temp != null;
	}

	public int size() {
		return count;
	}

	public void append(T data) {
		Node node = UnorderList.list();
		node.setData(data);

		if (start == null)
			start = node;
		else
			last.next = node;

		last = node;
		count++;
	}

	public <T extends Comparable<T>> void insert(T data) {
		Node forword, previous;

		for (previous = null, forword = start; forword != null
				&& data.compareTo((T) forword.data) > 0; previous = forword, forword = forword.next)
			;

		Node node = OrderList.list();
		node.setData(data);

		if (forword == null) {
			if (start == null) {
				start = last = node;
			} else {
				last = last.next = node;
			}
		} else {
			node.next = forword;
			if (forword == start) {
				start = node;
			} else {
				previous.next = node;
			}
		}
		count++;
	}

	public void insert(int pos, T data) {
		Node forword, previous = null;

		for (forword = start; pos > 1 && forword != null; previous = forword, forword = forword.next, pos--)
			;

		if (forword == null)
			System.out.println("List is Empty...!");
		;

		Node node = UnorderList.list();
		node.setData(data);

		node.next = forword;
		previous.next = node;

		if (start == forword) {
			start = forword;
		}
		count++;

	}

	public boolean isEmpty() {
		Node forword = start;
		if (forword == null) {
			return true;
		}
		return false;
	}

	public int index(T data) {
		Node forword = start;
		String str = "";
		if (forword == null) {
			return -1;
		}

		int index = 0;
		while (forword != null && forword.data != data) {
			index++;
			forword = forword.next;
		}

		return index + 1;
	}

	public String toString() {
		String string = "";
		Node forword = start;
		while (forword != null) {
			string = string + forword.data + " "; // Important(will call toString of Node class)
			forword = forword.next;
		}

		return string;
	}

}
