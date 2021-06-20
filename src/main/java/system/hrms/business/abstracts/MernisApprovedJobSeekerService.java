package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.MernisApprovedJobSeeker;

public interface MernisApprovedJobSeekerService {
    DataResult<List<MernisApprovedJobSeeker>> getAll();
    Result add(MernisApprovedJobSeeker mernisApprovedJobSeeker);
}
