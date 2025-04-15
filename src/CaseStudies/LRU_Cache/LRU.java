package CaseStudies.LRU_Cache;

import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
    }
}

public class LRU {
    private final int capacity = 3;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRU() {
        map = new HashMap<>();
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    public void add(int data) {
        // If exists, remove the old one
        if (map.containsKey(data)) {
            remove(map.get(data));
        }
        if (map.size() == capacity) {
            // Remove LRU from tail.prev
            map.remove(tail.prev.data);
            remove(tail.prev);
        }

        Node newNode = new Node(data);
        insertToFront(newNode);
        map.put(data, newNode);
    }

    private void insertToFront(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }

    private void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void display() {
        Node current = head.next;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRU lru = new LRU();
        lru.add(10);
        lru.add(20);
        lru.add(30);
        lru.display(); // 30 20 10

        lru.add(40);   // removes 10
        lru.display(); // 40 30 20

        lru.add(30);   // moves 30 to front
        lru.display(); // 30 40 20
    }
}
