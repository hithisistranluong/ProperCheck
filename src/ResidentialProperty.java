/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;

public class ResidentialProperty extends Property {
    private int bedrooms;
    private boolean hasGarden;
    private boolean petFriendly;

    // Define Constructors
    public ResidentialProperty() {
        super();
        bedrooms = 0;
        hasGarden = false;
        petFriendly = false;
    }

    public ResidentialProperty(String id, String address, double pricing, String status, Owner ownerId) {
        super(id, address, pricing, status, ownerId);
        bedrooms = 0;
        hasGarden = false;
        petFriendly = false;
    }

    public ResidentialProperty(String id, String address, double pricing, String status, Owner ownerId,
                               int bedrooms, boolean hasGarden, boolean petFriendly) {
        super(id, address, pricing, status, ownerId);
        this.bedrooms = bedrooms;
        this.hasGarden = hasGarden;
        this.petFriendly = petFriendly;
    }

    // Getters and setters
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public boolean hasGarden() {
        return hasGarden;
    }
    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean petFriendly() {
        return petFriendly;
    }
    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    @Override
    public String toString() {
        String result = "Residential Property {" + "\n" +
                        "\tId: " + getPropertyId() + "\n" +
                        "\tAddress: " + getAddress() + "\n" +
                        "\tPricing: " + getPrice() + "\n" +
                        "\tStatus: " + getStatus() + " \n";

        if (getOwner() != null) {
            result += "\tOwner: " + getOwner().fullName + " - id: " + getOwner().id + "\n";
        }

        result += "\tHosts: " + getHosts() + "\n" +
                  "\tBedrooms: " + getBedrooms() + "\n" +
                  "\tHas Garden: " + hasGarden() + "\n" +
                  "\tPet Friendly: " + petFriendly() + "\n" +
                  "}";

        return result;
    }
}
