package LinkedList.SinglyLinkedList;

public class OneWayNode {

    OneWayNode next;
    Object data;


    public OneWayNode(Object dataValue) {
        next = null;
        data = dataValue;
    }


    public Object getData() {
        return data;
    }


    public OneWayNode getNext() {
        return next;
    }

    public void setNext(OneWayNode nextValue) {
        next = nextValue;
    }

}

