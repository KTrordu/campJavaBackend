package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.ApprovedEmployer;

public interface ApprovedEmployerService {
    DataResult<List<ApprovedEmployer>> getAll();
    Result add(ApprovedEmployer approvedEmployer);
}
