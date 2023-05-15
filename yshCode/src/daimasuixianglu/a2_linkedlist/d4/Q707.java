package daimasuixianglu.a2_linkedlist.d4;

import java.util.LinkedList;
import java.util.List;

public class Q707 {

    private List<Integer> list;

    public Q707() {
        list = new LinkedList<>();
    }

    public int get(int index) {
        if(index < 0 || index >= list.size())
            return -1;
        return list.get(index);
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(list.size(), val);
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > list.size())
            return;
        list.add(index,val);
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= list.size())
            return;
        list.remove(index);
    }

}
