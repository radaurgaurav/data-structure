package LinkedList;

public  class LinkedListNode {

    LinkedListNode next;
    Object data;


    public LinkedListNode(Object dataValue) {
        next = null;
        data = dataValue;
    }



    public Object getData() {
        return data;
    }


    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode nextValue) {
        next = nextValue;
    }

}

