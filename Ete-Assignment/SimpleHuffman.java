import java.util.*;

// Node for Huffman Tree
class Node {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

public class SimpleHuffman {

    // Function to build the Huffman Tree
    public static Node buildTree(char[] chars, int[] freqs) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.freq));

        // Step 1: Create leaf nodes for all characters
        for (int i = 0; i < chars.length; i++) {
            pq.add(new Node(chars[i], freqs[i]));
        }

        // Step 2: Combine two smallest until one node remains
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node newNode = new Node('\0', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;
            pq.add(newNode);
        }

        return pq.poll(); // root of Huffman Tree
    }

    // Recursive function to print codes
    public static void printCodes(Node root, String code) {
        if (root == null) return;

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " -> " + code);
            return;
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        // Input characters and frequencies
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freqs = { 5, 9, 12, 13, 16, 45 };

        Node root = buildTree(chars, freqs);

        System.out.println("Huffman Codes:");
        printCodes(root, "");
    }
}
