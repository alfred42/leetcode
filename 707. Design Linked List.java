class MyLinkedList {
    private ListNode head;
    private int size;

    public MyLinkedList() {
        head = new ListNode(0, null);
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode p = head;

        while (index >= 0) {
            p = p.next;
            index--;
        }

        return p.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
        return;
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
        return;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;

        ListNode p = head;

        while (index > 0) {
            p = p.next;
            index--;
        }

        ListNode temp = new ListNode(val, p.next);
        p.next = temp;

        size++;

        return;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < size) {
            ListNode p = head;

            while (index > 0) {
                p = p.next;
                index--;
            }

            p.next = p.next.next;

            size--;
        }

        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */