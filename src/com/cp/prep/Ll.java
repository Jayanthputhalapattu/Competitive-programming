package com.cp.prep;
//
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
public class Ll {
        Node head;
        public void Ll(int data)
        {
            head = new Node(data);
        }
        public Node reverse(Node head)
        {if(head==null || head.next==null)
        {
            return head;
        }
            Node ans = reverse(head.next);
            head.next.next = head;
            head.next = null;

            return ans;
        }

}
