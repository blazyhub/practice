
class Node{
	int data;
	Node next;


	Node(int data){
		this.data =data;
		this.next=null;
	}
}


class linkedlist1{

	public static void main(String[] args) {

		System.out.println("satrting");
		Node n1= new Node(20);

		Node n2 = new Node(30);
		n1.next=n2;
		Node n3= new Node(40);
		n2.next=n3;


		System.out.println(n1.data);
		System.out.println(n1.next.next.data);


		System.out.println("ending");
		
	}
}