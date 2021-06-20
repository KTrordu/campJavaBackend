package system.hrms.core.utilites.mernisValidation.concretes;

import system.hrms.core.utilites.mernisValidation.abstracts.MernisValidationService;

public class MernisValidationManager implements MernisValidationService{

    @Override
    public boolean mernisCheck(String firstName, String lastName, String nationalIdentityNumber, String birthYear) {
        return nationalIdentityNumber.length() == 11; 
    }
    
}
