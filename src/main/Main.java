package main;

import binarysearchtree.MyBinarySearchTree;

public class Main
{
    public static void main(String[] args)
    {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(100);
        bst.insert(50);
        bst.insert(150);
        bst.insert(75);
        bst.insert(25);
        bst.insert(125);
        bst.insert(175);
        bst.traversePreOrder(bst.getRoot());
        System.out.println();
        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        bst.traversePostOrder(bst.getRoot());

    }
}
