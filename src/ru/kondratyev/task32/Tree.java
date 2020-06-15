package ru.kondratyev.task32;

public class Tree {

    Node root;
    int i = 0;

    public void insert(int key, String data) {
        Node node = new Node();
        node.key = key;
        node.data = data;
        if (root == null) {
            root = node;
        } else {
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
    }

    public int countLeaves(Node startNode) {
        if (startNode.leftChild != null) {
            countLeaves(startNode.leftChild);
            if (startNode.rightChild != null)
                countLeaves(startNode.rightChild);
        } else {
            i++;
        }
        return i;
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
        final int leaves = tree.countLeaves(tree.root);
        System.out.println("The tree have " + leaves + " leaves");
    }
}



