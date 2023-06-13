package a2_linkedlist;

public class DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        Tools.printList(myLinkedList.head);
        myLinkedList.addAtTail(3);
        Tools.printList(myLinkedList.head);
        myLinkedList.addAtIndex(1, 2);    // 链表变为 1->2->3
        Tools.printList(myLinkedList.head);

        int element = myLinkedList.get(1);              // 返回 2
        System.out.println(element);
        myLinkedList.deleteAtIndex(1);    // 现在，链表变为 1->3
        Tools.printList(myLinkedList.head);
        element = myLinkedList.get(1);              // 返回 3
        System.out.println(element);

    }
}

class MyLinkedList {
    ListNode head = null;
    int length = 0;

    public MyLinkedList() {

    }

    public int get(int index) {
        if (index >= length) {
            return -1;
        }
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        if (head == null) {
            head = new ListNode(val);
            length++;
            return;
        }
        ListNode newHead = new ListNode(val, head);
        head = newHead;
        length++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new ListNode(val);
            length++;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(val);
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index >= length) {
            return;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        head = dummy.next;
        length++;
    }

    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy, curr = dummy.next;
        for (int i = 0; i < index; i++) {
            pre = curr;
            curr = curr.next;
        }
        pre.next = curr.next;
        head = dummy.next;
        length--;
    }
}
