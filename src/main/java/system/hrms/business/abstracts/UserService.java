package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.User;

public interface UserService {
    DataResult<List<User>> getAll();
    Result add(User user);
}
