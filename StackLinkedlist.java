package miniproject;

public class StackLinkedlist {
		class Node{
	 int data;
	 Node next;
	 Node(int data){
		this.data=data;
		this.next=null;
	 }
		}
		Node head=null;
		void insert(int value) {
			Node newNode=new Node(value);
			if(head==null)
			{
				head=newNode;
			}
			else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
		}
		void insertfront(int value) {
			Node newNode=new Node(value);
			if(head==null)
			{
				head=newNode;
			}
			else {
				newNode.next=head;
				newNode=head;
			}
		}
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.println(temp.data+"->");
				temp=temp.next;
			} 
			System.out.println("null");
		}
		public static void main(String[] args) {
			StackLinkedlist s1=new StackLinkedlist();
			s1.insertfront(76);
			s1.insert(12);
			s1.insert(8);
			s1.insert(67);
			s1.display();
		}
	}


