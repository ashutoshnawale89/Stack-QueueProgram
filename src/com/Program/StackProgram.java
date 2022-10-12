package com.Program;

import com.stack.program.StackProgram;
import com.stack.program.StackProgram.Node;

public class StackProgram {
	public Node head;
	// FOR NODE CLASS
   class Node  {
		int data;
		Node next;
		// Constructor 
		Node (int data){
			this.data=data;
			this.next=null;
		}
	}
   
   public boolean isEmpty() {
		return head == null;
	}  
   
   // Push Method
		public void push(int data) {
			Node newNode=new Node(data);
			if (head == null) {
				head=newNode; 
			}
			else {
				newNode.next = head;
				head = newNode;
			}
		}
			// REMOVE - POSITION
			public int Pop() {
				if (head == null) { 
					return -1;
				}
				else {
					int top = head.data;
					head=head.next;
					return top;
				}
			}
			// PEEK - POSITION
			public int peek() {
				if (head == null) { 
					return -1;
				}
				else {
					return head.data;
				}
			}
		
	
	public static void main(String[] args) {
		StackProgram obj=new StackProgram();
		obj.push(70);
		obj.push(30);
		obj.push(56);
		while(!obj.isEmpty()) {
			System.out.println(obj.peek());
			obj.Pop();
		}
	}
}


