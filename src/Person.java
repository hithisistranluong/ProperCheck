/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;
import java.text.*;

public class Person {
    public String id;
    public String fullName;
    public Date dob;
    public String contact;

    // Define Constructors
    public Person() {
        this.id = null;
        this.fullName = null;
        this.dob = null;
        this.contact = null;
    }

    public Person(String id, String fullName, Date dob, String contact) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.contact = contact;
    }

    // Getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person {" + "\n" +
                "\tId: " + getId() + "\n" +
                "\tName: " + getFullName() + "\n" +
                "\tDoB: " + getDob() + "\n" +
                "\tContact: " + getContact() + " \n" +
                "}";
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse("01/01/2000");
    }
}
