package assignments.replit.OOP_227;

public class ParkingMeter{
	  
	  public int timeLeft=0;
	  public int maxTime;
	  
	  public ParkingMeter(int maxTime){
	    this.maxTime = maxTime;
	  }
	  
	  public boolean add(int par){
	    boolean result = false;
	    if(par==25){
	      timeLeft+=30;
	      result=true;
	      if(timeLeft>maxTime){
	        timeLeft=maxTime;
	      }
	    }
	    return result;
	  }
	  
	  public void tick(){
	    if(timeLeft<0){
	         timeLeft--; 
	    }
	  }
	  
	  public boolean isExpired(){
	     boolean result = false;
	    if(timeLeft==0){
	      result = true;
	    }
	    return result;
	  }
	  
	}
