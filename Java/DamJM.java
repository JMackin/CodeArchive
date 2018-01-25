/*
* Name:      John Mackin
*
* Course:    CS-12, Spring 2015
*
* Date:      05/24/2015
*
* Filename:  UtilsJM.java
*
* Purpose:   Dam class - DamArray
*/


public class DamJM {

//Instance Variables
SimpleDate date = new SimpleDate();
SimpleDate miscDate = new SimpleDate();

private String name;
private int year;
private double capacity, storage, inflow, outflow;
private boolean gui = false;

  //Default Constructor
  public DamJM() {
  
  name = "Dam";
  year = 1901;
  storage = 50.0;
  capacity = 100.0;
  inflow = 10.0;
  outflow = 10.0;
  date.setDate(1,1,2000);
  }
  
  //Full Constructor
  public DamJM(String name, int year, double storage, double capacity,
               double inflow, double outflow, SimpleDate date) {
  this();
  setName(name);
  setYear(year);
  setStorage(storage);
  setCapacity(capacity);
  setInFlow(inflow);
  setOutFlow(outflow);
  setDate(date);
  }
  
  //Half Constructor (dam name & year)
  public DamJM(String name, int year) {
  this();
  setName(name);
  setYear(year);
  }
  
  //Half Constructor (dam name & capacity)
  public DamJM(String name, double capacity){
  this();
  setName(name);
  setCapacity(capacity);
  }
  
  
  //ACCESSORS / MUTATORS
  
  public void setName(String name){
  this.name = name;
  }
  public void setYear(int year){
    if (year <= 1900){
      System.out.println("Entered date is too early");
      //setYear(gui);
    }
    else{  
      this.year = year;
    }
  }
  public void setCapacity(double capacity){
      if (capacity <= 0.0 || capacity < storage ){
        System.out.println("Error: Invalid capacity");
      //setCapacity(gui);
      }
      else {
      this.capacity = capacity;
      }
  }
  public void setStorage(double storage){
    if (storage <= 0.0 ){
        System.out.println("Error: Invalid storage");
      //setStorage(gui);
      }
      else {
      this.storage = storage;
      }
  }
  public void setInFlow(double inflow){
      if (inflow <= 0.0){
          System.out.println("Error Invalid inFlow: ");
        //setInFlow(gui);
      }
      else{
      this.inflow = inflow;
      }
  }
  public void setOutFlow(double outflow){  
      if (outflow <= 0.0){
          System.out.println("Error Invalid outFlow: ");
          setOutFlow(gui);
      }
      else{
      this.outflow = outflow;
      }
  }
  public void setDate(SimpleDate date){
    this.date = date;
  }
  
  //----------------------
  public String getName(){
  return name;
  }
  public int getYear(){
  return year;
  }
  public double getStorage(){
  return storage;
  }
  public double getCapacity(){
  return capacity;
  }
  public double getInFlow(){
  return inflow;
  }
  public double getOutFlow(){
  return outflow;
  }
  public SimpleDate getDate(){
  return date;
  }
  //----------------------
  public void setName(boolean gui){  
    name = UtilsJM.readString("Enter Dam Name: ");
  }
  
  public void setYear(boolean gui){
   year = UtilsJM.readInt("Enter Opening Year: ",gui);
    if (year <= 1900){
      System.out.println("Entered date is too early");
      year = 1901;
      //setYear(gui);
    }
  }
  
  public void setCapacity(boolean gui){
    capacity = UtilsJM.readDouble("Enter Capacity: ",gui);
    if (capacity <= 0.0 || capacity < storage){
      System.out.println("Error: Invalid capacity");
      capacity = 100;
      //setCapacity(gui);
    }
    
  }
  
  public void setStorage(boolean gui){
    storage = UtilsJM.readDouble("Enter Current Storage: ",gui);
    if (storage <= 0.0){
      System.out.println("Error: Invalid storage");
      storage = 50;
      //setStorage(gui);
    }   
  }
  
  public void setInFlow(boolean gui){
    inflow = UtilsJM.readDouble("Enter Rate of InFlow: ",gui);
    if (inflow <= 0.0){
        System.out.println("Error Invalid inFlow: ");
        inflow = 10;
        //setInFlow(gui);
    }    
  }
  
  public void setOutFlow(boolean gui){
    outflow = UtilsJM.readDouble("Enter Rate of OutFlow: ",gui);
    if (outflow <= 0.0){
        System.out.println("Error Invalid outFlow: ");
        outflow = 10;
        //setOutFlow(gui);
    }
  }  
  
  public void setDate(boolean gui){
    date.setDay(UtilsJM.readInt("Enter measurment day: ", gui));
    date.setMonth(UtilsJM.readInt("Enter measurment month: ", gui));
    date.setYear(UtilsJM.readInt("Enter measurment year: ", gui));
    if (date.getYear() < 1901) { System.out.println("Error: Invalid Measurement date"); date.setYear(1901);} 
      //setDate(false);
  }
  //end access / mutate
  
  
  //OUTPUT METHODS
  public String toString() {
    return name + ", " + year + ", " + capacity + ", " + storage + ","
           + inflow + ", " + outflow + ", " + date;
  }
  
