package com.cp.linkedList;

class LLnew extends LL{
    LLnew()
    {
        this.head = null;
    }
    LLnew(int data)
    {
        super(data);
//        this.head.val = data;
    }
    LLnew(ListNode head)
    {
        this.head = head;
    }
    public boolean isPalindrome(ListNode head)
    {
        ListNode mid = getMiddleLinkedList(head);
        ListNode reversed = reverse(mid);
        ListNode reReversed = reversed;
        ListNode headFirst = head;
        while(head!=null && reversed!=null)
        {
            if(head.val!=reversed.val)
            {
                break;
            }

            head = head.next;
            reversed = reversed.next;
        }
//        printAll(this.head
        ListNode ar  = reverse(reReversed);
        while(headFirst.next!=null)
        {
            headFirst = headFirst.next;
        }
        headFirst.next = ar;
        return head==null || reversed==null;

    }

    public void reverseBetweenRange(int left,int right)
    {
        ListNode prev = null;
        ListNode current = this.head;
        for(int i=0;current!=null &&i<left-1;i++)
        {
            prev = current;
            current = current.next;
//            prev = prev.next;
        }
        ListNode endofLeft = prev;
        ListNode startingOfRange = current;


        //reverse between the range
        ListNode next = current.next;


        for(int i=0;current!=null && i<right - left  + 1 ;i++)
        {
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null)
            {
                next = next.next;
            }
        }
        if(endofLeft!=null)
        {
            endofLeft.next = prev;
        }
        else
                this.head = prev;
        startingOfRange.next = current;
    }
}
public class LLmoreQs {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        LLnew linkedlist = new LLnew(head);
        linkedlist.insertEnd(2);
        linkedlist.insertEnd(3);
        linkedlist.insertEnd(4);
        linkedlist.insertEnd(5);
        linkedlist.insertEnd(6);
        linkedlist.insertEnd(7);
//        linkedlist.insertEnd(2);

//        linkedlist.printAll(linkedlist.head);

//        System.out.println( linkedlist.isPalindrome(linkedlist.head));
//        linkedlist.printAll(linkedlist.head);

        linkedlist.reverseBetweenRange(2,5);
        linkedlist.printAll(linkedlist.head);

    }
}
