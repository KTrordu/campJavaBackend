package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.Employer;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
}
