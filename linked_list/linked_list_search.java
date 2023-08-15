package linked_list;

import java.util.*;

class linked_list_search {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

public void addNode(int data){
    Node newNode = new Node(data);
}