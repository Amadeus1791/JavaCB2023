package unit16.SinglyLinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    //insert
    // 1. [ ]   --->  [1]
    // 2. [1]   --->  [1,2]

    public void addLast(int item) {
        Node newNode = new Node(item);
        // 1. [ ]
        if (isEmpty()) {
            head = tail = newNode;
            // tail= newNode;
        } else {
            // 2. [1]
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void addFirst(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    // 1. [] ===>remove
    // 2. [1] ==>
    // 3. [1,2]
    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalArgumentException("You cannot remove from an empty list");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            // 1. remove link to last node
            current.setNext(null);
            // 2. set new tail
            tail = current;
        }
        size--;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalArgumentException("You cannot remove from an empty list");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.getNext();
        }
        size--;

    }


    // [2143,345,456,34] ==> indexOf(34) -> 3
    //                   ==>indexOf(8) -> -1
    public int indexOf(int valueOfNode) {
        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (current.getValue() == valueOfNode) {
                return currentIndex;
            }
            current = current.getNext();
            currentIndex++;
        }
        return -1;
    }

    // [2143,345,456,34] ==> valueOf(2) -> 456
    //                   ==>valueOf(8) -> IllegalArgumentException
    public int valueOf(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                return current.getValue();
            }
            current = current.getNext();
            currentIndex++;
        }
        throw new IllegalArgumentException("no valid index");

    }

    public void printList() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.getValue());
            // ALTERNATIVE: if (current.getNext() != null) {
            if (current != tail) {
                System.out.print(", ");
            }
            current = current.getNext();
        }
        System.out.println("]");
    }

   // [1,2] ==> [1,1,2,2]
    // [1,1,3] ==> [1,1,1,1,3,3]
    private boolean isEmpty() {
        return head == null;
    }


}
