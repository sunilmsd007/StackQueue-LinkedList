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
		 System.out.println("press 3 for display");
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
