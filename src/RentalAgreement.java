/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;
import java.text.*;

public class RentalAgreement {
    public enum RentalPeriod {
        DAILY,
        WEEKLY,
        FORTNIGHTLY,
        MONTHLY
    }

    public enum RentalStatus {
        NEW,
        ACTIVE,
        COMPLETED
    }

    private String rentalAgreementId;
    private Property property;
    private Owner owner;
    private Host host;
    private Tenant mainTenant;
    private List<Tenant> subTenants;
    private RentalPeriod period;
    private Date startDate;
    private Date endDate;
    private Date contractDate;
    private double fee;
    private RentalStatus status;

    // Define Constructions
    public RentalAgreement() {
        this.rentalAgreementId = null;
        this.property = null;
        this.owner = null;
        this.host = null;
        this.mainTenant = null;
        this.subTenants = null;
        this.period = null;
        this.startDate = null;
        this.endDate = null;
        this.contractDate = null;
        this.fee = 0.0;
        this.status = null;
    }

    public RentalAgreement(String rentalAgreementId, Property property, Owner owner, Host host, Tenant mainTenant,
                           String period, String startDateStr, String endDateStr, String contractDateStr,
                           double fee, String status) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate = df.parse(startDateStr);
        Date endDate = df.parse(endDateStr);
        Date contractDate = df.parse(contractDateStr);

        this.rentalAgreementId = rentalAgreementId;
        this.property = property;
        this.owner = owner;
        this.host = host;
        this.mainTenant = mainTenant;
        this.subTenants = null;
        this.period = RentalPeriod.valueOf(period.toUpperCase());
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractDate = contractDate;
        this.fee = fee;
        this.status = RentalStatus.valueOf(status.toUpperCase());
    }

    // Getters and setters
    public String getAgreementId() {
        return rentalAgreementId;
    }
    public void setAgreementId(String rentalAgreementId) {
        this.rentalAgreementId = rentalAgreementId;
    }

    public Property getProperty() {
        return property;
    }
    public void setProperty(Property property) {
        this.property = property;
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Host getHost() {
        return host;
    }
    public void setHosts(Host host) {
        this.host = host;
    }

    public Tenant getMainTenant() {
        return mainTenant;
    }
    public void setMainTenant(Tenant mainTenant) {
        this.mainTenant = mainTenant;
    }

    public List<Tenant> getSubTenants() {
        return subTenants;
    }
    public void addSubTenant(Tenant subTenant) {
        subTenants.add(subTenant);
    }

    public RentalPeriod getRentalPeriod() {
        return period;
    }
    public void setRentPeriod(String period) {
        this.period = RentalPeriod.valueOf(period);
    }

    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getContractDate() {
        return contractDate;
    }
    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public double getRentingFee() {
        return fee;
    }
    public void setRentingFee(double fee) {
        this.fee = fee;
    }

    public RentalStatus getRentalStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = RentalStatus.valueOf(status);
    }

    @Override
    public String toString() {
        String result = "Rental Agreement {" + "\n" +
                        "\tId: " + getAgreementId() + "\n";

        if (property != null) {
            result += "\tProperty: " + getProperty().getPropertyId() + "\n";
        }
        if (owner != null) {
            result += "\tOwner: " + getOwner().getFullName() + "\n";
        }
        if (host != null) {
            result += "\tHost: " + getHost().getFullName() + "\n";
        }
        if (mainTenant != null) {
            result += "\tMain Tenant: " + getMainTenant().getFullName();
        }
        if (subTenants != null) {
            for (Tenant subTenant : subTenants) {
                result += "\n- Sub-tenant: " + subTenant.getFullName() + "\n";
            }
        } else {
            result += " (No sub-tenants)\n";
        }
        if (period != null) {
            result += "\tPeriod: " + getRentalPeriod() + "\n";
        }
        if (startDate != null) {
            result += "\tStart Date: " + getStartDate() + "\n";
        }
        if (endDate != null) {
            result += "\tEnd Date: " + getEndDate() + "\n";
        }
        if (contractDate != null) {
            result += "\tContract Date: " + getContractDate() + "\n";
        }
        if (fee != 0.0) {
            result += "\tFee: " + getRentingFee() + "\n";
        }
        if (status != null) {
            result += "\tStatus: " + getRentalStatus() + "\n";
        }
        result += "}";

        return result;
    }
}
