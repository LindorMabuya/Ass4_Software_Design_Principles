package za.ac.cput.OCP;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/25.
 */
public class ClaimApprovalManagerTest {
    HealthInsuranceSurveyor healthInsuranceSurveyor;
    ClaimApprovalManager claim1;
    VehicleInsuranceSurveyor vehicleInsuranceSurveyor;
    ClaimApprovalManager claim2;

    @Before
    public void setUp() throws Exception {
        healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        claim1 = new ClaimApprovalManager();
        vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        claim2 = new ClaimApprovalManager();
    }

    @Test
    public void testProcessClaim() throws Exception {
        claim1.processClaim(healthInsuranceSurveyor);
        claim2.processClaim(vehicleInsuranceSurveyor);

    }
}
