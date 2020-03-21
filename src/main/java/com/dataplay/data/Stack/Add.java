package com.dataplay.data.Stack;

public class Add<E> {
    private class Node {
        private Node next;
        private E e;

        public Node(Node next, E e) {
            this.next = next;
            this.e = e;
        }

        public Node(E e) {
            this(null,e);
        }

        public Node() {
            this(null, null);
        }

        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    private int size;

    public Add() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        Node node = new Node(e);
        node.next = head;
        head = node;
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("error");
        }
        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index-1; i++) {
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }


    public void addLast(E e) {
        add(size, e);
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        for(Node cur = head ; cur != null ; cur = cur.next)
            res.append(cur + "->");
        res.append("NULL");

        return res.toString();
    }

    public static void main(String[] args) {
        Add<Integer> add = new Add<>();
        for (int i = 0; i < 3; i++) {
            add.addLast(i);
        }
        System.out.println(add);
    }
}
