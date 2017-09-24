package LinkedList.DoublyLinkedList;

public class TwoWayNode {
    TwoWayNode previous;
    TwoWayNode next;
    Object data;


    public TwoWayNode(Object dataValue) {
        next = null;
        previous = null;
        data = dataValue;
    }


    public Object getData() {
        return data;
    }


    public TwoWayNode getNext() {
        return next;
    }

    public TwoWayNode getPrevious() {
        return previous;
    }

    public void setNext(TwoWayNode nextValue) {
        next = nextValue;
    }

    public void setPrevious(TwoWayNode previousValue) {
        previous = previousValue;
    }


}

