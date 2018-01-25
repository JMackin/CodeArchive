/*
* Name:   
*
* Course:  
*
* Date:      
*
* Filename:  StudentHealthServices.java
*
* Purpose:   ###
*/

public class StudentHealthServices {

  public static void main(String [] args) {
  
  boolean redFlag;
 
  //Initialize patient objects
  EMR patient1 = new EMR("Mary Shwartz", "07/11/1990");
  EMR patient2 = new EMR("George Marcus","01/22/1972");
  EMR patient3 = new EMR("Steve Ericson","03/01/1985");
  EMR patient4 = new EMR("Daniel Perez", "04/21/1963");
  EMR patient5 = new EMR("Lisa Scrivner","06/06/1994");
  
  //Simulate Patient 1
  System.out.println("Patient Name: "    + patient1.getPatName() +
                     "\nDate of Birth: " + patient1.getBirthDate());
                     
  patient1.setVisReas("Complains of cough");
  patient1.setBodTemp(102.3);
  patient1.setHeartRate(93);
  patient1.setPatDiag("Pneumonia");
  patient1.setPresMed("ExpectorantX");
  patient1.print();
  
  redFlag = EMR.redFlags(patient1.getBodTemp(),patient1.getHeartRate());
  if (redFlag == true) {System.out.println("Warning: Abnormal Vitals");}
  else{System.out.println("Vitals normal");}
  
  //Simulate Patient 2
  System.out.println("\nPatient Name: "    + patient2.getPatName() +
                     "\nDate of Birth: " + patient2.getBirthDate());
                     
  patient2.setVisReas("Back Pain");
  patient2.setBodTemp(98.6);
  patient2.setHeartRate(80);
  patient2.setPatDiag("Pulled Muscle");
  patient2.setPresMed("Ibuprofen");
  patient2.print();
  
  redFlag = EMR.redFlags(patient2.getBodTemp(),patient2.getHeartRate());
  if (redFlag == true) {System.out.println("Warning: Abnormal Vitals");}
  else{System.out.println("Vitals normal");}
  
   //Simulate Patient 3
  System.out.println("\nPatient Name: "    + patient3.getPatName() +
                     "\nDate of Birth: " + patient3.getBirthDate());
                     
  patient3.setVisReas("Sore Throat");
  patient3.setBodTemp(100.1);
  patient3.setHeartRate(85);
  patient3.setPatDiag("Strep");
  patient3.setPresMed("Penecillin");
  patient3.print();
  
  redFlag = EMR.redFlags(patient3.getBodTemp(),patient3.getHeartRate());
  if (redFlag == true) {System.out.println("Warning: Abnormal Vitals");}
  else{System.out.println("Vitals normal");}
  
  
  }//end main  
 }//end class