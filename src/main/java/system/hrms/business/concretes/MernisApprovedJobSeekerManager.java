package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.MernisApprovedJobSeekerService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.MernisApprovedJobSeekerDao;
import system.hrms.entities.concretes.MernisApprovedJobSeeker;

@Service
public class MernisApprovedJobSeekerManager implements MernisApprovedJobSeekerService{

    MernisApprovedJobSeekerDao mernisApprovedJobSeekerDao;

    @Autowired
    public MernisApprovedJobSeekerManager(MernisApprovedJobSeekerDao mernisApprovedJobSeekerDao) {
        this.mernisApprovedJobSeekerDao = mernisApprovedJobSeekerDao;
    }
    
    @Override
    public DataResult<List<MernisApprovedJobSeeker>> getAll() {
        return new SuccessDataResult<List<MernisApprovedJobSeeker>>
                (this.mernisApprovedJobSeekerDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(MernisApprovedJobSeeker mernisApprovedJobSeeker) {
        this.mernisApprovedJobSeekerDao.save(mernisApprovedJobSeeker);
        return new SuccessResult("Mernis onaylı iş arayan eklendi.");
    }
    
}
