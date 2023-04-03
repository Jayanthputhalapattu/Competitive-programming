package com.cp.queuesAndStacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE =6;
    int ptr = 0;
    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
        this.data = new int[size];
    }
    public boolean push(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Stack is full");
        }
        data[ptr++] = item;
        return true;
    }
    public int pop()
    {
        return data[ptr--];
    }
    public boolean isFull()
    {
        if(ptr==data.length)
        {
            return true;
        }
        return false;
    }
    public void printStack()
    {
        for(int i=0;i<ptr;i++)
        {
            System.out.print(data[i]+ " ");
        }
    }
    public static void main(String args[]) throws Exception
    {
            CustomStack stack = new CustomStack();
            stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);stack.push(5);
        stack.pop();
//        stack.push(8);

  stack.printStack();




    }
}
