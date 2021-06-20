package system.hrms.core.utilites.emailValidation.abstracts;

public interface EmailValidationService {
    
    String generateActivationCode();
    String sendActivationEmail(String email);
    Boolean checkActivation(String activationCode);
}
