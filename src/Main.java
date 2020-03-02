import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            tree.insert(new Node(value));
        }

        System.out.println(tree.isBalanced() ? "YES" : "NO");
    }

}
