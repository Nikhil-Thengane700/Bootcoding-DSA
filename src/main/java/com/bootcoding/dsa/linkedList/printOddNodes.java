package com.bootcoding.dsa.linkedList;

public class printOddNodes {

        public static void printOddNodes(Node head)
        {
            Node temp = head;
            while (temp != null)
            {
                if(temp.data%2!=0){
                    System.out.print(temp.data +" => ");}
                temp = temp.next;

            }
            System.out.println();
        }
        public static void main(String[] args) {
            linkedList EvenNode = new linkedList();
            Node head3=  EvenNode.createLinkedList();
            printOddNodes(head3);



        }

    }
