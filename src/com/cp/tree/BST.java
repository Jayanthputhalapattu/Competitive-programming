package com.cp.tree;

import java.util.*;


public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;

        }
        Node()
        {
            this.data = 0;
            this.left = null;
            this.right = null;
        }


    }
    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void preOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data +  " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root)
        {
            if(root==null)
            {
                return;
            }

            inOrder(root.left);
            System.out.print(root.data +  " ");
            inOrder(root.right);
        }
        public static void levelOrder(Node root)
        {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null)
                    {
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static void postOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +  " ");

        }
        public static int countNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);
            return leftNodes + rightNodes + 1;
        }
        public static int sumOfNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;

        }
        public static  int height(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight,rightHeight) + 1;

        }
        public static  int diameter(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left ) + height(root.right) + 1;

            return Math.max(diam1,Math.max(diam2,diam3));
         }
         public static int sumAtLKthLevel(Node root,int k)
         {
             List<Integer> sums = new ArrayList<>();
             Queue<Node> q = new LinkedList<>();
             q.add(root);
             q.add(null);
             int sum = 0;

             while(!q.isEmpty())
             {

                 Node currNode = q.remove();
                 if(currNode==null)
                 {
                    if(q.isEmpty())
                    {
                        break;
                    }
                 }
                 else{
                    sum+=currNode.data;
                    if(currNode.left!=null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null)
                    {
                        q.add(currNode.right);
                    }
                    if(q.peek()==null)
                    {
                        q.add(null);
                        sums.add(sum);
                        sum = 0;
                    }
                 }
             }
             System.out.println(sums);
             int arr[] = new int[sums.size()];
            for(int i=0;i<sums.size();i++)
            {
               arr[i] = sums.get(i);
            }
             Arrays.sort(arr);

             return arr[sums.size()-k];
         }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        System.out.println(BinaryTree.buildTree(nodes).data);
        Node root = BinaryTree.buildTree(nodes);
        BinaryTree.preOrder(root);
        System.out.println();
        BinaryTree.postOrder(root);
        System.out.println();
        BinaryTree.inOrder(root);
        System.out.println();
        System.out.println();
        BinaryTree.levelOrder(root);

        int count = BinaryTree.countNodes(root);
        int sumOfNodes = BinaryTree.sumOfNodes(root);
        int height = BinaryTree.height(root);
//        int diameter = BinaryTree.diameter(root);
//        System.out.println("Sum : " + sumOfNodes);
//        System.out.println("Height : " + height);
//        System.out.println(count);
//        System.out.println("Diameter :" + diameter);

        int k = BinaryTree.sumAtLKthLevel(root,2);
        System.out.println(k);
    }
}
