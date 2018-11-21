/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp272a1b;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author LaptopHPPC
 */
public class COMP272A1b {
    
    Queue<Integer>q;
    Queue<Integer>tmpQ;
    
    public COMP272A1b()
    {
        q = new LinkedList<Integer>();
        tmpQ = new LinkedList<Integer>();
    }
    public int pop(){
        if(q.peek()==null){
            System.out.println("The stack is empty, nothing to return");
            int i=0;
            return i;
            
        }else{
            int pop= q.remove();
            return pop;
        }
    }

    public void push(int data){
        
        if(q.peek()!=null){
            int size=q.size();
            for(int i=0;size>i;i++)
            {
                tmpQ.add(q.remove());
            }
                   q.add(data);
            for(int j=tmpQ.size();j>0;j--){
                q.add(tmpQ.remove());
        }
        }else{
               q.add(data);
            } 
        }
        
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        COMP272A1b s1 = new COMP272A1b();
         
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String command;
              
        do{
            System.out.print("Enter Push, Pop, or Quit> ");
            command=input.nextLine();
        
            if(command.equalsIgnoreCase("Push"))
            {
                System.out.print("Enter an integer: ");
                int x=sc.nextInt();
                s1.push(x);
            }
            else if(command.equalsIgnoreCase("pop"))
            {
                System.out.println("deleting an elelment from the queue: " + s1.pop());                
            }
        
          }while( !command.equalsIgnoreCase("quit") && !command.equalsIgnoreCase("q") );
    }
    
}
