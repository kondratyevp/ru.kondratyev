package ru.kondratyev.task32;

public class Node {
    public int key;
    public String data;
    public Node leftChild;
    public Node rightChild;

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", data='" + data + '\'' +
                '}';
    }
}

