/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;

public class Property {
    enum Status {
        AVAILABLE,
        RENTED,
        UNDER_MAINTENANCE
    }

    private String id;
    private String address;
    private double pricing;
    private Status status;
    private Owner owner;
    private List<Host> hosts;

    public Property() {
        this.id = null;
        this.address = null;
        this.pricing = 0;
        this.status = null;
        this.owner = null;
        this.hosts = null;
    }

    public Property(String id, String address, double pricing, String status, Owner owner) {
        this.id = id;
        this.address = address;
        this.pricing = pricing;
        this.status = Status.valueOf(status.toUpperCase());
        this.owner = owner;
        this.hosts = new ArrayList<Host>();
    }

    // Getters and setters
    public String getPropertyId() {
        return id;
    }
    public String setPropertyId(String id) {
        return this.id = id;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return pricing;
    }
    public void setPrice(double pricing) {
        this.pricing = pricing;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = Status.valueOf(status.toUpperCase());
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(String ownerId) {
        this.owner = owner;
    }

    public List<Host> getHosts() {
        return hosts;
    }
//    public void addHost(Host host) {
//        hosts.add(host);
//    }

    @Override
    public String toString() {
        String result = "Property {" + "\n" +
                        "\tId: " + getPropertyId() + "\n" +
                        "\tAddress: " + getAddress() + "\n" +
                        "\tPricing: " + getPrice() + "\n" +
                        "\tStatus: " + getStatus() + " \n";

        if (getOwner() != null) {
            result += "\tOwner: " + getOwner().fullName + " - id: " + getOwner().id + "\n";
        }

        result += "\tHosts: " + getHosts() + "\n" +
                  "}";

        return result;
    }
}