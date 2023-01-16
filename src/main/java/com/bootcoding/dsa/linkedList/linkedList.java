package com.bootcoding.dsa.linkedList;






public class linkedList {

    public static Node insertNodeAtFirst(Node head){

        Node newNode = new Node(50);
        newNode.next=head; //newNode is pointing head Linkedlist
        head = newNode;  // reset to newNode as head
        return head;






    }

    public static Node inserNodeAtLast(Node head){
        //trvaerse

        Node temp= head;
        while(temp!=null){
           if(temp.next == null){
               Node newNode = new Node(60);
               temp.next= newNode;
               return head;

              }
           temp= temp.next;
        }
        return head;
    }



        public  static Node createLinkedList() {

            Node firstNode = new Node(10);
            Node secondNode = new Node(20);
            Node thirdNode = new Node(10);
            Node forthNode =new Node(30);

            Node head = firstNode;
            head.next = secondNode;
            secondNode.next = thirdNode;
            thirdNode.next = forthNode;
            forthNode.next = null;
            return head;

        }
        public static void printLinkedList(Node head)
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data +" => ");
                temp = temp.next;

            }
            System.out.println();
        }



            public static void main(String[] args) {
            Node head =   createLinkedList();
            printLinkedList(head);

          Node result=  insertNodeAtFirst(head);
           printLinkedList(result);


            inserNodeAtLast(head);
            printLinkedList(head);




        }

    }

 




