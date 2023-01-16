package com.bootcoding.dsa.linkedList;

public class MaxNode {
   public  static void maxNode(Node head ) {
        Node temp = head;
        int max= temp.next.data;
        while (temp != null) {
            if(temp.data >max){
            max = temp.data;
            }
            temp= temp.next;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        linkedList EvenNode = new linkedList();
        Node head4 =  EvenNode.createLinkedList();

       maxNode(head4);
    }
}
