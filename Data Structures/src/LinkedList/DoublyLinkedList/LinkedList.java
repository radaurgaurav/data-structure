package LinkedList.DoublyLinkedList;

public class LinkedList {

    public static void main(String[] args)
    {
        CustomTwoWayLinkedList twoWayLinkedList=new CustomTwoWayLinkedList();
        twoWayLinkedList.add(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Two Way Linked List is "+twoWayLinkedList);

        TwoWayNode twoWayNode = twoWayLinkedList.get(2);

        System.out.println("Node at index 2 is "+ twoWayNode.getData());
        System.out.println("previous Node to index 2 Node  is "+ twoWayNode.getPrevious().getData());
        System.out.println("Next Node to  index 2 Node  is "+ twoWayNode.getNext().getData());


    }
}
