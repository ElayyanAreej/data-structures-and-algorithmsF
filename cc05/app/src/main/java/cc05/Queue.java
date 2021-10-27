package cc05;

public class Queue <T>{

    Node<T> front;
    Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value) {
        Node newNode = new Node(value);

        if(front==null){
        front = newNode;
        rear=newNode;
        front.next=null;
        }
        else{
            Node current=rear;
            rear=newNode;
            rear.next=current;
        }
    }

    public <T> Object dequeue(){
        Node current=rear;
if(current.next==null){
    front=null;
    rear=null;
    return current.value;
}
        while (current.next.next!=null){
            current=current.next;
        }
     front=current;
     current=current.next;
        front.next=null;
        return current.value;
    }

    public String toString() {
        Node current = rear;
        String result = "";
        while (current != null) {
            result += "{ " + current.value + " } ->";
            current = current.next;
        }
        result += "NULL";
        return result;
    }
    public boolean isEmpty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
}
