package com.iamdj;

import java.util.Scanner;

//------------------------ NODE THAT CONTAINS DATA AND LINK OF NEXT NODE ----------------------//
class Node {
    int info;
    Node link;

    Node(int info){
        this.info = info;
        link = null;
    }
}



class LinkedListImplementation {

    Scanner in = new Scanner(System.in);

    //------------------------------ INSERT AT REAR --------------------------------//
    Node insert_rear(Node first) {
        int item;
        System.out.println("Enter item to insert at rear:");
        item = in.nextInt();

        Node temp = new Node(item);
        Node cur;

        if(first == null){  // WHEN LIST HAS NO NODE
            first = temp;
            System.out.println(first.info+" is inserted at rear.");
            return first;
        }

        cur = first;

        while (cur.link!= null) {
            cur = cur.link;
        }

        cur.link = temp;
        System.out.println(temp.info+" is inserted at rear.");
        return first;
    }


    //------------------------------ DELETE AT FRONT ------------------------------//
    Node delete_front(Node first) {
        if(first == null) { // WHEN LIST EMPTY
            System.out.println("List is empty.");
            return null;
        }

        if(first.link == null) { // WHEN LIST HAS ONE NODE
            System.out.println(first.info+" is deleted at front.");
            return null;
        }

        System.out.println(first.info+" is deleted at front.");
        first = first.link;
        return first;
    }



    //------------------------------------ DISPLAY LIST -----------------------------------//
    void display(Node first) {
        if(first == null){  // CHECK FOR EMPTINESS
            System.out.println("List is empty.");
            return;
        }

        System.out.println("List items are:");
        Node cur;
        cur = first;
        while(cur!= null){
            System.out.print(cur.info+"  ");
            cur = cur.link;
        }
        System.out.println();
    }


    // Function to get the middle of the linked list
    void middleNode(Node first) {

        if(first == null){
            System.out.println("List is empty");
            return;
        }

        int count = 0;
        Node mid = first;

        while (first != null) {

            // update mid, when 'count' is odd number
            if ((count & 1) != 0 )
                mid = mid.link;  // slow run

            ++count;
            first = first.link; // fast run
        }

        /* if empty list is provided */
        if (mid != null)
            System.out.println("The middle element is:  "+ mid.info);
    }

}




//----------------------------- MAIN FUNCTION AS A DRIVER --------------------------//
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Node first = null;  // CREATE REFERENCE OF NODE CLASS.

        LinkedListImplementation list = new LinkedListImplementation(); // CREATE OBJECT

        while (true) {
            // DISPLAY MENU DRIVEN MESSAGE
            System.out.println("1.Insert at Rear");
            System.out.println("2.Delete at Front");
            System.out.println("3.Display");
            System.out.println("4.Find middle node");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    first = list.insert_rear(first);
                    break;

                case 2:
                    first = list.delete_front(first);
                    break;

                case 3:
                    list.display(first);
                    break;

                case 4:
                    list.middleNode(first);
                    break;

                case 5:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Choose valid option.");
            }
        }
    }
}