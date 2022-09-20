import java.util.Scanner;

 public class LinkedListImplementation {
		static class Node{
			int data;
			Node next; 
			Node(int data){
				this.data=data;
				this.next=null;
			}}
			  Node top=null;
			  Node front=null;
			  Node rear=null;
			  
			void addAtFront() {
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
                        void addAtBack() {
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
			void addAtPosition() {
				System.out.println("enter position");
				Scanner sc =new Scanner(System.in);
				int pos=sc.nextInt();
				System.out.println("enter data");
				int data=sc.nextInt();
				Node newNode = new Node(data);
				int count=1;
				Node temp=top;
				while(count<pos-1)
				{
					temp=temp.next;
					count++;	
				}
				newNode.next=temp.next;
				temp.next=newNode;
				System.out.println("now list is");
				display();
			}
			void display() {
				Node temp=top;
				while(temp!=null) {
					System.out.println(temp.data);
					temp=temp.next;
				}
				if(top==null)
					System.out.println("list is empty");
			}	
		

public static void main(String[] args) {
	int l;
	 List s = new List();
	 Scanner sc = new Scanner(System.in);
	 do {
		 System.out.println("press 1 to Add At Front");
		 System.out.println("press 2 for Add At Back");
		 System.out.println("press 3 for Add At Position");
                 System.out.println("press 4 for display");
		 System.out.println("enter ur choice");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
		 {
			 s.addAtFront();
			 break;
		 }
		 case 2:
		 {
			 s.addAtBack();
			 break;
		 }
		 case 3:
                 {
                         s.addAtPosition();
                         break;
                 }
                 case 4:
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
