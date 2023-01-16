package com.bootcoding.dsa.linkedList;

public class minNode {
    public  static void minNode(Node head ) {
        Node temp = head;
        int min= temp.next.data;
        while (temp != null) {

            if(temp.data < min){
                min = temp.data;
            }
            temp= temp.next;
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        linkedList minNode = new linkedList();
        Node head4 =minNode.createLinkedList();

        minNode(head4);

    }
}
