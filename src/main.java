// **********************************************************************
// Programmer:	Shae McFadden
// Class:	CS40S
//
// Assignment:	3.2
//
// Description:	This program will calculate the winning seat in a modified
//              Josephus Problem
//
// Input:	Will read in number of people and how many over is killed
//              from file
//  Output:	will print order of elimination
// ***********************************************************************

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;

public class main
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
            String delim = "[ ]+";
            String strin;
            String[] tokens;
            
            int counter = 0;
            int n = 0;
            int people = 0;
            int temp = 0;
            
            String elimOut = "";
            int winner = 0;
	// ***** create objects *****
		
                Queue queue = new Queue();
		BufferedReader fin;
                
	// ***** create input stream *****
	
        try{

            fin = new BufferedReader(new FileReader("JosephusData.txt"));
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Shae McFadden");
		System.out.println("Class:       CS40S");
		System.out.println("Assignment:  3.2");
		System.out.println("**********************************");
		
	// ***** main *****
	
            strin = fin.readLine();
            
            while(strin!=null){
                tokens = strin.split(delim);

                n = Integer.parseInt(tokens[0]);
                people = Integer.parseInt(tokens[1]);

                for(int i = 0; i<people; i++){
                    queue.Enque(i+1);
                }//end of for loop


                while(queue.sizeQ != 1){
                    temp = queue.Deque();
                    if (counter==n-1){
                        counter=0;
                        elimOut += (temp + " ");
                    }//end of if to be killed
                    else{
                        queue.Enque(temp);
                        counter++;
                    }//end of else
                }//end of Josephus' game
                
                winner = queue.Deque();
                
                System.out.println("Josephus: Eliminate every " + n + " # of People " + people);
                System.out.println("Order of Elimination " + elimOut);
                System.out.println("Winning Seat: " + winner);
                System.out.println("**************************************");
                
                counter = 0;
                elimOut = "";
                strin = fin.readLine();
            }//end of while loop
        }//end of try
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }//end of catch
        catch(IOException e){

        }//end of catch
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class