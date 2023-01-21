package com.bootcoding.dsa.linkedList;

public class lengthOfLinkedList {
    public static int length(Node head){
        Node temp = head;
        int count = 0;


        while (temp!=null){
            count++;
            temp = temp.next;
        }

        return count;

    }





;

    public static void main(String[] args) {

        linkedList l = new linkedList();
        Node head =  l.createLinkedList();
        System.out.println(length(head));




    }
}
