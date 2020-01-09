/*
 *CS 235 Fall 2019 Assignment 1
 * John Mackin
 * 10/03/10
 **/

public class CookeryFan
{
  
  private String fname, lname, emailaddr, year;
  private int idNum;
  private boolean subscribed;
  
  // Constructor
  public CookeryFan(String fname, String lname, String emailAddr, boolean recieveEmail)
  {
    this.fname = fname;
    this.lname = lname;
    this.emailaddr = emailAddr;
    this.subscribed = recieveEmail;
    this.idNum =idNum;
    this.year = "2019";
  }
  
  //Accessors
  public String getFName()
  {
    return fname;
  }
  public String getLName()
  {
    return lname;
  }
  public String getEmail()
  {
    return emailaddr;
  }
  public boolean recievesEmail()
  {
    return subscribed;
  }
  public int idNum()
  {
    return idNum;
  }
  public String getYear()
  {
    return year;
  }
  
  //Mutators
  public void setFName(String fn)
  {
    this.fname = fn;
  }
  public void setLName(String ln)
  {
    this.lname = ln;
  }
  public void setEmail(String em)
  {
    this.emailaddr = em;
  }
  public void setSubscribed()
  {
    this.subscribed = !this.recievesEmail();
  }
  
  public String toString()
  {
    return "Name: " + this.getFName() + " " + this.getLName() + "\n" +
                      "Email: " + this.getEmail() + "\n" +
                      "IDNumber: " + this.idNum() + "\n" +
                      "Subscribed: " + this.recievesEmail()+ "\n" +
                      "Year: " + this.getYear();
  }
  
}