
package gumball_machine;

public class Gumball_machine_1 extends Gumball_parent {
    
    boolean has_quarter;

    public Gumball_machine_1( int size ) //Takes in the number of the gumballs in the machine
    {
        // initialise instance variables
    		super(size);
    		this.has_quarter = false; //no quarter inserted yet.
    }
    
    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
	    	if ( this.has_quarter )
	    	{
	    		if ( this.gumballs > 0 )
	    		{
	    			this.gumballs-- ;
	    			System.out.println( "Gumball Ejected!" ) ;
                                this.has_quarter = false ;
	    		}
	    		else
	    		{
                            this.has_quarter = false ;
                            System.out.println( "No More Gumballs! Please collect your quarter." ) ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println( "Insert quarter" ) ;
	    	}        
    }
    
}
