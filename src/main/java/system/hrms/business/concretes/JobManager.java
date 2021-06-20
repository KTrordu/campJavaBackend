package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.JobService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.ErrorResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.JobDao;
import system.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{

    JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao) {
        this.jobDao = jobDao;
    }
    
    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>
                (this.jobDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(Job job) {
        if(!this.jobDao.findByJobTitle(job.getJob_title()).equals("")){
            return new ErrorResult("İş sisteme eklenmedi : Zaten mevcut.");
        }
        
        this.jobDao.save(job);
        return new SuccessResult("İş sisteme eklendi");
    }
    
}
