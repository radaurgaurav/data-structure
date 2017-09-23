package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args)
    {
        CustomLinkedList customLinkedList=new CustomLinkedList();
        customLinkedList.add(1,2,3);

        reverseList(customLinkedList);


    }

    private static void reverseList( CustomLinkedList customLinkedList)
    {
        LinkedListNode head=customLinkedList.getHead();
        LinkedListNode previous=null;
        LinkedListNode next=null;
        LinkedListNode current=null;
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
