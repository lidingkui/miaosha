package com.dataplay.data;

public class AddElmentsInLinkedList<E> {

    private class Node {
        private Node next;
        private E e;

        public Node(Node next, E e) {
            this.next = next;
            this.e = e;
        }

        public Node(E e) {
            this(null, e);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    private int size;

    public AddElmentsInLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpety() {
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
            for (int i = 0; i < index; i++) {
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


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        for(Node cur = head ; cur != null ; cur = cur.next)
            res.append(cur + "->");
        res.append("NULL");
        return res.toString();
    }

    public static void main(String[] args) {
        AddElmentsInLinkedList<Integer> list = new AddElmentsInLinkedList<>();
        for (int i = 0; i < 3; i++) {
            list.addFirst(i);
        }
        System.out.println(list);
    }

}
