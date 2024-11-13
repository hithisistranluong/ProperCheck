/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;
import java.text.*;

public class Tenant extends Person {
    private List<RentalAgreement> rentalAgreements;
    private List<Payment> paymentRecords;
    private List<Property> rentalProperties;

    // Define Constructors
    public Tenant() {
        super();
        this.rentalAgreements = new ArrayList<RentalAgreement>();
        this.paymentRecords = new ArrayList<Payment>();
        this.rentalProperties = new ArrayList<Property>();
    }

    public Tenant(String id, String fullName, String dobStr, String contact) throws Exception {
        super(id, fullName, dobStr, contact);
        this.rentalAgreements = new ArrayList<RentalAgreement>();
        this.paymentRecords = new ArrayList<Payment>();
        this.rentalProperties = new ArrayList<Property>();
    }

    // Getters and setters
    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }
//    public void addRentalAgreement(RentalAgreement agreement) {
//        rentalAgreements.add(agreement);
//    }

    public List<Payment> getPaymentTransactions() {
        return paymentRecords;
    }
//    public void addPayment(Payment payment) {
//        paymentRecords.add(payment);
//    }

    public List<Property> getRentalProperties() {
        return rentalProperties;
    }
//    public void addRentalProperty(Property property) {
//        rentalProperties.add(property);
//    }

    @Override
    public String toString() {
        return "Tenant {" + "\n" +
                "\tId: " + getId() + "\n" +
                "\tName: " + getFullName() + "\n" +
                "\tDoB: " + getDob() + "\n" +
                "\tContact: " + getContact() + " \n" +
                "\tRental Agreements: " + getRentalAgreements() + "\n" +
                "\tPayments: " + getPaymentTransactions() + "\n" +
                "\tProperties: " + getRentalProperties() + "\n" +
                "}";
    }
}
