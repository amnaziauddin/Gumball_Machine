// The machine only dispenses gumballs when 2 quarters have been inserted

package gumball_machine;

public class Gumball_machine_2 extends Gumball_parent {

    public Gumball_machine_2( int size )
    {
    		super(size);
    }
    
    public void insertQuarter(int coin)
    {
        if ( coin == 25 && this.sum + coin <= 50)
        		this.sum += coin;
    }
    
    public void turnCrank()
    {
	    	if ( this.sum == 50 )
	    	{
	    		if ( this.gumballs > 0 )
	    		{
	    			this.gumballs-- ;
	    			System.out.println( "Gumball Ejected!" ) ;
                                this.sum = 0;
	    		}
	    		else
	    		{
                            this.sum = 0;
                            System.out.println( "No More Gumballs!  Please collect your quarters" ) ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println( "Insert quarter" ) ;
	    	}        
    }
    
}
