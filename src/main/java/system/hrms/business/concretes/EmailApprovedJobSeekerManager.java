package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.EmailApprovedJobSeekerService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.EmailApprovedJobSeekerDao;
import system.hrms.entities.concretes.EmailApprovedJobSeeker;

@Service
public class EmailApprovedJobSeekerManager implements EmailApprovedJobSeekerService{

    private EmailApprovedJobSeekerDao emailApprovedJobSeekerDao;

    @Autowired
    public EmailApprovedJobSeekerManager(EmailApprovedJobSeekerDao emailApprovedJobSeekerDao) {
        this.emailApprovedJobSeekerDao = emailApprovedJobSeekerDao;
    }
    
    @Override
    public DataResult<List<EmailApprovedJobSeeker>> getAll() {
        return new SuccessDataResult<List<EmailApprovedJobSeeker>>
                (this.emailApprovedJobSeekerDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(EmailApprovedJobSeeker emailApprovedJobSeeker) {
        this.emailApprovedJobSeekerDao.save(emailApprovedJobSeeker);
        return new SuccessResult("E-posta onaylı iş arayan eklendi.");
    }
    
}
