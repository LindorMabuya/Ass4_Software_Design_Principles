package za.ac.cput.Open_Closed;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/24.
 */
public class HealthInsuranceClaimTest {
    HealthInsuranceSurveyor surveyor;
    ClaimApprovalManager manager;

    @Before
    public void setUp() throws Exception {
        surveyor = new HealthInsuranceSurveyor();
        manager = new ClaimApprovalManager();

    }

    @Test
    public void testClaim() throws Exception {
        manager.processHealthClaim(surveyor);
        manager.processVehicleClaim(surveyor);
    }
}
