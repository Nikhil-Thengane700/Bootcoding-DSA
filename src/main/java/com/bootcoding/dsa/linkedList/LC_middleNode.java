package com.bootcoding.dsa.linkedList;

public class LC_middleNode {

    public Node middleNode(Node head) {

        Node temp = head;
        int count = 0;

        while(temp !=null){
            count++;
            temp=temp.next;
        }
          temp = head;
        for (int i=0; i<count/2; i++){
            temp = temp.next;

        }
        return temp;
 }

    public static void main(String[] args) {
        linkedList l = new linkedList();
        Node head =  l.createLinkedList();
    }
}


