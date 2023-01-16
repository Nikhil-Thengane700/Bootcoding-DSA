package com.bootcoding.dsa.linkedList;

import static com.bootcoding.dsa.linkedList.linkedList.createLinkedList;

public class printEvenNodes {
    public static void printEvenNodes(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            if(temp.data%2==0){
                System.out.print(temp.data +" => ");}
            temp = temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        linkedList EvenNode = new linkedList();
      Node head2=  EvenNode.createLinkedList();
      printEvenNodes(head2);



    }
}
