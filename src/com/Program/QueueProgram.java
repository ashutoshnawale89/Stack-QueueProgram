package com.Program;

public class QueueProgram {
	 Node head;
	Node tail;
	// FOR NODE CLASS
	class Node {	 
		Node next;
		int data;
		Node(int data) {
			this.data=data;
			this.next=null;
		}
	}		
		public boolean isEmpty() {
			return head==null && tail==null;
		}  
		// ADD - POSITION
		public void Add(int data) {
			Node newNode=new Node(data);
			if (head==null && tail==null) {
				head=tail=newNode;
				System.out.println(tail.data+"->");
			}
			else {
				tail.next=newNode;
				tail=newNode;	
				System.out.println(tail.data+"->");
			}
		}
		// REMOVE - POSITION
		public int remove() {
			int front = head.data;
			if (head==null && tail==null) {
				System.out.println("The List Is Empty");
				return -1;
			}			
			if (head==tail) {
				tail=null;
			}			
			head=head.next;
			return front;
		}
		// PEEK - POSITION
		public int Peek() {
			if (head==null && tail==null) {
				System.out.println("The List Is Empty");
			}
			return head.data;
		}
		public static void main(String[] args) {
			QueueProgram obj=new QueueProgram();
			obj.Add(56);
			obj.Add(30);
			obj.Add(70);
			while (!obj.isEmpty()) {
				System.out.println(obj.remove()+" ->");
				obj.Peek();
			}
		}
	}
