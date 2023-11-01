package AH6;

import java.util.ArrayList;
import java.util.List;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static <T> List<T> linkedListValues(Node<T> head) {

    List<T> values = new ArrayList<>();
    Node<T> current = head;
    // loop until reach end
    while (current != null) {
      values.add(current.val);
      current = current.next;
    }
    return values;
  }

  public static void main(String[] args) {

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d
    System.out.println(Solution.linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]

    // test case 2
    Node<String> e = new Node<>("e");
    Node<String> f = new Node<>("f");
    Node<String> g = new Node<>("g");
    Node<String> h = new Node<>("h");
    e.next = f;
    f.next = g;
    g.next = h;
    // e -> f -> g -> h
    System.out.println(Solution.linkedListValues(e));
    // -> [ "e", "f", "g", "h" ]
  }
}
