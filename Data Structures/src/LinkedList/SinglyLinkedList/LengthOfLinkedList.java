package LinkedList.SinglyLinkedList;


/**
 * class to find length of linked list
 */
public class LengthOfLinkedList {

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(1, 2, 3, 4, 5, 6, 7);


        System.out.println("Length of linked list is : " + iterativeWay(customLinkedList.getHead()));

        System.out.println("Length of linked list is : " + recursiveWay(customLinkedList.getHead()));
    }

    private static int iterativeWay(OneWayNode node) {
        OneWayNode currentNode=node;
        int length = 0;
        if (currentNode != null) {
            length++;
            while (currentNode.getNext() != null) {
                length++;
                currentNode=currentNode.getNext();
            }
        }
        return length;
    }

    private static int recursiveWay(OneWayNode node) {
        if(node == null){ //base case
            return 0;
        }
        return 1+recursiveWay(node.getNext());

    }
}
