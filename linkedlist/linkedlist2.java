
// printhing the data until it become null 

	class Node{
		int data;
		Node next;


		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

class linkedlist2{

	public static void main(String[] args) {

		Node n1 = new Node(10);
		Node n2= new Node(20);
		Node n3= new Node(30);

		n1.next=n2;
		n2.next=n3;

		Node head = n1;

		//traversal

		Node temp = head;


		while(temp != null){
			System.out.println(temp.data + "->");
			temp=temp.next;

		}
		System.out.println("null");
		
	}
}