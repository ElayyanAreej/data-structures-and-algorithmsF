/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cc05;

public class App {

    public static void main(String[] args) {

       LinkedList<Integer> linkedList= new LinkedList<Integer>();
       System.out.println(linkedList.toString());
       linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.includes(2));
        System.out.println(linkedList.includes(4));
        linkedList.append(0);
        System.out.println(linkedList.toString());
        linkedList.insertBefore(1,4);
        System.out.println(linkedList.toString());
        linkedList.insertAfter(1,4);
        System.out.println(linkedList.toString());

    }
}
