package LinkedList.DoublyLinkedList;

public class CustomTwoWayLinkedList {

    private static int counter;
    private TwoWayNode head;
    TwoWayNode current = null;

    public CustomTwoWayLinkedList() {

    }

    public void add(Object... data) {
        for (Object object : data
                ) {
            if (head == null) {
                head = new TwoWayNode(object);
                current = head;
            } else {
                TwoWayNode temp = new TwoWayNode(object);
                current.setNext(temp);
                current = temp;
                current.setPrevious(head);
            }
            incrementCounter();
        }


    }

    public TwoWayNode getHead() {
        return head;
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }


    public Object get(int index) {
        Object value = null;
        int length = 0;
        if (index < 0)
            return null;

        TwoWayNode current = null;

        if (head != null) {
            current = head;

            if (index == 0) {
                value = current.getData();
            } else {
                while (length != index) {
                    current = current.getNext();
                    length++;
                }
                value = current.getData();
            }


        }
        return value;

    }


    public boolean remove(int index) {


        return false;
    }


    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            output += "[" + head.getData() + "]";
            TwoWayNode current = head.getNext();
            while (current != null) {
                output += "[" + current.getData() + "]";
                current = current.getNext();
            }

        }
        return output;
    }


    public void makeLinkedListCyclic() {
        TwoWayNode headNode = head;
       TwoWayNode currentNode = headNode;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(headNode);
    }
}