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


    //append adds a new node with the given value to the end of the list
    public void append(T value) {
        Node current=head;
        while (current.next!=null){
            current=current.next;
            }
        Node newNode = new Node(value);
        current.next=newNode;
        newNode.next=null;
        }

//adds a new node with the given new value immediately before the first node that has the value specified
    public void insertBefore(T y,T value){
        Node current=head;
        while (current.next.value!=y){
            current=current.next;
        }
        Node newNode = new Node(value);
        newNode.next=current.next;
        current.next=newNode;
    }

    //adds a new node with the given new value immediately after the first node that has the value specified
    public void insertAfter(T y,T value){
        Node current=head;
        while (current.value!=y){
            current=current.next;
        }
        Node newNode = new Node(value);
        newNode.next=current.next;
        current.next=newNode;
    }


    public <T> Object kth(int k) {
        // to count its content (nodes)
        Node current = head;
        int countNode=0;
        while (current.next != null){
            current=current.next;
            countNode++;
              }



        

        try {
            //calc places from the tail
            int placeFromTail=countNode-k;

            //to get the value
            current = head;
            for(int i=0;i<placeFromTail;i++){
                current=current.next;
            }
            return current.value;
        }
        catch(Exception e) {
//            System.out.println("Exception");
            return e;
        }

    }


}