/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;
import java.text.*;

public class Owner extends Person {
    private List<Property> ownedProperties;
    private List<Host> hosts;
    private List<RentalAgreement> rentalAgreements;

    // Define Constructors
    public Owner() {
        super();
        this.ownedProperties = new ArrayList<Property>();
        this.hosts = new ArrayList<Host>();
        this.rentalAgreements = new ArrayList<RentalAgreement>();
    }

    public Owner(String id, String fullName, String dobStr, String contact) throws ParseException {
        super(id, fullName, dobStr, contact);
        this.ownedProperties = new ArrayList<Property>();
        this.hosts = new ArrayList<Host>();
        this.rentalAgreements = new ArrayList<RentalAgreement>();
    }

    // Getters and setters
    public List<Property> getOwnedProperties() {
        return ownedProperties;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    @Override
    public String toString() {
        return "Owner {" + "\n" +
                "\tId: " + getId() + "\n" +
                "\tName: " + getFullName() + "\n" +
                "\tDoB: " + getDob() + "\n" +
                "\tContact: " + getContact() + " \n" +
                "\tOwnedProperties: " + getOwnedProperties() + "\n" +
                "\tHosts: " + getHosts() + "\n" +
                "\tRentalAgreements: " + getRentalAgreements() + "\n" +
                "}";
    }
}
