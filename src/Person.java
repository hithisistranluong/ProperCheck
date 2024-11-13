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

    public Person(String id, String fullName, String dobStr, String contact) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date dob = df.parse(dobStr);

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
        Owner owner = new Owner("O1", "Tran", "01/01/2000", "tran@example.com");
        Property property = new Property("P1", "123 Street", 300, "available", owner);
        Tenant tenant = new Tenant("T1", "Solash", "12/01/2000", "solash@example.com");
        RentalAgreement r = new RentalAgreement("1", property, owner, null, tenant, "weekly", "01/01/2024", "12/31/2024", "01/01/2024", property.getPrice(), "new");

        System.out.println(r.toString());
    }
}
