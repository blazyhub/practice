class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;

	}
}







class linkedlist5{
	public static void main(String[] args) {


		Node n1 = new Node(10);
		Node n2= new Node(20);
		Node n3= new Node(30);

		n1.next=n2;
		n2.next=n3;

		Node head = n1;

		Node current= head;
		Node prev = null;


		while(current!=null){
			Node next = current.next;
			current.next= prev;
			prev= current;
			current=next;
		}
		head = prev;


		Node temp =head;
		while(temp!=null){
			System.out.println(temp.data+"->");
			temp=temp.next;
		}


		
	}
}