/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//43687615+CoderNinjaPrincess@users.noreply.github.com
package comp272a1q2a;

import java.util.*;
/**
 *
 * @author LaptopHPPC
 */

class COMP272A1Q2a { 
  
    static Node head; 
    static int counter;
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to pairwise swap elements of a linked list */
    Node Swap(Node node,int s) { 
          
        int listSize=s;
        //Node baseNode = null;
        
        Node Node1=node.next;
        Node Node2=node.next.next;
        Node Node3=node.next.next.next;
                
        
        if (listSize==0 || listSize==1){
            
            System.out.print("Error can't Swap nodes since list either empty or only has one node");
            return node;
        }
        
        if (node.next==null){
            System.out.print("Error swaping node is a tail");
            return node;
        }
        else{
            node.next=Node2;
            Node1.next=Node3;
            Node2.next=Node1;
                
       
        
    } return node;
    }
  
    /* Function to print nodes in a given linked list */
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
    public void push(int data)
    {
        Node Node = new Node(data);
        Node.next = head;
        head = Node;
        
        addCounter();
    }
   private static int getCounter() 
   {
		return counter;
   }
    private static void addCounter() 
    {
		counter++;
    }
    public int size(){
        return getCounter();
    }
    
    
  
    // Driver program to test above functions 
    public static void main(String[] args) { 
  
        /* The constructed linked list is: 
         1->2->3->4->5->6->7 */
        COMP272A1Q2a listD = new COMP272A1Q2a(); 
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String command;
        
              
        do{
                System.out.print("Enter Add, Swap, Print or Quit> ");
                command=input.nextLine();
        
                if(command.equalsIgnoreCase("add")||command.equalsIgnoreCase("A"))
                {
                    System.out.print("Enter an integer: ");
                    int x=sc.nextInt();
                    listD.push(x);
                    
                    
                }
                else if(command.equalsIgnoreCase("Swap")||command.equalsIgnoreCase("S"))
                {
                   // System.out.print("Please enter the first numbers you would like to swap: ");
                   // int a=sc.nextInt();
                    //System.out.print("Please enter the second number you would like to swap: ");
                    //int b=sc.nextInt();
                    int s=listD.size();
                    listD.Swap(head,s);            
                }
                else if(command.equalsIgnoreCase("Print")||command.equalsIgnoreCase("P"))
                {
                    System.out.print("Your current list order is: \n");
                    listD.printList(head);
                    System.out.print("\n");
                    
                }
        
            }while( !command.equalsIgnoreCase("quit") && !command.equalsIgnoreCase("q") );
      }
}
  
     
 