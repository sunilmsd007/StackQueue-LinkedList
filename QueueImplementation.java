import java.util.Scanner;

public class QueueImplementation {

     //node creation
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}}
		  Node front=null;
		  Node rear=null;
	// enqueue method to append elements 
	void enqueue() {
		System.out.println("enter the data");
		Scanner sc =new Scanner(System.in);
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(front==null) {
			front=newNode;
			rear=newNode;
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
				
	}
      //dequeue method to delete elements (FIFO)
	void dequeue() {
		if(front==null)
			System.out.println("Queue empty");
		else
			System.out.println("popped element is " +front.data);
			front=front.next;
			System.out.println("now Queue is");
			display();
	}
      //display Queue content
	void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		if(front==null)
		 System.out.println("Queue is empty");
	}


	public static void main(String[] args) {
		int l;
		QueueImplementation q = new QueueImplementation();
		 Scanner sc = new Scanner(System.in);
		 do {
		 System.out.println("press 1 to enqueue");
		 System.out.println("press 2 to dequeue");
		 System.out.println("press 3 to display");
		 System.out.println("enter ur choice");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
		 {
			 q.enqueue();
			 break;
		 }
		 case 2:
		 {
			 q.dequeue();
			 break;
		 }
		 case 3:
		 {
			 q.display();
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
