/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;

public class RentalAgreement implements RentalManager {
    private String rentalAgreementId;
    private Property property;
    private Person owner;
    private Host[] hosts;
    private Tenant mainTenant;
    private Tenant[] subTenants;
    private String period;
    private Date startDate;
    private Date endDate;
    private Date contractDate;
    private double fee;
    private String status;

    @Override
    public void addRentalAgreement(RentalAgreement rentalAgreement) {

    }

    @Override
    public void updateRentalAgreement(String rentalAgreementId, RentalAgreement updateRentalAgreement) {

    }

    @Override
    public void deleteRentalAgreement(String rentalAgreementId) {

    }

    @Override
    public RentalAgreement getRentalAgreement(String rentalAgreementId) {
        return null;
    }

    @Override
    public RentalAgreement[] getAllRentalAgreements() {
        return null;
    }

    @Override
    public RentalAgreement[] sortRentalAgreements(String criteria) {
        return null;
    }

    @Override
    public void saveDataToFile() {

    }

    @Override
    public void loadDataFromFile() {

    }
}
