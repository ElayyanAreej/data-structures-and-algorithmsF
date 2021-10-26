package cc05;

public class Stack <T>{

    Node<T> top;

    public Stack() {
        this.top = null;
    }

    //insert
    public void push(T value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }


    public <T> Object pop(){
        Node current=top;
        top=top.next;
        current.next=null;
        return current.value;
    }

    public <T> Object peek(){
        Node current=top;
if (current.value!=null) {
    return current.value;
}else {
    System.out.println("exception");
    return null;}
}

public Boolean isEmpty(){
    Node current=top;
    if (current.value!=null) {
        return false;
    }else {
       ;
        return true;}
}

    public String toString() {
        Node current = top;
        String result = "";
        while (current != null) {
            result += "{ " + current.value + " } ->";
            current = current.next;
        }
        result += "NULL";
        return result;
    }



}
