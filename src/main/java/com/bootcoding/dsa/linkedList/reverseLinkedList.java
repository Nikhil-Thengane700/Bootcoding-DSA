package com.bootcoding.dsa.linkedList;


public class reverseLinkedList {

    public static Node reverselinkedList(Node head ){
        Node current= head;
        Node next = null;
        Node prev = null;
        while(current != null){
            next= current.next;
            current.next= prev;
            prev = current;
            current=next;

        }
        return prev;

    }
    public static void main(String[] args) {
        linkedList r= new linkedList();
        Node head =  r.createLinkedList();

        head =reverselinkedList(head);
        linkedList.printLinkedList(head);



    }
}
