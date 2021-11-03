package cc15;

import java.util.ArrayList;

public class BinarySearchTree {
    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < (int)current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > (int)current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public boolean Contains(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == (int)current.value) {
            return true;
        }
        return value < (int)current.value
                ? Contains(current.left, value)
                : Contains(current.right, value);
    }

    public boolean containsNode(int value) {
        return Contains(root, value);
    }
    public int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = (int)node.value;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

public ArrayList<Integer> breadthFirst(Node node){
        ArrayList<Integer> breadthFirstArrList=new ArrayList<Integer>();
    breadthFirstArrList.add((int)node.value);
    breadthFirstArrList.add((int)node.left.value);
    breadthFirstArrList.add((int)node.right.value);
    breadthFirst(node.left);
    breadthFirst(node.right);


    return breadthFirstArrList;
}

    public void fizzBuzzTree(Node node){
        int value = (int)node.value;
        fizzBuzzTree(node.left);
         fizzBuzzTree(node.right);

        if (value%3==0)
            node.value="Fizz";
        if (value%5==0)
            node.value="Buzz";
        if (value%5==0&&value%3==0)
            node.value="FizzBuzz";

    }

    public String toString(Node node){
        String tree="";
        tree+=node.value;
        toString(node.left);
        toString(node.right);
        return tree;
    }

}
