package LinkedList;

/**
 * program to find middle of linked list using two pointers
 */
public class MiddleOfLinkedList {

    public static void main(String args[]) {

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(1,2,3,4,5,6);


        /**
         * find middle of linked list using two pointers
         */
        LinkedListNode head = customLinkedList.getHead();
        int counter = 0;


        LinkedListNode current = head;
        LinkedListNode middle = head;

        while (current.getNext() != null) {
            counter++;

            if (counter % 2 == 0) {
                middle = middle.getNext();
            }
            current = current.getNext();
        }
        if (counter % 2 == 1) {
            middle = middle.getNext();
        }

        System.out.println("length of LinkedList: " + counter);
        System.out.println("middle element of LinkedList : " + middle.getData());


    }
}
