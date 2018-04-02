/******************************************************************************
 *  
 *  Purpose : Making StackOfUserDefind and Performing 
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.utility;

public class Stack<T> {
	private Node top;

	public void push(T val) {
		Node nd = new Node(val);
		nd.next = top;
		top = nd;

	}

	public T pop() {
		if (top == null)
			return null;
		T n = (T) top.val;
		top = top.next;
		return n;
	}

	public void print() {
		Node forword = top;
		T n = (T) forword.val;

		while ((n = pop()) != null) {
			System.out.print(n + " ");
		}
	}

	/*
	 * public void print() { _printRev(top); }
	 * 
	 * 
	 * private void _printRev(Node top) { if(top==null) return; _printRev(top.next);
	 * System.out.print(top.val+" "); }
	 */

	class Node<T> {
		public T val;
		public Node next;

		Node() {
		}

		Node(T val) {
			this.val = val;
		}
	}
}
