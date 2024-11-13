/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;
import java.text.*;

public class Host extends Person {
    private List<Property> managedProperties;
    private List<Person> cooperatingOwners;
    private List<RentalAgreement> rentalAgreements;

    // Define Constructors
    public Host() {
        super();
        this.managedProperties = new ArrayList<Property>();
        this.cooperatingOwners = new ArrayList<Person>();
        this.rentalAgreements = new ArrayList<RentalAgreement>();
    }

    public Host(String id, String fullName, String dobStr, String contact) throws ParseException {
        super(id, fullName, dobStr, contact);
        this.managedProperties = new ArrayList<Property>();
        this.cooperatingOwners = new ArrayList<Person>();
        this.rentalAgreements = new ArrayList<RentalAgreement>();
    }

    // Getters and setters
    public List<Property> getManagedProperties() {
        return managedProperties;
    }
//    public void addProperty(Property property) {
//        managedProperties.add(property);
//    }

    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }
//    public void addCooperatingOwner(Person owner) {
//        cooperatingOwners.add(owner);
//    }

    public List<Person> getCooperatingOwners() {
        return cooperatingOwners;
    }
//    public void addRentalAgreement(RentalAgreement agreement) {
//        rentalAgreements.add(agreement);
//    }

    @Override
    public String toString() {
        return "Host {" + "\n" +
                "\tId: " + getId() + "\n" +
                "\tName: " + getFullName() + "\n" +
                "\tDoB: " + getDob() + "\n" +
                "\tContact: " + getContact() + " \n" +
                "\tManagedProperties: " + getManagedProperties() + "\n" +
                "\tCooperatingOwners: " + getCooperatingOwners() + "\n" +
                "\tRentalAgreements: " + getRentalAgreements() + "\n" +
                "}";
    }
}