  public void print() {
     System.out.println("\n");
     System.out.println("-----------\n" + name + "\n-----------");
     System.out.println("Year Built: \t\t" + year);
     System.out.println("Current Volume: \t" + Math.round(storage) + " acreFt");
     System.out.println("Max volume: \t\t" + Math.round(capacity) + " acreFt");
     System.out.println("In flow rate: \t\t" + Math.round(inflow) + " cuft/s");
     System.out.println("out flow rate: \t\t" + Math.round(outflow) + " cuft/s");
     System.out.println("Date of Measurement: \t" + date);
     System.out.println("Age of Dam: \t\t" + getAge());
     System.out.println("Status of Dam: \t\t" + getStatus());
     System.out.println("Percent Full: \t\t" + Math.round((getPercentFull() * 100)) + "%");
     System.out.println("Days until full/empty: \t" + getEventDays());
     System.out.println("Date of Event: \t\t" + getEventDate());
  }
  
  public void print(String message) {
    System.out.println("##############");
    System.out.println(message);
    System.out.println("##############");
    print();
  } 
  //End output methods
  
  
  
  public boolean equals(Object obj){
  
    if (!(obj instanceof DamJM)) {
      return false;
    }
    else {
      DamJM d = (DamJM) obj;
    
        return (d.getName()).equals(this.name) &&
                (d.getYear()) == (this.year) &&
                (d.getStorage()) == (this.storage) &&
                (d.getCapacity()) == (this.capacity) &&
                (d.getInFlow()) == (this.inflow) &&
                (d.getOutFlow()) == (this.outflow) &&
                (d.getDate()).equals(this.date);
    }
  }// end equals()
  
  
  //DERIVED DATA ACCESSORS 
  
  public int getAge(){
    miscDate.setYear(year);
    int damAge = UtilsJM.getAge(miscDate,date);
    return damAge;
  }//end getAge
  
  public String getStatus(){
   String status;
   
   if( (getInFlow()) > (getOutFlow()) ) {
      status = "Filling";
     }
   else if ( (getInFlow()) < (getOutFlow()) ) {
     status = "Emptying";
   }
   else {
     status = "Holding";
   }
   return status;
  }//end getStatus
  
  public double getPercentFull(){
    double prcnt = (getStorage() / getCapacity());
    return prcnt;
  }//end getPercent
  
  public int getEventDays(){
    double event;   
    double conv = 0.50416666666;
    if(getStatus().equals("Emptying")){
      event = ((( getStorage()) / ( getOutFlow() - getInFlow() )) * conv);
      int eventDays = (int) event;
      return Math.abs(eventDays);
    }
    else if(getStatus().equals("Filling")){
      event = ((( getStorage() - getCapacity()) / ( getInFlow() - getOutFlow() )) * conv);
      int eventDays = (int) event;
      return Math.abs(eventDays);
    }
    else{
      return -1;
    }
  
  }//endGetEventDays
  
  
  public SimpleDate getEventDate(){
    int eventDays = getEventDays();
    for (int i = 0; i < eventDays; i++){
      date.nextDay();
    }
    return date;
    
  }//end getEventDate
   //end derived data accessors
  
  //UTILITY METHODS
  
  public void update(){
  System.out.println("\n");
  setName(gui);
  setYear(gui);
  setStorage(gui);
  setCapacity(gui);
  setInFlow(gui);
  setOutFlow(gui);
  setDate(gui);
  }
  
  public void importWater(double acreFeet){
    if (acreFeet > (capacity - storage)){
        System.out.println("Error: capacity too small for that.");
    }
    else if(acreFeet <= 0){
        System.out.println("Error: Enter positive amount");
    }
    else {
    setStorage(getStorage() + acreFeet);
     }
  }
  
  public void releaseWater(double acreFeet){
    if (acreFeet > storage){
        System.out.println("Error: storage too small for that.");
    }
    else if(acreFeet <= 0){
        System.out.println("Error: Enter positive amount");
    }
    else{
    setStorage(getStorage() - acreFeet);
    }
  }
  
  public void increaseOutFlow(double cuFtSec){
    if (cuFtSec <= 0){
        System.out.println("Error: invalid amount");
        
    }
    else if(cuFtSec <= 0){
        System.out.println("Error: Enter positive amount");
    }
    else{
    setOutFlow(getOutFlow() + cuFtSec);
    }
  }
  
  public void decreaseOutFlow(double cuFtSec){
    if (cuFtSec <= 0){
      System.out.println("Error invalid amount");
    }
    else if(cuFtSec <= 0){
        System.out.println("Error: Enter positive amount");
    }
    else{
    setOutFlow(getOutFlow() - cuFtSec);
    }
  }
  
 /* 
  //TEST DRIVER
  public static void main(String [] args){
      
      DamJM d = new DamJM("DumbDam",1901);
      SimpleDate s = new SimpleDate(1,1,1903);
      DamJM e = new DamJM("blah",1900,-700.6,-600.7,-9.0,-7.0,s);
      
      e.print();
      e.update();
      e.print();
      
  }//end main
   */
  
} //end class   
    