package com.cp.queuesAndStacks;

public class CustomQueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 5;
    int ptr = 0;
    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[ptr++]   = item;

        return true;
    }
    public int remove() throws Exception
    {
        int removed = data[0];
        if(isEmpty())
        {
            throw new Exception("Queue is empty...");
        }
        for(int i=1;i<=ptr;i++)
        {
            data[i-1] = data[i];
        }
        data[ptr--] = 0;

        return removed;
    }
    public void printQueue()
    {
        for(int i=0;i<ptr;i++)

        {
            System.out.println(data[i]);
        }
    }
    public boolean isEmpty()
    {
        if(ptr==0){
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        if(ptr==data.length)
        {
            return true;
        }
        return false;
    }

    public static void main(String args[]) throws Exception
    {
            CustomQueue queue = new CustomQueue();
            queue.insert(10);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        System.out.println("===>Before deleting===>");
        queue.printQueue();
        System.out.println("<===After deleting ===>");
        queue.remove();
//        System.out.println();
        queue.printQueue();
    }

}
