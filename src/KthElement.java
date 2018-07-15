public class KthElement {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(11);
        head.next.next.next.next.next = new Node(15);
        System.out.println(kth(head, 4));
    }

    static void print(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

    static int kth(Node head, int k) {
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k; i++) {
            if (ptr1 == null) {
                return 0;
            }
            ptr1 = ptr1.next;
        }
            while (ptr1 != null) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        return ptr2.value;
    }
}

class Node {
    int value;
    Node next;
    Node(int v) {
        value = v;
    }
}
