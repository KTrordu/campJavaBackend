package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.ApprovedEmployee;

public interface ApprovedEmployeeService {
    DataResult<List<ApprovedEmployee>> getAll();
    Result add (ApprovedEmployee employee);
}
