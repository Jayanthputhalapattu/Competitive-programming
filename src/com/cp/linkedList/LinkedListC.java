package com.cp.linkedList;




class ListNode {
     int val;
     ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Node{
    int val;
    Node next;

    public Node()
    {
        this.val = 0;
        this.next = null;
    }

    public Node(int data)
    {
        this.val = data;
        this.next = null;
    }

}
public class LinkedListC {
    Node head;

    public LinkedListC()
    {

        this.head = new Node();
    }
    public LinkedListC(Node head)
    {
        this.head = head;
    }

    public void insertFront(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }
    public void printAll()
    {
        Node temp = this.head;
        while(temp!=null)
        {

            System.out.println(temp.val);
            temp = temp.next;

        }

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node.next!=null)
        {
            if(node.val!=node.next.val)
            {
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }

        }
        return head;
    }
    public void insertUsingRecursion(int data,int index,Node temp)
    {
        if(index==1)
        {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;

            return;
        }
        insertUsingRecursion(data,index-1,temp.next);
    }

    public ListNode mergeTwoLinkedLists(ListNode head1,ListNode head2)
    {
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode ans = new ListNode();
        ListNode temp3 = ans;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.val>temp2.val)
            {
                temp3.next =temp2;
                temp2 = temp2.next;
            }
            else{
                temp3.next= temp1;
                temp1 = temp1.next;
            }
  temp3 = temp3.next;
        }

        while(temp1!=null)
        {

            temp3.next = temp1;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }
        while(temp2!=null)
        {
            temp3.next = temp2;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        return ans.next;
    }

    public static void main(String[] args) {
            LinkedListC linkedlist= new LinkedListC(new Node(99));
//            linkedlist.insertFront(22);
//            linkedlist.insertFront(1);
//            linkedlist.insertUsingRecursion(5,2,linkedlist.head);
//            linkedlist.printAll();


       ListNode node1 =new ListNode(1);
       node1.next = new ListNode(10);
       node1.next.next = new ListNode(12);

        ListNode node2 =new ListNode(7);
        node2.next = new ListNode(9);
        node2.next.next = new ListNode(13);
//        System.out.println(node1.next.val);
        ListNode ls = linkedlist.mergeTwoLinkedLists(node1,node2);
        while(ls!=null)
        {
            System.out.println(ls.val);
            ls = ls.next;
        }

    }
}
