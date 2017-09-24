package LinkedList.SinglyLinkedList;

/**
 * program to create linked list
 */
public class LinkedList {

    public static void main(String args[]) {

        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(1,2,3,4,5,6,7,8);



        System.out.println("Print: customLinkedList: " + customLinkedList);
        System.out.println("Print: Element at specified position : " + customLinkedList.get(2));

    }
}

