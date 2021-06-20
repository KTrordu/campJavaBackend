package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.Job;

public interface JobService {
    DataResult<List<Job>> getAll();
    Result add(Job job);
}
