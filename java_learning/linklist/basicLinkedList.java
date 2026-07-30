public class basicLinkedList{
    public static void main(String[] args){

LinkedL list = new LinkedL();
list.insertFirst(3);
list.insertFirst(5);
list.insertFirst(6);
list.insertFirst(8);
list.insertLast(18);
list.insertAtIndex(100,3);
// list.insertFirst(9);
list.insertLast(19);
list.display();
System.out.println();

// delete----------------
System.out.println(list.deleteFirst());
list.display();

System.out.println();
System.out.println(list.deleteLast());
list.display();

System.out.println();
System.out.println(list.delete(2));
list.display();

System.out.println();
System.out.println(list.find(18));
    }
}



class LinkedL{
    private Node head;
    private Node tail;
    private int size;

    public LinkedL(){
        this.size = 0;
    }

    private static class Node{
    private int val;
    private Node next; //refrence pointer

    private Node(int val){
        this.val = val;
    }

    private Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString(){
        return String.valueOf(val);
    }
  }


    public void insertLast(int val){//insert at last position
        Node node = new Node(val);
        
        if(tail == null){
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
        size +=1;
    }


    public void insertFirst(int val){ //insert at first position
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail=head;
        }

        size +=1;
    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head; //need to traverse 
        for(int i =1; i<index ; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next); //value to be insert , and pointing index -- used to create a new node box for a linked list
        temp.next = node;
        size++;
    }

// ----------------------------------------------------
    public void  display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
       System.out.print("END");
    }


    // ----------------Deleting element from linked list--------------------------
    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

//delete from last

public Node get(int index){
    Node node = head;
    for(int i =0; i<index; i++){
        node = node.next;
    }
    return node;
}

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLastElement = get(size-2);
        int value = tail.val;

        tail = secondLastElement;
        tail.next = null;
        size--;

        return value;
    }

// --- delete at any index----------
public int delete(int index){
    if(index == 0){
        return deleteFirst();
    }

    if(index == size-1){
       return deleteLast();
    }

    Node prev = get(index-1);
    int value = prev.next.val;

    prev.next = prev.next.next;
    size--;
    return value; 
}

// --finding value-------------
public Node find(int value){
    Node node = head;//do traverse
    while(node != null){
        if(node.val == value){
            return node;
        }
        node= node.next;
    }
    return null;
  }
}