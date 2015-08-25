package net.seninp.tinker.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TraverseRunner {

  // 1
  // / \
  // / \
  // / \
  // 2 3
  // / \ /
  // 4 5 6
  // / / \
  // 7 8 9

  public static void main(final String[] args) {
    Node<Integer> tree = setupTree();

    System.out.print("Pre-order: ");
    preorder(tree);
    System.out.println();

    System.out.print("In-order: ");
    inorder(tree);
    System.out.println();

    System.out.print("Post-order: ");
    postorder(tree);
    System.out.println();

    System.out.print("Level-order: ");
    levelorder(tree);
    System.out.println();

  }

  private static void preorder(Node<Integer> node) {
    if (null != node) {
      System.out.print(node.data + " ");
      preorder(node.left);
      preorder(node.right);
    }
  }

  private static void inorder(Node<Integer> node) {
    if (null != node) {
      inorder(node.left);
      System.out.print(node.data + " ");
      inorder(node.right);
    }
  }

  private static void postorder(Node<Integer> node) {
    if (null != node) {
      postorder(node.left);
      postorder(node.right);
      System.out.print(node.data + " ");
    }
  }

  private static void levelorder(Node<?> node) {

    Queue<Node<?>> queue = new LinkedList<Node<?>>();

    if (null != node) {
      queue.add(node);
    }

    while (!queue.isEmpty()) {
      Node<?> next = queue.remove();
      System.out.print(next.data + " ");
      if (null != next.left) {
        queue.add(next.left);
      }
      if (null != next.right) {
        queue.add(next.right);
      }
    }

  }

  private static Node<Integer> setupTree() {
    Node<Integer> one = new Node<Integer>(1);
    Node<Integer> two = new Node<Integer>(2);
    Node<Integer> three = new Node<Integer>(3);
    Node<Integer> four = new Node<Integer>(4);
    Node<Integer> five = new Node<Integer>(5);
    Node<Integer> six = new Node<Integer>(6);
    Node<Integer> seven = new Node<Integer>(7);
    Node<Integer> eight = new Node<Integer>(8);
    Node<Integer> nine = new Node<Integer>(9);
    one.setLeft(two);
    one.setRight(three);
    two.setLeft(four);
    two.setRight(five);
    three.setLeft(six);
    four.setLeft(seven);
    six.setLeft(eight);
    six.setRight(nine);
    return one;
  }
}
