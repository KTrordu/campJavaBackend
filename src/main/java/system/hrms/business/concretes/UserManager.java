package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.UserService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.UserDao;
import system.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

    UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>
                (this.userDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi.");
    }
    
}
