package com.cp.queuesAndStacks;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack()
    {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item)
    {
        first.push(item);
    }
    public int remove() throws Exception
    {
        while (!first.isEmpty())
        {
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return removed;
    }
    public boolean isEmpty()
    {
        return first.isEmpty();
    }
    public int peek() throws Exception{
        while (!first.isEmpty())
        {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return peeked;
    }
    public void display()
    {

    }
    public static void main(String[] args) throws Exception{
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(12);
        queue.add(13);
        queue.add(14);

        System.out.println(queue.peek());


    }
}
