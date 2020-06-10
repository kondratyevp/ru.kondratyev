package ru.kondratyev.task32;

public class Node {
    public int key;
    public String data;
    public ru.kondratyev.task32.Node leftChild;
    public ru.kondratyev.task32.Node rightChild;

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", data='" + data + '\'' +
                '}';
    }
}

