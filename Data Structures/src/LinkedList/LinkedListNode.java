package LinkedList;

public  class LinkedListNode {

    LinkedListNode next;
    Object data;


    public LinkedListNode(Object dataValue) {
        next = null;
        data = dataValue;
    }

    @SuppressWarnings("unused")
    public LinkedListNode(Object dataValue, LinkedListNode nextValue) {
        next = nextValue;
        data = dataValue;
    }

    public Object getData() {
        return data;
    }

    @SuppressWarnings("unused")
    public void setData(Object dataValue) {
        data = dataValue;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode nextValue) {
        next = nextValue;
    }

}

