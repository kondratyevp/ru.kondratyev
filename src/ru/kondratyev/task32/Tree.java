package ru.kondratyev.task32;

public class Tree {

    private Node root;

    public void insert(int key, String data) {
        Node node = new Node();
        node.key = key;
        node.data = data;
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        Node prev;
        while (true) {
            prev = current;
            if (key < prev.key) {
                current = current.leftChild;
                if (current == null) {
                    prev.leftChild = node;
                    return;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    prev.rightChild = node;
                    return;
                }
            }
        }
    }

    private static int isLeaf(Node node) {
        if (node == null)
            return 0;
        if (node.leftChild == null && node.rightChild == null)
            return 1;
        return 0;
    }

    private static int countLeavesRecurs(Node node) {
        if (node == null)
            return 0;
        return isLeaf(node.leftChild) + isLeaf(node.rightChild)
                + countLeavesRecurs(node.leftChild) + countLeavesRecurs(node.rightChild);

    }

    public int countLeaves() {
        return countLeavesRecurs(root);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(3, "a");
        tree.insert(8, "b");
        tree.insert(1, "c");
        tree.insert(2, "d");
        tree.insert(5, "e");
        tree.insert(7, "f");
        tree.insert(4, "g");
        tree.insert(0, "h");
        tree.insert(9, "i");
        final int leaves = tree.countLeaves();
        System.out.println("The tree have " + leaves + " leaves");
    }
}



