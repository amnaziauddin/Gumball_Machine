//This machine accepts all coins. The value of the coins can not exceed 50 cents
package gumball_machine;

public class Gumball_machine_3 extends Gumball_parent {
    
    public Gumball_machine_3( int size )
    {
    		super(size);
    }
    
    public void insertQuarter(int coin)
    {
        if ( this.sum + coin <= 50 )
        		this.sum += coin;
    }
    
    public void turnCrank()
    {
	    	if ( this.sum == 50 )
	    	{
	    		if ( this.gumballs > 0 )
	    		{
	    			this.gumballs-- ;
	    			this.sum = 0;
	    			System.out.println( "Gumball Ejected!" ) ;
	    		}
	    		else
	    		{ 
                            this.sum = 0;
                            System.out.println( "No More Gumballs!  Please collect your coins." ) ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println( "Insert " + (50 - this.sum) +" cents" ) ;
	    	}        
    }
    
}
