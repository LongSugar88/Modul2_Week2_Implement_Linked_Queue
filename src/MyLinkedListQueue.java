public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        private Node next;
        private int key;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
    public void enqueue(int key){
        Node token = new Node(key);
        if(tail == null){
            head = tail = token;
        }
        tail.next = token;
        tail = tail.next;
    }
    public Node dequeue(){
        if(head == null){
            return null;
        }
        Node token = head;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return token;
    }

    public static void main(String[] args) {
        MyLinkedListQueue myList = new MyLinkedListQueue();
        myList.enqueue(0);
        myList.enqueue(1);
        myList.enqueue(2);
        myList.enqueue(3);
        myList.enqueue(4);
        myList.dequeue();
        myList.dequeue();
        myList.dequeue();
        System.out.println(myList.dequeue().key);
        System.out.println(myList.dequeue().key);
    }
}

