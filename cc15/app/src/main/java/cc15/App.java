/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc15;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        BinarySearchTree t1 = new BinarySearchTree();
t1.add(10);
t1.add(1);
t1.add(7);
t1.add(6);

System.out.println(t1.containsNode(5));
        System.out.println(t1.findMax(t1.root));

    }
}
