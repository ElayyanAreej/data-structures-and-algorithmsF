package cc05;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    //insert
    public void insert(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    //include
    boolean includes(T value) {
        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    //"{ a } -> { b } -> { c } -> NULL"
    //to string
//    public String toString(){
//
//    }


    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result += "{ " + current.value + " } ->";
            current = current.next;
        }
        result += "NULL";
        return result;
    }
}