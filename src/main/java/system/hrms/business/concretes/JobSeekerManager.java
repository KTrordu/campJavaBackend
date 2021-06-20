package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.JobSeekerService;
import system.hrms.core.utilites.emailValidation.abstracts.EmailValidationService;
import system.hrms.core.utilites.mernisValidation.abstracts.MernisValidationService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.ErrorResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.JobSeekerDao;
import system.hrms.entities.concretes.JobSeeker;
import system.hrms.entities.concretes.User;

@Service
public class JobSeekerManager implements JobSeekerService{

    JobSeekerDao jobSeekerDao;
    EmailValidationService emailValidationService;
    MernisValidationService mernisValidationService;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, EmailValidationService emailValidationService, MernisValidationService mernisValidationService) {
        this.jobSeekerDao = jobSeekerDao;
        this.emailValidationService = emailValidationService;
        this.mernisValidationService = mernisValidationService;
    }
    
    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>
                (this.jobSeekerDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
        if(!this.mernisValidationService.mernisCheck(jobSeeker.getFirst_name(),
                jobSeeker.getLast_name(), jobSeeker.getNational_identity_no(), jobSeeker.getBirth_year())){
            return new ErrorResult("İş arayan sisteme eklenmedi : geçersiz kimlik.");
        }
        
        String activationCode = this.emailValidationService.generateActivationCode();
        this.emailValidationService.checkActivation(activationCode);
        
        if(!this.jobSeekerDao.findByNationalIdentityNo(jobSeeker.getNational_identity_no()).equals("")){
            return new ErrorResult("İş arayan sisteme eklenmedi : bu TC Kimlik Numarası zaten ekli.");
        }
        
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("İş arayan sisteme eklendi.");
    }
    
}
