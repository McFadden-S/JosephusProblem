
import java.util.ArrayList;

/* **********************************************************
 * Programmer:	Shae McFadden
 * Class:	CS40S
 * 
 * Assignment:	3.1
 *
 * Description:	This class will implement a int queue data structure
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Queue
 {  // begin class
 	
 	// *********** class constants **********
 	// ********** instance variable **********
 	
        int front = 0; //front of queue
        int sizeQ = 0; //current size of queue
        ArrayList<Integer> queue = new ArrayList<>(); //holds queue values
     
 	// ********** constructors ***********
 	
 	/*
         Purpose: default constructor for Queue object
         Interface: none
         Return: none
        */
        public Queue(){
            
        }//end of default constructer
        
        /*
         Purpose: initalized constructor for Queue object
         Interface: size (int), values (int[])
         Return: none
        */
        public Queue(int[] n){
            for(int i = 0; i < n.length; i++){
                queue.add(n[i]);
                sizeQ++;
            }//end of for loop
        }//end of initalized constructor
     
 	// ********** accessors **********
 	
        /*
        Purpose: checks if Queue is empty
        Interface: none
        Returns: boolean true if empty
        */
        public boolean Empty(){
            boolean em = true;
            
            if(sizeQ>0){
                em = false;
            }
            
            return em;
        }//end of empty
        
        /*
        Purpose: reads front value of queue
        Interface: none
        Returns: int of top value of Queue, zero if none
        */
        public int Peek(){
            int n = 0;
            
            if (!(this.Empty())){
                n = queue.get(front);
            }//end of if
            
            return n;
        }//end of peek
        
 	// ********** mutators **********
        
        /*
        Purpose: adds value to back of queue
        interface: value to be added (int)
        returns: none
        */
        public void Enque(int n){
            queue.add(n);
            sizeQ++;
        }//end of enque
        
        /*
        Purpose: removes value of the queue
        interface none
        returns value removed
        */
        public int Deque(){
            int n = 0;
            
            if(!(this.Empty())){
                n = queue.get(front);
                queue.remove(front);
                sizeQ--;
            }//end of if    
            return n;
        }//end of Deque
 
 }  // end class