class InsertAtPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create nodes
        Node n1 = new Node(10);   // node1 created
        Node n2 = new Node(20);   // node2 created
        Node n3 = new Node(30);   // node3 created

        // Step 2: Connect nodes
        n1.next = n2;             // 10 → 20
        n2.next = n3;             // 20 → 30

        Node head = n1;           // head → 10

        // Step 3: Define position and value
        int pos = 3;              // insert at position 3
        int value = 25;

        // Step 4: Create new node
        Node newNode = new Node(value); // newNode → 25

        // Step 5: Check if inserting at beginning
        if (pos == 1) {
            newNode.next = head; // connect new node to head
            head = newNode;      // move head
        } else {

            // Step 6: Start traversal
            Node temp = head;    // temp → 10

            // Step 7: Move to (pos-1) node
            for (int i = 1; i < pos - 1; i++) {

                temp = temp.next;  
                // i=1 → temp moves from 10 → 20
            }

            // Now temp → 20 (position 2)

            // Step 8: Connect new node to next node
            newNode.next = temp.next;  
            // 25 → 30

            // Step 9: Connect previous node to new node
            temp.next = newNode;       
            // 20 → 25

        }

        // Step 10: Display list
        Node t = head;           // start from head

        while (t != null) {
            System.out.print(t.data + " -> "); // print current node
            t = t.next;                        // move forward
        }

        System.out.println("null");
    }
}