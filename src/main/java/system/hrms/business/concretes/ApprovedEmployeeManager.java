package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.ApprovedEmployeeService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.ApprovedEmployeeDao;
import system.hrms.entities.concretes.ApprovedEmployee;

@Service
public class ApprovedEmployeeManager implements ApprovedEmployeeService{

    ApprovedEmployeeDao approvedEmployeeDao;

    @Autowired
    public ApprovedEmployeeManager(ApprovedEmployeeDao approvedEmployeeDao) {
        this.approvedEmployeeDao = approvedEmployeeDao;
    }
    
    @Override
    public DataResult<List<ApprovedEmployee>> getAll() {
        return new SuccessDataResult<List<ApprovedEmployee>>
                (this.approvedEmployeeDao.findAll(),"Data Listelendi.");
    }

    @Override
    public Result add(ApprovedEmployee employee) {
        this.approvedEmployeeDao.save(employee);
        return new SuccessResult("Onaylanmış çalışan eklendi");
    }
    
}
