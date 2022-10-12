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

	// ADD - POSITION
	public void Add(int data) {
		Node newNode=new Node(data);
		if (head==null && tail==null) {
			tail=newNode;
			System.out.print(tail.data+"->");
		}
		else {
			tail.next=newNode;
			tail=newNode;	
			System.out.print(tail.data+"->");
		}
	}
public static void main(String[] args) {
	QueueProgram obj=new QueueProgram();
	obj.Add(56);
	obj.Add(30);
	obj.Add(70);

}
}

