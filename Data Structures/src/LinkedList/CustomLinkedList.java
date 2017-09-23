package LinkedList;

public class CustomLinkedList {

    private static int counter;
    private LinkedListNode head;
    LinkedListNode current = null;

    public CustomLinkedList() {

    }

    public void add(Object... data) {
        for (Object object : data
                ) {
            if (head == null) {
                head = new LinkedListNode(object);
                current = head;
            } else {
                LinkedListNode temp = new LinkedListNode(object);
                current.setNext(temp);
                current = temp;
            }
            incrementCounter();
        }


    }

    public LinkedListNode getHead() {
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

        LinkedListNode current = null;

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
            LinkedListNode current = head.getNext();
            while (current != null) {
                output += "[" + current.getData() + "]";
                current = current.getNext();
            }

        }
        return output;
    }


    public void makeLinkedListCyclic() {
        LinkedListNode headNode = head;
        LinkedListNode currentNode = headNode;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(headNode);
    }
}