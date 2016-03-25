package za.ac.cput.OCP;

/**
 * Created by LILO on 2016/03/25.
 */
public class ClaimApprovalManager {
    public ClaimApprovalManager() {
    }
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....\n");
        }
    }
}
