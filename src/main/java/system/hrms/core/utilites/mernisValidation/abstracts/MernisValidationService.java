package system.hrms.core.utilites.mernisValidation.abstracts;

public interface MernisValidationService {
    boolean mernisCheck(String firstName, String lastName,
            String nationalIdentityNumber, String birthYear);
}
