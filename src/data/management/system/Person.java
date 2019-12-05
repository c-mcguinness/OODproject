/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.management.system;
import java.util.Date;
/**
 *
 * @author x18377201
 */
public class Person {

    public Person(String id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
    
    //vars
    private String id;
    private String fname;
    private String lname;
    private String gender;
    private int dateadd;
    private int appdate;
    
    //constructor
    public Person(String id, String fname, String lname, String gender, int dateadd, int appdate) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.dateadd = dateadd;
        this.appdate = appdate;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   //gets and sets
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDateadd() {
        return dateadd;
    }

    public void setDateadd(int dateadd) {
        this.dateadd = dateadd;
    }

    public int getAppdate() {
        return appdate;
    }

    public void setAppdate(int appdate) {
        this.appdate = appdate;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "first name=" + fname + ", last name ="+ lname + ",id=" + id + ", gender=" + gender +
                 ",appointment date = "+ appdate +", date added= "+ dateadd + '}';
    }
}

    
    
    

    
   
