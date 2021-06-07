package assignments.replit.OOP_227;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParkingMeter pM = new ParkingMeter(10);
		pM.add(2);

	}

}
/*
 * public class TV {
  
  int channel=1;
  int volumeLevel=1;
  boolean on = false; 
  String brand = "undefined" ;
  
  public TV(){
    System.out.println("Creating TV object using no Args- constructor");
  }
  
  public TV(String brand){
    this.brand = brand;
    System.out.println("Creating TV object using 1 arg - constructor");
  }
  
  public int getVolumeLevel(){
    return volumeLevel;
  }
  
  public int getChannel(){
    return channel;
  }
  
  public String getBrand(){
    return brand;
  }
  
  public void setVolumeLevel(int volumeLevel){
        if((volumeLevel<1 || volumeLevel>7) || on==false){
      System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }else{
       this.volumeLevel = volumeLevel;
    }
   
  }
  public void setChannel(int channel){
    if(channel<1 || channel>120){
      System.out.println("ERROR: TV is either OFF or invalid Channel");
    }else{
      this.channel = channel;
    }
    
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  
  public void channelUp(){
    setChannel(++this.channel);
  }
  public void channelDown(){
    setChannel(--this.channel);
  }
  public boolean isOn(){
    return on;
  }
  public void volumeUp(){
    setVolumeLevel(++this.volumeLevel);
  }
  public void volumeDown(){
    setVolumeLevel(--this.volumeLevel-1);
  }
  public void turnOn(){
    if(this.on){
      System.out.println("TV is already ON");
    }else{
      this.on=true;
    }
  }
  public void turnOff(){
    if(this.on){
      this.on=false;
      
    }else{
      System.out.println("TV is already OFF");
    }
  }
  
}*/