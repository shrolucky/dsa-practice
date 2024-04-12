package com.lucky.dsa;

class ListNode {
    public int val;
    public ListNode next;
    
    ListNode(int x) {
        this.val = x;
        this.next = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}