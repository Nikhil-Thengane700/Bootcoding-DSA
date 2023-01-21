package com.bootcoding.dsa.linkedList;

public class removeElement {
    public static Node removeElements(Node head, int val) {

        Node temp = head;

        while(temp != null){
            if(temp.next.data ==val){
                temp=null;

            }
            temp= temp.next;
        }
        return head;

    }

    public static void main(String[] args) {
        linkedList EvenNode = new linkedList();
        Node head2=  EvenNode.createLinkedList();

        Node head = removeElements(head2,20);
        System.out.println(head);
    }





}

