package com.Program;

public class StackProgram {
	// FOR NODE CLASS
	class Node  {
		int data;
		Node next;
		Node (int data){
			this.data=data;
			this.next=null;
		}
	}
	// ADD - POSITION
	static Node head;
	public void Push(int data) {
		Node newNode=new Node(data);
		if (head == null) {
			head=newNode; 
			System.out.print(head.data+"->");
		}
		else {
			newNode.next = head;
			head = newNode;
			System.out.print(head.data+"->");

		}  
	}

	public static void main(String[] args) {
		StackProgram obje=new StackProgram();
		obje.Push(70);
		obje.Push(30);
		obje.Push(56);
		System.out.print("null");
	}
}


