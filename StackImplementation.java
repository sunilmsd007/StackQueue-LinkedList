import java.util.Scanner;


public class StackImplementation {

    //node creation
	static class Node{
		int data;
		Node next; 
		Node(int data){
			this.data=data;
			this.next=null;
		}}
		  Node top=null;
	//push method to add elements 
	void push() {
		System.out.println("enter the data");
		Scanner sc =new Scanner(System.in);
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(top==null) {
			top=newNode;
		}
		else {
			newNode.next=top;
			top=newNode;
		}			
	}
      //pop method to delete elements from top
	void pop() {
		if(top==null)
			System.out.println("stack empty");
		else
			System.out.println("popped element is " +top.data);
			top=top.next;
			System.out.println("now stack is");
			display();
	}
      //display method to display stack contents
	void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		if(top==null)
			System.out.println("Stack is empty");
	}

	public static void main(String[] args) {
		int l;
		 StackImplementation s = new StackImplementation();
		 Scanner sc = new Scanner(System.in);
                 //recursively asking user to choose operation to perform
		 do {
		 System.out.println("press 1 to push");
		 System.out.println("press 2 to pop");
		 System.out.println("press 3 to display");
		 System.out.println("enter ur choice");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
		 {
			 s.push();
			 break;
		 }
		 case 2:
		 {
			 s.pop();
			 break;
		 }
		 case 3:
		 {
			 s.display();
			 break;
		 }
		 default:
		 System.out.println("enter valid choice");
		 
		 }System.out.println("enter 0 to go back to main menu");
		 l=sc.nextInt();
		 } while(l==0);
		System.out.println("EXITED");
  }
}
