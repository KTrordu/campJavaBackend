package system.hrms.core.utilites.emailValidation.concretes;

import java.util.UUID;
import system.hrms.core.utilites.emailValidation.abstracts.EmailValidationService;

public class EmailValidationManager implements EmailValidationService{

    private String activationCode;
    
    @Override
    public String generateActivationCode() {
        UUID activationCodeUUID = UUID.randomUUID();
        this.activationCode = activationCodeUUID.toString();
        return this.activationCode;
    }

    @Override
    public String sendActivationEmail(String email) {
        String activationCodeToBeSent = generateActivationCode();
        
        return activationCodeToBeSent + ", aktivasyon kodu olarak " 
                + email + " adresine gönderildi.";
    }

    @Override
    public Boolean checkActivation(String activationCode) {
        return activationCode.equals(this.activationCode);
    }
    
}
