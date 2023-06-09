package com.cp.linkedList;

import java.util.List;

class LL{
    ListNode head ;
    public LL()
    {
        this.head = null;
    }
    public LL(int data)
    {
        this.head.val = data;

    }
    public void reverseIterative()
    {
        ListNode prev = null;
        ListNode present = this.head;
        ListNode next  = present.next;
        while(present!=null)
        {
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null)
            {
                next = next.next;
            }
        }
            this.head = prev;
//        System.out.println(head.val);
    }
    public LL(ListNode head)
    {
        this.head = head;
    }

    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null )
        {

                return head;
        }

        ListNode ans = reverse(head.next);
//        System.out.println(ans.val);
        head.next.next = head;
        head.next = null;
        return ans;


    }
   public void insertEnd(int data)
    {
        ListNode temp = this.head;
        while(temp.next!=null)
        {
//            System.out.println(temp.val);
            temp = temp.next;
        }
        temp.next = new ListNode(data);
    }
    public void printAll(ListNode head)
    {
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = lists[0];
        for(int i =0;i<lists.length-1;i++)
        {
            ListNode a = ans;
            ListNode b = lists[i];

            while (a!=null && b!=null) {
                if (a.val < b.val) {

                    ans.next = a;
                    a = a.next;
                } else {
                    ans.next = b;
                    b = b.next;
                }
                ans = ans.next;

            }
                 while(a!=null)
                 {
                    ans.next = a;
                    a = a.next;
                    ans = ans.next;
                 }
                 while(b!=null)
                 {
                    ans.next = b;
                    b = b.next;
                    ans = ans.next;
                 }
            }
        return ans;
    }
    public ListNode getMiddleLinkedList(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = slow;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            prev  = slow;
            slow  = slow.next;

        }
        prev.next = null;
        return slow;
    }
    public ListNode sort(ListNode head)
    {
//        System.out.println("hello");
        if(head==null || head.next ==null)
        {
            return head;
        }
//        System.out.println("Hello");
        ListNode mid = getMiddleLinkedList(head);

        ListNode first = sort(head);
        ListNode second = sort(mid);
        return merge(first,second);
    }
    public ListNode merge(ListNode head1,ListNode head2)
    {

        ListNode ans = new ListNode();
        ListNode temp3 = ans;

        while(head1!=null && head2!=null)
        {
            if(head1.val>head2.val)
            {
                temp3.next =head2;
                head2 = head2.next;
            }
            else{
                temp3.next= head1;
                head1 = head1.next;
            }
            temp3 = temp3.next;
        }

        temp3.next = (head1!=null ) ? head1 : head2;
        return ans.next;
    }
}
public class CycleLinkedList {
    static boolean cycleListOrNot(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            fast =  fast.next.next;
            slow = slow.next;
            if(fast==slow)
            {
                return true;
            }
        }

        return false;
    }
    static int countCycle(ListNode head)
    {
        ListNode f = head;
        ListNode s  = head;

        while(f!=null && f.next!=null)

        {
                f = f.next.next;
                s = s.next;
                ListNode temp = s;
                if(f==s)
                {
                    int count = 0;
                    do {
                        s =  s.next;
                        count++;
//                        System.out.println("Hello");
                    }
                    while(temp!=s);
                    return count;
                }


        }
        return 0;
    }
    static ListNode findCycleStart(ListNode head)
    {
        ListNode f = head;
        ListNode s = head;

        int length = countCycle(head);
        for(int i=0;i<length;i++)
        {
            s = s.next;
        }
        while(f!=s)
        {
            s = s.next;
            f = f.next;
        }
        return s;
    }

    public static  void main(String args[])
    {
            ListNode head1 = new ListNode(10);
        LL l1 = new LL(head1);
        l1.insertEnd(12);
        l1.insertEnd(45);
        l1.insertEnd(20);
        l1.insertEnd(34);
//        l1.insertEnd(8);

        l1.printAll(head1);


        System.out.println("The cycle length : " + countCycle(head1));

        System.out.println("is cycle or not : "  + cycleListOrNot(head1));
        System.out.println(findCycleStart(head1).val  + " : is the start of cycle");


        //Middle of the LinkedList
//        System.out.println(l1.getMiddleLinkedList(head1).val);


        //sort the linkedlist
        System.out.println("<====== After sorting =====>");
        l1.printAll(l1.sort(head1));

//        System.out.println(head1.val);
//        l1.reverse(head1);
//        System.out.println("<====After reversing =====>");
        ListNode ans = l1.reverse(head1);
//        l1.printAll(ans);
//        System.out.println(head1.next.val + " hello 11");
        l1.reverseIterative();
        System.out.println("<==After iterative reversal");
//        System.out.println(l1.head.val);
        l1.printAll(l1.head);

    }

}
