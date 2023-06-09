package com.cp.interviewPrepPS;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class LinkedList{
    Node head;
    LinkedList(Node head)
    {
        this.head = head;
    }
    public Node reverseRecursion(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node ans = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
//        System.out.println(display());
//        display();
        this.head= ans;
        return ans;
    }

    public Node middleLinkedList(Node head)
    {
        Node fast = head;
        Node slow = head;
        Node prev = slow;

        while(fast!=null && fast.next!=null )
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }
        prev.next = null;
        this.head = slow;
        return slow;
    }
    public void insertEnd(int data)
    {
        Node temp = head;
        while (temp.next!=null)
        {
            temp = temp.next;

        }
        temp.next = new Node(data);
    }
    public void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insertUsingrecursion(int data,int index,Node temp)
    {

        if(index==1)
        {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            return;
        }
        insertUsingrecursion(data,index-1,temp.next);
    }
    public void reverseIterative(Node head)
    {
        Node current =this.head;
        Node next = current.next;
        Node prev = null;
        while(current!=null)
        {
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null)
            {
                next = next.next;
            }
        }
        this.head = prev;
    }

}
public class LinkedLists {

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList(new Node(1));
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertUsingrecursion(4,3,ll.head);
//        ll.reverseIterative(ll.head);
        Node newNode = ll.reverseRecursion(ll.head);
       newNode =  ll.middleLinkedList(ll.head);
        ll.display(newNode);
    }
}
