/*
 * Name : Amna Ziauddin
 * Project : Gumball Machine
 * Objective : Create a code for Gumball machine that can take input from three kinds of machines
 *           : 1. The machine only takes in quarters
 *           : 1. The machine only takes 2 quarters
 *           : 1. The machine takes all coins
 */
package gumball_machine;


public class Gumball_Machine {


    public static void main(String[] args) {
        
        Gumball_parent Machine1 = new Gumball_machine_1(2); //Number of gumballs in machine 1
        dispense(Machine1);                                 //applying the method to dispense the gumballs from the machine
	Gumball_parent Machine2 = new Gumball_machine_2(2); //Number of gumballs in machine 2
	dispense(Machine2);
	Gumball_parent Machine3 = new Gumball_machine_3(2); //Number of gumballs in machine 3
	dispense(Machine3);
	}
	
	public static void dispense(Gumball_parent a) 
        {
            //Machine 1

            a.insertQuarter( 25 );
            a.turnCrank();
            
            //Machine 2

            a.insertQuarter( 25 );
            a.turnCrank();
            a.insertQuarter( 25 );
            a.turnCrank();
            
            //Machine 3
            
            a.insertQuarter( 10 );
            a.turnCrank();
            a.insertQuarter( 15 );
            a.turnCrank();
            a.insertQuarter( 5 );
            a.turnCrank();
            a.insertQuarter( 5 );
            a.turnCrank();
            
            System.out.println("_____________________________________________");
	}
    }