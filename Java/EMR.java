/*
* Name:     
*
* Course:   
*
* Date:  
*
* Filename:  EMR.java
*
* Purpose:   ###
*/

public class EMR {

  //Instance Variables
  private String patName, visReas, patDiag, presMed, birthDate;
  private int heartRate;
  private double bodTemp;
  public int numPat;
  
  //Constructors
  
  //Default
  public EMR() {  
    patName = "name";
    birthDate = "1/1/200";
    visReas = "Null";
    patDiag = "Null";
    presMed = "Null";
    heartRate = 80;
    bodTemp = 98.6;
    numPat++;
  }
  
  //Full Name/Date of Birth Constructor
  public EMR(String patName, String birthDate) {
    this.patName = patName;
    this.birthDate = birthDate;
    numPat++;
  }
  
  //Full all constructor
  public EMR(String visReas, String patDiag, String presMed, 
             double bodTemp, int heatRate) {
    this();
    
    setVisReas(visReas);
    setPatDiag(patDiag);
    setPresMed(presMed);
    setBodTemp(bodTemp);
    setHeartRate(heartRate);
    numPat++;
  }
  
  
  //Accessors, Mutators --------
  public String getPatName() {
    return patName; 
  }
  public void setPatName(String patName) {
    this.visReas = patName;
  }    
  public String getBirthDate() {
    return birthDate; 
  }
  public void setBirthDate(String BirthDate) {
    this.birthDate = birthDate;
  }  
  public String getVisReas() {
    return visReas; 
  }
  public void setVisReas(String visReas) {
    this.visReas = visReas;
  }  
  public String getPatDiag() {
    return patDiag; 
  }
  public void setPatDiag(String patDiag) {
    this.patDiag = patDiag;
  }
  public String getPresMed() {
    return presMed; 
  }
  public void setPresMed(String presMed) {
    this.presMed = presMed;
  }
  public double getBodTemp() {
    return bodTemp; 
  }
  public void setBodTemp(double bodTemp) {
    this.bodTemp = bodTemp;
  }
  public int getHeartRate() {
    return heartRate; 
  }
  public void setHeartRate(int heartRate) {
    this.heartRate = heartRate;
  }
  public int getNumPat() {
    return numPat;
  }
  
  // print all object data
  public void print() {
    System.out.println(
      "-------------------"  + "\n" + 
      "Visit Reason:\t"      + visReas   + "\n" + 
      "Patient Diagnosis:\t" + patDiag   + "\n" + 
      "Prescribed Meds:\t"   + presMed   + "\n" +
      "Body Temp:\t"         + bodTemp   + "\u00B0F" + "\n" + 
      "Heart Rate:\t"        + heartRate + " BPM" );          
  }
  
  //Method for vitals check
  public static boolean redFlags(double bodTemp, int heartRate) {
  
    if (((bodTemp > 97.3) && (bodTemp < 99.1)) && 
         (heartRate > 60) && (heartRate < 100)) {
             
      return false;
      
    }
    else {    
    
      return true;
    }
    
  }//end method
  
}//end class