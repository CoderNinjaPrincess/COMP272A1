/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp272a1a;

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author LaptopHPPC
 * @param <T>
 */
public class COMP272A1a <T extends Comparable<T>>{
    
    LinkedList<T> list;
    
public COMP272A1a(){
    
    list = new LinkedList<>();    
}

public T deleteMin(){
    
    if(list.size()!=0){        
        //assume index 0 is minimum
        int minValue =0;
        for(int i=0;i<list.size();i++){
            //check if item is lesser than minimum index, then update
            if(list.get(minValue).compareTo(list.get(i))>0){
                minValue =i;                
            }
        
        }
        T data = list.get(minValue);
        //remove element
        list.remove(minValue);
        return data;
    }
    else
        return null;
}

public void add(T data)
{
    if(data!=null)
    {
        list.add(data);
    }    
}
public int size()
{
    return list.size();
}
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
    COMP272A1a<Integer>pq = new COMP272A1a<>();
    Scanner sc = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    String command;
              
    do{
        System.out.print("Enter Add, DeletMin, or Quit> ");
        command=input.nextLine();
        
        if(command.equalsIgnoreCase("add")||command.equalsIgnoreCase("a"))
            {
                System.out.print("Enter an integer: ");
                int x=sc.nextInt();
                pq.add(x);
            }
        else if(command.equalsIgnoreCase("DeleteMin")||command.equalsIgnoreCase("D"))
            {
                while(pq.size() != 0) 
                {
                    System.out.println("Deleting min in order: " + pq.deleteMin());
                }
            }
        
       }while( !command.equalsIgnoreCase("quit") && !command.equalsIgnoreCase("q") );
       
       
    }   
    
}
