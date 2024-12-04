public class SinglyLinkedList{
    public Node head;
    public SinglyLinkedList(){
        
    }
    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(int value){
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.value == value){
            head = temp.next;
            return;
        }
        while(temp != null && temp.value != value){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        prev.next = temp.next;
    }

    public void printValues(){
        Node tnode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(tnode != null){
            System.out.println(tnode.value + " ");
            tnode = tnode.next;
        }
    }
}