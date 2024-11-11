/**
 * @author Luong Ngoc Bao Tran - s4031723
 */

import java.util.*;

public interface RentalManager {
    public void addRentalAgreement(RentalAgreement rentalAgreement);
    public void updateRentalAgreement(String rentalAgreementId, RentalAgreement updateRentalAgreement);
    public void deleteRentalAgreement(String rentalAgreementId);
    RentalAgreement getRentalAgreement(String rentalAgreementId);
    RentalAgreement[] getAllRentalAgreements();

    RentalAgreement[] sortRentalAgreements(String criteria);

    void saveDataToFile();
    void loadDataFromFile();
}
