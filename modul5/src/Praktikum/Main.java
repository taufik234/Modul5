package Praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kombinasi huruf dan angka: ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            tree.insert(element);
        }

        System.out.println("Traversal Pre-order:");
        tree.preOrder(tree.root);

        System.out.println("\nTraversal In-order:");
        tree.inOrder(tree.root);

        System.out.println("\nTraversal Post-order:");
        tree.postOrder(tree.root);
	}
}