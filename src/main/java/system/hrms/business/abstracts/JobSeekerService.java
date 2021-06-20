package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
    DataResult<List<JobSeeker>> getAll();
    Result add(JobSeeker jobSeeker);
}
