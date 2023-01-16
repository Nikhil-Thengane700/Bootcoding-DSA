package com.bootcoding.dsa.linkedList;

public class duplicateNode {
    public static void printDuplicateNode(Node head) {
        Node temp = head;
        Node temp2 = temp.next;
        int duplicate = 0;
        while (temp != null) {
            while (temp2 != null) {
                if (temp.data == temp2.data) {
                    System.out.print(temp.data);
                }
                temp2 = temp2.next;

            }
            temp = temp.next;
        }}

        public static void main (String[] args){
            linkedList duplicateNode = new linkedList();
            Node head5 = duplicateNode.createLinkedList();

            printDuplicateNode(head5);




        }
    }
