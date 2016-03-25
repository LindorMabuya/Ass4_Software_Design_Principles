package za.ac.cput.OCP;

/**
 * Created by LILO on 2016/03/25.
 */
public class VehicleInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    public boolean isValidClaim() {
        System.out.print("VehicleInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
