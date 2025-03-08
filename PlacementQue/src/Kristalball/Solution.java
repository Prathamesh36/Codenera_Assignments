package Kristalball;

import java.util.ArrayList;
import java.util.List;

class Node {
    String id;
    int data;
    Node left;
    Node right;

    Node(String id, int data) {
        this.id = id;
        this.data = data;
    }
}

public class Solution {

    public static List<String> lineWithHighestSales(Node root, int bonus) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int[] maxSales = new int[1]; // Array to hold the maximum sales value

        findMaxSalesLine(root, currentLine, result, maxSales, 0);

        if (!result.isEmpty()) {
            int totalSales = maxSales[0];
            int finalBonus = bonus * totalSales / 100;
            System.out.println("Bonus for the line with the highest sales: " + finalBonus);
        }

        return result;
    }

    private static void findMaxSalesLine(Node node, List<String> currentLine, List<String> result, int[] maxSales, int currentSales) {
        if (node == null) {
            return;
        }

        currentLine.add(node.id);
        currentSales += node.data;


        if (node.left == null && node.right == null) {
            if (currentSales > maxSales[0]) {
                maxSales[0] = currentSales;
                result.clear();
                result.addAll(currentLine);
            }
        } else {
            findMaxSalesLine(node.left, currentLine, result, maxSales, currentSales);
            findMaxSalesLine(node.right, currentLine, result, maxSales, currentSales);
        }

        currentLine.remove(currentLine.size() - 1);
    }
    public static void main(String[] args) {
        Node root = new Node("SE1", 10);
        root.left = new Node("SE2", 12);
        root.right = new Node("SE3", 7);
        root.left.left = new Node("SE4", 4);
        root.left.right = new Node("SE5", 17);
        root.left.left.right = new Node("SE8", 9);
        root.left.left.right.left = new Node("SE15", 20);
        root.left.right.left = new Node("SE9", 10);
        root.left.right.right = new Node("SE10", 11);
        root.left.right.left.left = new Node("SE16", 8);
        root.left.right.left.left.right = new Node("SE17", 18);
        root.right.left = new Node("SE6", 6);
        root.right.right = new Node("SE7", 3);
        root.right.left.left = new Node("SE11", 18);
        root.right.left.right = new Node("SE12", 2);
        root.right.right.left = new Node("SE13", 13);
        root.right.right.right = new Node("SE14", 15);
        int bonus = 3000000;
        List<String> line = lineWithHighestSales(root, bonus);
        System.out.println("Line with the highest sales: " + line);
    }
}
