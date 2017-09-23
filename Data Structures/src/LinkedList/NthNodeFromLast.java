package LinkedList;

import javax.xml.soap.Node;

public class NthNodeFromLast {

    public static void main(String[] args)
    {
        CustomLinkedList mCustomLinkedList=new CustomLinkedList();
        mCustomLinkedList.add(1,2,3,4,5,6,7,8);

        System.out.println("Last nod from end is "+kthNodeFromLast(3,mCustomLinkedList));
    }

    public static Object kthNodeFromLast(int k, CustomLinkedList customLinkedList)
    {
        LinkedListNode head = customLinkedList.getHead();
         LinkedListNode slow=head;
         LinkedListNode fast=head;
         int count=1;
         while(fast.getNext()!=null)
         {
             fast=fast.getNext();
             count++;
             if(count>k)
             {
                 slow=slow.getNext();

             }

         }
         return slow.getData();
    }
}
