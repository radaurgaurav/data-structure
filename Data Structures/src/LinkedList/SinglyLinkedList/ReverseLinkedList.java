package LinkedList.SinglyLinkedList;

public class ReverseLinkedList {

    public static void main(String[] args)
    {
        CustomLinkedList customLinkedList=new CustomLinkedList();
        customLinkedList.add(1,2,3);

        reverseList(customLinkedList);


    }

    private static void reverseList( CustomLinkedList customLinkedList)
    {
       OneWayNode head=customLinkedList.getHead();
       OneWayNode previous=null;
        OneWayNode next=null;
        OneWayNode current=null;
        while(head!=null)
        {
            next=head.getNext();
            head.setNext(previous);
            previous=head;
            head=next;
            current=previous;
        }
        while (current!=null) {
            System.out.println(current.getData());
            current = current.getNext();
        }

    }
}
