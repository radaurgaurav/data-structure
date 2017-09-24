package LinkedList.SinglyLinkedList;


public class CustomLinkedList {

    private static int counter;
    private OneWayNode head;
    OneWayNode current = null;

    public CustomLinkedList() {

    }

    public void add(Object... data) {
        for (Object object : data
                ) {
            if (head == null) {
                head = new OneWayNode(object);
                current = head;
            } else {
                OneWayNode temp = new OneWayNode(object);
                current.setNext(temp);
                current = temp;
            }
            incrementCounter();
        }


    }

    public OneWayNode getHead() {
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

        OneWayNode current = null;

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
            OneWayNode current = head.getNext();
            while (current != null) {
                output += "[" + current.getData() + "]";
                current = current.getNext();
            }

        }
        return output;
    }


    public void makeLinkedListCyclic() {
       OneWayNode headNode = head;
       OneWayNode currentNode = headNode;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(headNode);
    }
}