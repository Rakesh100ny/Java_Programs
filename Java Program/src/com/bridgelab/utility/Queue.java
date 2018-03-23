/******************************************************************************
 *  
 *  Purpose : Making QueueOfUserDefind and Performing 
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.utility;

public class Queue<T> {
	private Node front, rear;
	private int count = 0;

	public void insert(T val) {
		Node nd = new Node(val);

		if (front == null)
			front = nd;
		else
			rear.next = nd;

		rear = nd;
		count++;
	}

	public T delete() {
		if (front == null)
			return null;
		T n = (T) front.val;
		front = front.next;
		count--;
		return n;
	}

	public int size() {
		return count;
	}

	public void print() {
		Node forword = front;
		T n = (T) forword.val;

		while ((n = delete()) != null) {
			System.out.print(n + " ");
		}
	}

	class Node<T> {
		T val;
		Node next;

		Node() {
		}

		Node(T val) {
			this.val = val;
		}
	}

}
