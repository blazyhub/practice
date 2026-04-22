class Node{
	int data;
	Node next;


	Node(int data){
		this.data= data;
		this.next=null;
	}
}




class linkedlist3{
	public static void main(String[] args) {
		System.out.println("start");
		// search in linked list

		Node n1= new Node(10);
		Node n2= new Node(20);
		Node n3 = new Node(30);

		n1.next=n2;
		n2.next=n3;

		Node head= n1;
		int key = 20; // value to search

		Node temp = head;
		boolean found = false;


		while(temp!= null){
			if(temp.data==key){
				found = true;
				break;
			}
			temp = temp.next;
		}
		if(found){
			System.out.println("found");
		}
		else{
			System.out.println("not found");
		}

		System.out.println("end");
	}
}