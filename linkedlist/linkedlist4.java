class Node{
	int data;
	Node next;


	Node(int data){
		this.data=data;
		this.next=null;
	}
}


class linkedlist4{
	public static void main(String[] args) {


		System.out.println("start");


		Node n1= new Node(10);
		Node n2= new Node(20);
		Node n3 = new Node(30);

		n1.next=n2;
		n2.next=n3;


		Node head=n1;

		Node newnode = new Node(5);


		newnode.next=head;    //here we are just assuming new value shlud be frst and next number shld be head which is prev number

		head = newnode;//  now we are assi=uming the head as newnode


		// display

		Node temp = head;

		while(temp!=null){
			System.out.print(temp.data +"->");
			temp=temp.next;
		}
		System.out.println("null");







		System.out.println("end");
		
	}
}