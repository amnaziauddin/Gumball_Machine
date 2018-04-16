package gumball_machine;

abstract class Gumball_parent {

    int gumballs;
	int sum;
	
	
	public Gumball_parent( int size ) {
		
		this.gumballs = size;
		this.sum = 0;
        
	}
	
	public abstract void insertQuarter(int coin);
	
	public abstract void turnCrank();
    
}
