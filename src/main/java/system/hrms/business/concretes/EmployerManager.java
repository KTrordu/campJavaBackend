package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.EmployerService;
import system.hrms.core.utilites.emailValidation.abstracts.EmailValidationService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.EmployerDao;
import system.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

    EmployerDao employerDao;
    EmailValidationService emailValidationService;

    @Autowired
    public EmployerManager(EmployerDao employerDao,EmailValidationService emailValidationService) {
        this.employerDao = employerDao;
        this.emailValidationService = emailValidationService;
    }
    
    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>
                (this.employerDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(Employer employer) {
        String activationCode = this.emailValidationService.generateActivationCode();
        this.emailValidationService.checkActivation(activationCode);
        
        return new SuccessResult("İşveren sisteme eklendi.");
    }
    
}
