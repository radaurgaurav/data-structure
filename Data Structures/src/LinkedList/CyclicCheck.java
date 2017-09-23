package LinkedList;

public class CyclicCheck {
    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(1, 2, 3, 4, 5, 6, 7);
        customLinkedList.makeLinkedListCyclic();

        System.out.println("Linked List is Cyclic : "+ isCyclic(customLinkedList));
    }

    private static boolean isCyclic(CustomLinkedList customLinkedList)
    {
        LinkedListNode slow = customLinkedList.getHead();
        LinkedListNode fast=slow;
        while(fast!=null && fast.getNext()!=null)
        {
            fast=fast.getNext().getNext();
            slow=slow.getNext();

            if(fast==slow)
                return true;
        }
        return false;
    }
}
