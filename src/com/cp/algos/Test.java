package com.cp.algos;

class A{
    public void print()
    {
        System.out.println("Parent");
    }
}
class B extends A{
        @Override
        public void print()
        {
            System.out.println("child");
        }
}
public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
