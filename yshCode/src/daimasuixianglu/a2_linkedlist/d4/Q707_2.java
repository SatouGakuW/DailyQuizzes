package daimasuixianglu.a2_linkedlist.d4;


public class Q707_2 {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private int size;
    ListNode head;

    public Q707_2() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        ListNode cur = head;
        for (int i = 0; i <= index; i++)
            cur = cur.next;
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size || index < 0)
            return;
        size++;
        ListNode pre = head;
        for(int i = 0; i < index; i++){
            pre = pre.next;
        }
        ListNode addNode = new ListNode(val);
        addNode.next = pre.next;
        pre.next = addNode;

    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size )
            return;
        ListNode pre = head;
        size--;
        for(int i = 0; i < index; i++)
            pre = pre.next;
        pre.next = pre.next.next;
    }

}
