import java.util.Scanner;

public class QueueImplementation {

    static class Node{
        int data;
        Node next;
        Node(int data){
                this.data=data;
                this.next=null;
        }}
              Node front=null;
	      Node rear=null;

	void enqueue(int data) {

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
         q.enqueue(70);
         q.enqueue(30);
         q.enqueue(56);
         q.display();

}
}
