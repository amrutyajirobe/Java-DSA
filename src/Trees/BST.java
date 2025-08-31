package Trees;

public class BST {
    public class Node {
        private int value, height;
        private Node left;
        private Node right;


        public Node(int val) {
            this.value = val;
        }

        public int getValue() {
            return value;
        }
    }

        private Node root;


        public int height(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }

        public boolean isEmpty() {
            if (root == null) return true;
            else return false;
        }

        public void display() {
            display(root, "Root Node: ");
        }

        private void display(Node node, String details) {
            if (node == null) {
                return;
            }
            System.out.println(details + node.getValue());

            display(node.left, "left child of " + node.getValue() + ":");
            display(node.right, "right child of " + node.getValue() + ":");
        }


        public void insert(int value) {
        
        }
    }

