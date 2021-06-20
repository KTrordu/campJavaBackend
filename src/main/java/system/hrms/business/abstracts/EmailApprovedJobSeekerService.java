package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.EmailApprovedJobSeeker;

public interface EmailApprovedJobSeekerService {
    DataResult<List<EmailApprovedJobSeeker>> getAll();
    Result add(EmailApprovedJobSeeker emailApprovedJobSeeker);
}
