package za.ac.cput.Open_Closed;

/**
 * Created by LILO on 2016/03/24.
 */
public class ClaimApprovalManager {
    public ClaimApprovalManager() {
    }
    public void processHealthClaim(HealthInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.print("ClaimApprovalManager: Valid Claim. Currently processing claim for approval...\n");
        }
    }
    public void processVehicleClaim(HealthInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.print("ClaimApprovalManager: Invalid claim. Can't process Vehicle Claim under HealthInsuranceSurveyor...\n");
        }
    }
}
