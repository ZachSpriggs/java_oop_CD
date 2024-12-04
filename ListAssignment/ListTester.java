public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList linkList = new SinglyLinkedList();
        linkList.add(3);
        linkList.add(5);
        linkList.add(8);
        linkList.add(11);
        linkList.add(2);
        linkList.add(34);
        linkList.remove(2);
        linkList.remove(3);
        linkList.find(11);
        linkList.printValues();

    }
}