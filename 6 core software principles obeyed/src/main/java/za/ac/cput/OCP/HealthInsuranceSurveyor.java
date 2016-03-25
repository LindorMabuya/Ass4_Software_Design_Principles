package za.ac.cput.OCP;

/**
 * Created by LILO on 2016/03/25.
 */
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    public HealthInsuranceSurveyor() {
    }

    @Override
    public boolean isValidClaim() {
        System.out.print("HealthInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
