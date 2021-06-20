package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.ApprovedEmployerService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.ApprovedEmployerDao;
import system.hrms.entities.concretes.ApprovedEmployer;

@Service
public class ApprovedEmployerManager implements ApprovedEmployerService{

    ApprovedEmployerDao approvedEmployerDao;

    @Autowired
    public ApprovedEmployerManager(ApprovedEmployerDao approvedEmployerDao) {
        this.approvedEmployerDao = approvedEmployerDao;
    }
    
    @Override
    public DataResult<List<ApprovedEmployer>> getAll() {
        return new SuccessDataResult<List<ApprovedEmployer>>
                (this.approvedEmployerDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(ApprovedEmployer approvedEmployer) {
        this.approvedEmployerDao.save(approvedEmployer);
        return new SuccessResult("Onaylanmış işveren eklendi.");
    }
    
}
