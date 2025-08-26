package Trees;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node {
        int value;
        Node left,right;

        public Node(int val){
            this.value = val;
        }

    }

    private Node root;

    //insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value - ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "?");
        boolean left = scanner.nextBoolean();
        if(left) {
            System.out.println("enter value to the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value + "?");
        boolean right = scanner.nextBoolean();
        if(right) {
            System.out.println("enter value to the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    //display
    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        if(node==null) return;
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public void prettyDisplay(){

    }

    private void prettyDisplay(Node node, int lvl) {

        if(node == null) return;

        prettyDisplay(node.right, lvl + 1);

        if(lvl!=0){
            for (int i=0; i < lvl - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, lvl + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
}