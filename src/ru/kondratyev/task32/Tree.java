package ru.kondratyev.task32;

public class Tree {

    Node root;

    public Node find(int key) {
        Node current = root;
        while (current.key != key) {
            if (current.key < key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }


    public void insert(int key, String data) {
        Node node = new Node();
        node.key = key;
        node.data = data;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node prev = null;
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

    public void findSheet(Node startNode) {
        if (( startNode.leftChild != null ) & ( startNode.rightChild != null )) {
            findSheet(startNode.leftChild);
            findSheet(startNode.rightChild);
        } else {
            if (( startNode.leftChild != null ) & ( startNode.rightChild == null )) {
                findSheet(startNode.leftChild);
            } else {
                if (startNode.rightChild != null) {
                    findSheet(startNode.rightChild);
                } else {
                    System.out.println(startNode);
                }

            }
        }
    }

    public static void main(String[] args) {
        ru.kondratyev.task32.Tree tree = new ru.kondratyev.task32.Tree();
        tree.insert(3, "a");
        tree.insert(8, "b");
        tree.insert(1, "c");
        tree.insert(2, "d");
        tree.insert(5, "e");
        tree.insert(7, "f");
        tree.insert(4, "g");
        tree.insert(0, "h");
        Node findJohn = tree.find(3);
        tree.findSheet(findJohn);
    }
}



