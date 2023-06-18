package unit16.SinglyLinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class LinkedListDuplicate {
    public static void duplicate(ListNode head) {
        ListNode current = head;

        while (current != null) {
            ListNode duplicateNode = new ListNode(current.val);
            duplicateNode.next = current.next;
            current.next = duplicateNode;
            current = duplicateNode.next;
        }
    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        head.next = node2;
        node2.next = node3;

        System.out.println("Original List:");
        printList(head);

        duplicate(head);

        System.out.println("List with Duplicates:");
        printList(head);
    }
}

