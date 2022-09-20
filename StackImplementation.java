public class StackImplementation {

    static class Node{
        int data;
        Node next;
        Node(int data){
                this.data=data;
                this.next=null;
        }}
          Node top=null;

   void push(int data) {

        Node newNode=new Node(data);
        if(top==null) {
                top=newNode;
        }
        else {
                newNode.next=top;
                top=newNode;
        }
   }
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
         s.push(70);
         s.push(30);
         s.push(56);
         s.display();

}
}
